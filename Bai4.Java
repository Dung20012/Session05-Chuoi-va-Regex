import java.util.Scanner;

public class Bai4 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

//        Nhập một chuỗi bất kỳ từ bàn phím
        System.out.println("Nhập địa chỉ email: ");
        String email = scanner.nextLine();

//      Sử dụng biểu thức chính quy để ktra định dạng email
        String emailRegex = "^[a-zA-Z0-9._]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,6})+$";

//        Ktra định dạng email
        if (email.matches(emailRegex)){
            System.out.println("Email hợp lệ!");
        }else {
            System.out.println("Email không hợp lệ");
        }
        scanner.close();
    }
}
