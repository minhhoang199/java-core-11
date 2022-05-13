package service;

import model.Product;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ProductService {
    private ArrayList<Product> productArrayList;

    public ProductService() {
        init();
    }

    private void init() {
        this.productArrayList = new ArrayList<>();
        productArrayList.add(new Product(1, 5, "computer", "computer 1", 150000));
        productArrayList.add(new Product(2, 1, "computer 2", "computer 2", 250000));
        productArrayList.add(new Product(3, 25, "laptop1", "laptop Dell", 175000));
        productArrayList.add(new Product(4, 15, "laptop2", "laptop MAC", 40000));
        productArrayList.add(new Product(5, 3, "mouse", "mouse 1", 130000));
    }

    public Product add() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("Input name:");
        String name = sc.nextLine();

        System.out.println("Input description:");
        String description = sc.nextLine();

        System.out.println("Input quantity:");
        int quantity = Integer.parseInt(sc.nextLine());

        System.out.println("Input price:");
        double price = Double.parseDouble(sc.nextLine());

        //id
        int id = productArrayList.get(productArrayList.size() - 1).getId() + 1;

        Product newProduct = new Product(id, quantity, name, description, price);
        this.productArrayList.add(newProduct);

        return newProduct;
    }

    //In ra danh sách sản phẩm
    public void printListInfo() {
        for (Product p : productArrayList) {
            System.out.println(p.toString());
        }
    }

    //Tim theo name
    public ArrayList<Product> findByName(String name) {
        ArrayList<Product> list = new ArrayList<>();

        if (this.productArrayList.isEmpty()) {
            System.out.println("List is empty");
        }
        for (Product p : productArrayList) {
            if (p.getName().contains(name)) {
                list.add(p);
            }
        }
        return list;
    }

    //tim theo id
    public Product findByID(int id) {
        if (this.productArrayList.isEmpty()) {
            System.out.println("List is empty");
        }
        for (Product p : productArrayList) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    //xóa product theo id
    //Vì id không trùng nhau nên ko cần sử dụng iterator
    public void deleteProduct(int id) {
        productArrayList.remove(findByID(id));
    }

    //Tìm theo quantity
    public ArrayList<Product> findByQuantity(int quantity){
        ArrayList<Product> list = new ArrayList<>();

        if (this.productArrayList.isEmpty()) {
            System.out.println("List is empty");
        }
        for (Product p : productArrayList) {
            if (p.getQuantity() < quantity) {
                list.add(p);
            }
        }
        return list;
    }

    //Tìm theo giá
    public ArrayList<Product> findLowerCase(double price){
        ArrayList<Product> list = new ArrayList<>();

        if (this.productArrayList.isEmpty()) {
            System.out.println("List is empty");
        }
        for (Product p : productArrayList) {
            if (p.getPrice() < price) {
                list.add(p);
            }
        }
        return list;
    }

    public ArrayList<Product> findHigherCase(double price){
        ArrayList<Product> list = new ArrayList<>();

        if (this.productArrayList.isEmpty()) {
            System.out.println("List is empty");
        }
        for (Product p : productArrayList) {
            if (p.getPrice() >= price) {
                list.add(p);
            }
        }
        return list;
    }

    public ArrayList<Product> findBetweenCase(double max, double min){
        ArrayList<Product> list = new ArrayList<>();

        if (this.productArrayList.isEmpty()) {
            System.out.println("List is empty");
        }
        for (Product p : productArrayList) {
            if (p.getPrice() >= min && p.getPrice() < max) {
                list.add(p);
            }
        }
        return list;
    }

    public void setProductArrayList(ArrayList<Product> productArrayList) {
        this.productArrayList = productArrayList;
    }

    public ArrayList<Product> getProductArrayList() {
        return productArrayList;
    }
}
