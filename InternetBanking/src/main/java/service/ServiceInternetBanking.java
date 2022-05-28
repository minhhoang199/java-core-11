package service;

import model.InvalidParameter;
import model.NotFoundException;
import model.TransactionHistory;
import model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ServiceInternetBanking {
    List<User> userList;
    List<TransactionHistory> transactionHistoryList;

    public ServiceInternetBanking() {
        userList = new ArrayList<>();
        transactionHistoryList = new ArrayList<>();

        userList.add(new User(1, "1234567890", "acc1", "minh1234", 50000));
        userList.add(new User(2, "1234567891", "acc2", "minh1234", 100000));
        userList.add(new User(3, "1234567892", "acc3", "minh1234", 2000000));
        userList.add(new User(4, "1234567893", "acc4", "minh1234", 500000));
    }

    private boolean checkPass(String passWord) {
        String pattern = "^[a-zA-Z1-9]{8,15}$";
        Pattern p = Pattern.compile(pattern);
        return p.matcher(passWord).find();
    }

    private boolean checkPhone(String phone) {
        String pattern = "^[1-9]{9,11}$";
        Pattern p = Pattern.compile(pattern);
        return p.matcher(phone).find();
    }

    public User register(String newPhone, String pass, String newUserName) {
        if (!checkPass(newPhone)) throw new InvalidParameter("Password have 8 to 15 characters");
        if (!userList.stream()
                .filter(a -> a.getPhone().equals(newPhone))
                .collect(Collectors.toList())
                .isEmpty()) throw new InvalidParameter("Duplicate phone");
        if (!checkPhone(newPhone)) throw new InvalidParameter("Invalid phone number");
        if (newUserName.trim().equals("")) throw new InvalidParameter("User name not be empty");

        int id;
        if (userList.isEmpty()) {
            id = 1;
        } else {
            id = userList.stream()
                    .max((a, b) -> a.getId() - b.getId())
                    .get()
                    .getId() + 1;
        }

        User newUser = new User(id, newPhone, newUserName, pass, 0);
        userList.add(newUser);
        System.out.println("Register success");
        return newUser;
    }

    private User getUserByPhone(String phone) {
        Optional<User> optionalUser = userList.stream()
                .filter(a -> a.getPhone().equals(phone))
                .findFirst();
        return optionalUser.orElseThrow(() -> {
            throw new NotFoundException("Phone does not exist");
        });
    }

    public User login(String phone, String passWord) {
        if (userList.isEmpty()) throw new RuntimeException("List is empty");
        User loginUser = getUserByPhone(phone);

        if (loginUser.getPassWord().equals(passWord)) return loginUser;
        else {
            System.out.println("Password is not correct");
            return null;
        }
    }

    public TransactionHistory transferMoney(User sendingUser, String receivingPhone, double money, String content, LocalDate date) {
        if (!userList.contains(sendingUser)) throw new NotFoundException("Sending user do not exist");
        User receivingUser = getUserByPhone(receivingPhone);
        if (sendingUser.getBalance() - money < 50000) throw new RuntimeException("Balance cannot lower than 50000");
        if (money <= 0) throw new InvalidParameter("Money can not be negative or equal 0");

        sendingUser.setBalance(sendingUser.getBalance() - money);
        receivingUser.setBalance(receivingUser.getBalance() + money);

        int id;
        if (transactionHistoryList.isEmpty()) {
            id = 1;
        } else {
            id = transactionHistoryList.stream()
                    .max((a, b) -> a.getId() - b.getId())
                    .get()
                    .getId() + 1;
        }
        System.out.println("Transfer success");
        TransactionHistory newTransactionHistory = new TransactionHistory(id, sendingUser.getId(), content, receivingUser.getAccount(), money, date);

        transactionHistoryList.add(newTransactionHistory);
        return newTransactionHistory;
    }

    public void getBalance(User user) {
        if (!userList.contains(user)) throw new NotFoundException("User do not exist");
        System.out.println(user.getBalance());
    }

    public List<TransactionHistory> getTransactionHistoryList(User user) {
        if (transactionHistoryList.isEmpty()) throw new NotFoundException("List transaction history is empty");
        return transactionHistoryList.stream().filter(a -> a.getUserId() == user.getId()).collect(Collectors.toList());
    }
}
