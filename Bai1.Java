import java.util.Scanner;

public class Bai1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

//        Nhập chuỗi văn bản từ ng dùng
        System.out.println("Nhập vào một chuỗi văn bản");
        String text = scanner.nextLine();

//        Nhập từ cần tìm
        System.out.println("Nhập từ cần tìm: ");
        String input = scanner.nextLine();

//        Tìm vị trí đầu tiên của từ trong chuoi
        int location = text.indexOf(input); // tìm từ trả về

//        Ktra và tb kq
        if (location != -1){ // trả về -1 nếu k tìm thấy kq
            System.out.println("Từ \"" + input + "\" được tìm thấy ở vị trí: " + location);
        }else {
            System.out.println("Không tìm thấy từ cần tìm!");
        }
        scanner.close();
    }
}
