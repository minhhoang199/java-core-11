package product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ProductService {
    private List<Product> products;

    public ProductService() {
        this.products = new ArrayList<>();
        products.add(new Product(1, "Iphone 13 Pro Max", 30_000_000, "Apple", 2));
        products.add(new Product(2, "Samsung Galaxy Z Fold3", 41_000_000, "Samsung", 3));
        products.add(new Product(3, "IPhone 11", 12_000_000, "Apple", 1));
        products.add(new Product(4, "OPPO Find X3 Pro", 19_500_000, "Oppo", 5));
        products.add(new Product(5, "Xiaomi 11T", 9_500_000, "Xiaomi", 7));
        products.add(new Product(6, "Vivo V21", 23_500_000, "Vivo", 6));
    }

    //In ra thông tin các sản phẩm trong giỏ hàng theo cấu trúc sau
    //ID - Tên - Giá - Thương Hiệu - Số lượng
    //Ví dụ : 1- OPPO Find X3 Pro - 19500000 - OPPO - 3
    public void print() {
        products.stream().forEach(Product::printInfo);
    }

    //
    //Tính tổng tiền tất cả sản phẩm trong giỏ hàng
    //Tổng tiền mỗi sản phẩm = price * count
    //
    public int getTotalMoney() {
        return products.stream()
                .map(product -> product.getPrice() * product.getCount())
                .reduce(0, (p1, p2) -> p1 + p2);
    }

    //Tìm các sản phẩm của thuơng hiệu “Apple”
    //
    public List<Product> getProductByBrand(String brandName) {
        return products
                .stream()
                .filter(product -> product.getBrand().equals(brandName))
                .collect(Collectors.toList());
    }
    //Tìm các sản phẩm có giá > 20000000
    //

    public List<Product> getProductByPrice(int price) {
        return products
                .stream()
                .filter(product -> product.getPrice() > price)
                .collect(Collectors.toList());
    }

    //Tìm các sản phẩm có chữ “pro” trong tên (Không phân biệt hoa thường)
    //
    public List<Product> getProductContain(String str) {
        return products
                .stream()
                .filter(product -> product.getName().contains(str))
                .collect(Collectors.toList());
    }

    //Thêm 1 sản phẩm bất kỳ vào trong mảng product
    //
    public Product addNewProduct(Product product) {
        products.add(product);
        return product;
    }

    //Xóa tất cả sản phẩm của thương hiệu “Samsung” trong giỏ hàng
    //
    public List<Product> deleteProduct(String brand) {
        return products.stream().filter(n -> !n.getBrand().equals(brand)).collect(Collectors.toList());
    }

    //Sắp xếp giỏ hàng theo price tăng dần
    //
    public List<Product> sortByPrice() {
        return products.stream().sorted(Comparator.comparing(Product::getPrice).reversed()).collect(Collectors.toList());
    }

    //Sắp xếp giỏ hàng theo count giảm dần
    //
    public List<Product> sortByCount() {
        return products.stream().sorted(Comparator.comparing(Product::getCount)).collect(Collectors.toList());
    }

    //Lấy ra 2 sản phẩm bất kỳ trong giỏ hàng
    public void getRandom2Product() {
        Random rd = new Random();
        int rd1 = rd.nextInt(products.size()) + 1;
        products.stream().skip(rd1 - 1).limit(1).forEach(System.out::println);

        int rd2 = products.size();
        while (rd2 == rd1) {
            rd2 = rd.nextInt(products.size()) + 1;
        }
        products.stream().skip(rd2 - 1).limit(1).forEach(System.out::println);
    }
}
