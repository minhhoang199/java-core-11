package controller;

import model.Product;
import service.ProductService;

import java.util.Arrays;
import java.util.Scanner;

public class ProductController {
    ProductService productService = new ProductService();

    public ProductController() {
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("***********Menu**********");
            System.out.println("1. Xem danh sách sản phẩm");
            System.out.println("2. Tìm sản phẩm theo tên");
            System.out.println("3. Tìm sản phẩm theo id");
            System.out.println("4. Tìm các sản phẩn có số lượng dưới 5");
            System.out.println("5. Tìm sản phẩm theo mức giá");
            System.out.println("6. Thêm mới sản phẩm");
            System.out.println("0. Thoát");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1: {
                    productService.printListInfo();
                    break;
                }
                case 2: {
                    System.out.println("Input name:");
                    String name = sc.nextLine();

                    if (productService.findByName(name).isEmpty()){
                        System.out.println("There is not product contain " + name);
                        break;
                    }
                    System.out.println("List product contain " + name);
                    for (Product p : productService.findByName(name)) {
                        System.out.println(p);
                    }
                    break;
                }
                case 3: {
                    System.out.println("Input id:");
                    int id = Integer.parseInt(sc.nextLine());
                    Product selectedProduct = productService.findByID(id);

                    if (selectedProduct == null) {
                        System.out.println("There is not product have id = " + id);
                        break;
                    } else {
                        System.out.println("Product have id = " + id + " is: ");
                        System.out.println(selectedProduct);

                        //submenu
                        int optionSubMenu3 = 0;

                        do {
                            System.out.println("***********SUB Menu 3**********");
                            System.out.println("3.1 Xóa sản phẩm(Input 1)");
                            System.out.println("3.2 Cập nhật số lượng sản phẩm(Input 1)");
                            System.out.println("0. Thoát");

                            optionSubMenu3 = Integer.parseInt(sc.nextLine());

                            switch (optionSubMenu3) {
                                case 1: {
                                    if (selectedProduct == null) {
                                        System.out.println("There is no product with id = " + id + " in this list");
                                        break;
                                    } else {
                                        System.out.println("Product " + selectedProduct + "has been delete");
                                        productService.deleteProduct(id);
                                        break;
                                    }
                                }
                                case 2: {
                                    System.out.println("Number of products is: " + productService.getProductArrayList().size());
                                }
                            }
                        } while (optionSubMenu3 != 0);
                    }
                    break;
                }
                case 4: {
//                    System.out.println("Input quantity");
//                    int quantity = Integer.parseInt(sc.nextLine());
                    if (productService.findByQuantity(5).isEmpty()) {
                        System.out.println("There is not product have quantity smaller than 5");
                        break;
                    } else {
                        System.out.println("List of product have quantity smaller than 5");
                        for (Product p : productService.findByQuantity(5)) {
                            System.out.println(p);
                        }
                    }
                    break;
                }
                case 5: {
                    useSubmenu5();
                    break;
                }
                case 6: {
                    productService.add();
                    break;
                }


            }

        } while (option != 0);
    }

    private void useSubmenu5() {
        Scanner sc = new Scanner(System.in);

        int optionSubMenu5 = 0;

        do {
            System.out.println("***********SUB Menu 5**********");
            System.out.println("Chọn mức giá: ");
            System.out.println("5.1 Dưới 50.000(Input 1)");
            System.out.println("5.2 Từ 50.000 đến dưới 100.000(Input 2)");
            System.out.println("5.1 Từ 100.000 trở lên(Input 1)");
            System.out.println("0. Thoát");

            optionSubMenu5 = Integer.parseInt(sc.nextLine());

            switch (optionSubMenu5) {
                case 1: {
//                    System.out.println("Input a price");
//                    double price = sc.nextDouble();

                    if (productService.findLowerCase(50000).isEmpty()) {
                        System.out.println("There is not product have price smaller than 50000");
                        break;
                    } else {
                        System.out.println("List of product have price smaller than 50000");
                        for (Product p : productService.findLowerCase(50000)) {
                            System.out.println(p);
                        }
                    }
                    break;
                }

                case 2: {
//                    System.out.println("Input max");
//                    double max = sc.nextDouble();
//
//                    System.out.println("Input min");
//                    double min = sc.nextDouble();
                    if (productService.findBetweenCase(100000, 50000).isEmpty()) {
                        System.out.println("There is not product have price smaller than 100000 and higher than 50000");
                        break;
                    } else {
                        System.out.println("List of product have price smaller than 100000 and higher than 50000 is");
                        for (Product p : productService.findBetweenCase(100000, 50000)) {
                            System.out.println(p);
                        }
                    }
                    break;
                }

                case 3: {
//                    System.out.println("Input a price");
//                    double price = Double.parseDouble(sc.nextLine());
                    if (productService.findHigherCase(100000).isEmpty()) {
                        System.out.println("There is not product have price higher and equal than 100000");
                        break;
                    } else {
                        System.out.println("List of product have price higher and equal than 100000");
                        for (Product p : productService.findHigherCase(100000)) {
                            System.out.println(p);
                        }
                    }
                    break;
                }

            }
        } while (optionSubMenu5 != 0);
    }

}
