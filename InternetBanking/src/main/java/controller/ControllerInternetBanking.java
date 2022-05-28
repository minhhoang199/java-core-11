package controller;

import model.User;
import service.ServiceInternetBanking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ControllerInternetBanking {
    ServiceInternetBanking sib = new ServiceInternetBanking();

    public void printSubMenu() {
        System.out.println("*********SubMenu***********\n" +
                "3. Truy vấn số dư tài khoản\n" +
                "4. Chuyển tiền\n" +
                "5. Xem lịch sử giao dịch\n" +
                "6. Thoát");
    }

    public void printMenu() {
        System.out.println("*********Menu***********\n" +
                "1. Đăng nhập\n" +
                "2. Đăng ký\n" +
                "0. Thoát");
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        String option = "";

        do {
            printMenu();
            option = sc.nextLine();

            switch (option) {
                case "1": {
                    System.out.println("Input phone:");
                    String phone = sc.nextLine();

                    System.out.println("Input passWord:");
                    String pass = sc.nextLine();
                    try {
                        User loginUser = sib.login(phone, pass);
                        if (loginUser == null){
                            break;
                        }
                        String subOption = "";
                        do {
                            printSubMenu();

                            subOption = sc.nextLine();

                            switch (subOption) {
                                case "3": {
                                    try {
                                        System.out.print("Balance is: ");
                                        sib.getBalance(loginUser);
                                    } catch (RuntimeException e) {
                                        System.out.println(e.getMessage());
                                    }
                                    break;
                                }

                                case "4": {
                                    try {
                                        System.out.println("Input receiving phone:");
                                        String receivingPhone = sc.nextLine();

                                        System.out.println("Input money");
                                        double money = Double.parseDouble(sc.nextLine());

                                        System.out.println("Input content");
                                        String content = sc.nextLine();
                                        sib.transferMoney(loginUser, receivingPhone, money, content, LocalDate.now());
                                    } catch (RuntimeException e) {
                                        System.out.println(e.getMessage());
                                    }
                                    break;
                                }

                                case "5": {
                                    try {
                                        sib.getTransactionHistoryList(loginUser).forEach(System.out::println);
                                    } catch (RuntimeException e) {
                                        System.out.println(e.getMessage());
                                    }
                                    break;
                                }
                            }
                        } while (!subOption.equals("6"));
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }

                case "2": {
                    System.out.println("Input new phone");
                    String phone = sc.nextLine();

                    System.out.println("Input pass");
                    String pass = sc.nextLine();

                    System.out.println("Input userName");
                    String userName = sc.nextLine();

                    try {
                        User newUser = sib.register(phone, pass, userName);
                        System.out.println(newUser);
                    }catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }

            }
        } while (!option.equals("0"));

    }
}
