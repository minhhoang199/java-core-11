package controller;

import com.sun.source.tree.IfTree;
import model.User;
import service.UserService;

import java.util.Scanner;

public class UserController {
    UserService userService = new UserService();

    private void printMenu() {
        System.out.println("*****Menu********");
        System.out.println("1. Đăng nhập\n" +
                "2. Quên mật khẩu\n" +
                "3. Đăng ký\n" +
                "0. Thoát");
    }

    private void printSubMenu() {
        System.out.println("*****Sub-Menu********");
        System.out.println("1. Thay đổi username\n" +
                "2. Thay đổi email (Không được trùng với email của user khác trong List)\n" +
                "3. Thay đổi mật khẩu\n" +
                "4. Đăng xuất (Sau khi đăng xuất quay về mục yêu cầu đăng nhập hoặc đăng ký)\n" +
                "5. Thoát chương trình");
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        String option = "";

        do {
            printMenu();
            option = sc.nextLine();

            switch (option) {
                case "1": {
                    System.out.println("Input email: ");
                    String email = sc.nextLine();

                    System.out.println("Input password: ");
                    String pass = sc.nextLine();

                    try {
                        User loginUser = userService.login(email, pass);
                        if (loginUser == null) {
                            System.out.println("Tài khoản hoặc mật khẩu không chính xác");
                        } else {
                            System.out.printf("Chào mừng %s, bạn có thể thực hiện các công việc sau:", loginUser.getUserName());
                            String subOption = "";
                            do {
                                printSubMenu();
                                subOption = sc.nextLine();

                                switch (subOption) {
                                    case "1": {
                                        System.out.println("Input new user name");
                                        String newUserName = sc.nextLine();

                                        try {
                                            User newUser = userService.changeUserName(loginUser, newUserName);
                                            if (newUser != null) {
                                                loginUser = newUser;
                                            }
                                            System.out.println(loginUser);
                                        } catch (RuntimeException e) {
                                            System.out.println(e.getMessage());
                                        }
                                        break;
                                    }
                                    case "2": {
                                        System.out.println("Input new email");
                                        String newEmail = sc.nextLine();

                                        try {
                                            User newUser = userService.changeEmail(loginUser, newEmail);
                                            if (newUser != null) {
                                                loginUser = newUser;
                                            }
                                            System.out.println(loginUser);
                                        } catch (RuntimeException e) {
                                            System.out.println(e.getMessage());
                                        }
                                        break;
                                    }
                                    case "3": {
                                        System.out.println("Input new password");
                                        String newPass = sc.nextLine();

                                        try {
                                            User newUser = userService.changePass(loginUser, newPass);
                                            if (newUser != null) {
                                                loginUser = newUser;
                                            }
                                            System.out.println(loginUser);
                                        } catch (RuntimeException e) {
                                            System.out.println(e.getMessage());
                                        }
                                        break;
                                    }
                                    case "5": {
                                        option = "0";
                                        subOption = "4";
                                        break;
                                    }
                                }

                            } while (!subOption.equals("4"));
                        }
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case "2": {
                    System.out.println("Input your email:");
                    String email = sc.nextLine();

                    try {
                        User currentUser = userService.checkEmailExist(email);

                        if (currentUser != null) {
                            //Change pass
                            System.out.println("Input new password");
                            String newPass = sc.nextLine();

                            System.out.println(userService.changePass(currentUser, newPass));

                            //login
                            option = "1";
                        } else {
                            System.out.println("User do not exist");
                        }
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case "3": {
                    System.out.println("Input email");
                    String newEmail = sc.nextLine();

                    System.out.println("Input password");
                    String newPass = sc.nextLine();

                    System.out.println("Input user name");
                    String newUserName = sc.nextLine();

                    try {
                        User newUser = userService.createUser(newEmail, newPass, newUserName);
                        if (newUser != null) {
                            System.out.println("New user: " + newUser);
                        }
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
            }
        } while (!option.equals("0"));

    }
}
