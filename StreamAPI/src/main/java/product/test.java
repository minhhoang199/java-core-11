package product;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        //// Tạo ra danh sách sản phẩm
        List<Product> products = new ArrayList<>();


        ProductService productService = new ProductService();

        //1. print


        //2. tinh tong tien
        System.out.println(productService.getTotalMoney());

        //3. tim theo brand
        productService.getProductByBrand("Apple").forEach(System.out::println);
        System.out.println("--------------");
        //4. tim price > 20 cu
        productService.getProductByPrice(20000000).forEach(System.out::println);
        System.out.println("--------------");
        productService.addNewProduct(new Product(1, "Iphone 13 Pro Max", 30_000_000, "Apple", 2));
        productService.print();
        System.out.println("--------------");
        productService.getProductByBrand("Apple").forEach(System.out::println);
        System.out.println("--------------");
        productService.getRandom2Product();
        System.out.println("--------------");
        productService.deleteProduct("Samsung").forEach(System.out::println);
        System.out.println("--------------");
        productService.sortByPrice().forEach(System.out::println);
        System.out.println("--------------");
        productService.sortByCount().forEach(System.out::println);
        System.out.println("--------------");

        productService.print();


    }
}
