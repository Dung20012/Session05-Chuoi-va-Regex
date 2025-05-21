import java.util.Scanner;

public class Bai3 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

//        Nhập chuỗi từ người dùng
        System.out.println("Nhập vào một chuỗi: ");
        String input = scanner.nextLine();

//        Thay thế tất cả các ký từ từ 0-9 bằng *
        String output = input.replaceAll("[0-9]", "*"); // thay thế chuỗi bằng chuỗi khác
        System.out.println("Chuỗi sau khi thay thế: " + output);

        scanner.close();
    }
}
