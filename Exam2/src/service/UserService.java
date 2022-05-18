package service;

import model.User;
import model.customException.AlreadyExistException;
import model.customException.InvalidValueException;

import javax.management.InstanceAlreadyExistsException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserService {
    private LinkedList<User> usersList;

    public UserService() {
        this.usersList = new LinkedList<>();
    }

    //validate email
    private boolean validateEmail(String email) {
        String regex = "^[a-zA-Z][A-Za-z0-9+_.-]+@([a-zA-Z]+\\.[a-zA-Z]+|[a-zA-Z]+\\.[a-zA-Z]{2,}\\.[a-zA-Z]{2,})$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }


    //Validate password
    private boolean validatePassword(String pass) {
        String regex = "^[A-Za-z0-9]{7,16}$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(pass);
        return matcher.matches();
    }

    //Login method
    public User login(String email, String pass) {
        if (!validateEmail(email)) throw new InvalidValueException("Incorrect email format");
        if (!validatePassword(pass)) throw new InvalidValueException("Incorrect password format");

        if (usersList.isEmpty()) {
            return null;
        }

        User loginUser = null;
        //Check email exist
        for (User user : usersList) {
            if (user.getEmail().equals(email)) {
                loginUser = user;
                break;
            }
        }

        //Check password is correct
        if (loginUser != null) {
            if (loginUser.getPassWord().equals(pass)) {
                return loginUser;
            }
        }
        return null;
    }

    //Thay đổi username
    //Thay đổi email (Không được trùng với email của user khác trong List)
    //Thay đổi mật khẩu
    //Đăng xuất (Sau khi đăng xuất quay về mục yêu cầu đăng nhập hoặc đăng ký)
    //Thoát chương trình
    //Quên mật khẩu

    //Change user name
    public User changeUserName(User user, String newUserName) {
        if (user == null) throw new NullPointerException();
        if (newUserName.trim().equals("")) throw new InvalidValueException("User name not to be empty");
        //Check user exist
        User currentUser = null;
        for (User us : usersList) {
            if (us.equals(user)) {
                us.setUserName(newUserName);
                currentUser = us;
                break;
            }
        }
        return currentUser;
    }

    //change email
    public User changeEmail(User user, String newEmail) {
        if (user == null) throw new NullPointerException();
        if (!validateEmail(newEmail)) throw new InvalidValueException("Incorrect email format");
        //check email exist
//        for (User us : usersList) { us.getEmail().equals(newEmail)
            if (checkEmailExist(newEmail) != null) throw new AlreadyExistException("Email already exist");


        //Check user exist
        User currentUser = null;
        for (User us : usersList) {
            if (us.equals(user)) {
                us.setEmail(newEmail);
                currentUser = us;
                break;
            }
        }
        return currentUser;
    }

    //change pass
    public User changePass(User user, String newPass) {
        if (user == null) throw new NullPointerException();
        if (!validatePassword(newPass)) throw new InvalidValueException("Incorrect password format");

        User currentUser = null;
        for (User us : usersList) {
            if (us.equals(user)) {
                us.setPassWord(newPass);
                currentUser = us;
                break;
            }
        }
        return currentUser;
    }

    //forgot pass
    public User checkEmailExist(String email){
        if (!validateEmail(email)) throw new InvalidValueException("Incorrect email format");
        for (User us : usersList) {
            if (us.getEmail().equals(email)) {
                return us;
            }
        }
        return null;
    }

    //create user
    public User createUser(String email, String passWord, String userName) {
        if (!validateEmail(email)) throw new InvalidValueException("Incorrect email format");
        if (!validatePassword(passWord)) throw new InvalidValueException("Incorrect password format");
        if (userName.trim().equals("")) throw new InvalidValueException("User name not to be empty");

        //check email exist
        if(checkEmailExist(email) != null)throw new AlreadyExistException("Email already exist");

        User newUser = new User(email, userName, passWord);
        usersList.add(newUser);
        return newUser;
    }
}
