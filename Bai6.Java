import java.util.Scanner;

public class Bai6 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

//        Nhập 1 chuỗi các số, chuỗi, kí tự từ bàn phím
        System.out.println("Nhập mật khẩu: ");
        String password = scanner.nextLine();

//        Sử dụng biểu thức chính quy để ktra mật khẩu
        String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";

//        Ktra định dạng mật khẩu
        if (password.matches(passwordRegex)){
            System.out.println("Mật khẩu hợp lệ!");
        }else {
            System.out.println("Mật khẩu không hợp lệ!");
        }
    }
}
