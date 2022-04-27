import java.util.Locale;
import java.util.Scanner;

public class bai1 {public static String formatName(String str) {
    //Loại bỏ khoảng trắng và đưa về dang chữ thường
    str = str.trim().toLowerCase(Locale.ROOT);
    str = str.replaceAll("\\s+", " ");
    //Cắt chuỗi thành các index tron 1 mảng
    String[] words = str.split(" ");
    String newStr = "";
    //Viết hoa ký tự đầu tiên của mỗi index rồi nối lại
    for (int i = 0; i < words.length; i++) {
        if (i != 0){
            newStr += " ";//Nếu không phải index đầu tiên, công 1 khoảng trắng trước khi nối
        }
        newStr += String.valueOf(words[i].charAt(0)).toUpperCase(Locale.ROOT) + words[i].substring(1);
    }
    return newStr;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(formatName(name));
    }
}
