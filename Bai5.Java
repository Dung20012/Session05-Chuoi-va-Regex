public class Bai5 {
    public static void main(String[] args) {
        int n = 17000; // số lần lặp
        String str = "World";

//        Với String
        long start = System.currentTimeMillis(); // lấy thời gian thực tính theo millis giây
        String str1 = "Hello";
        for (int i = 0; i < n; i++) {
            str1 += str;
        }
        long end = System.currentTimeMillis();
        System.out.println("Thời gian với String: " + (end - start) + " ms");

//        Với StringBuilder
        long startBuilder = System.currentTimeMillis();
        StringBuilder sf = new StringBuilder("Hello");
        for (int i =0; i < n; i++){
            sf.append(str); // thêm phương thức dòng cuối cùng
        }
        long endBuilder = System.currentTimeMillis();
        System.out.println("Thời gian với StringBuilder: " + (endBuilder - startBuilder) + " ms ");

//        Với StringBuffer
        long startBuffer = System.currentTimeMillis();
        StringBuffer sc = new StringBuffer("Hello");
        for (int i = 0; i < n; i++){
            sc.append(str);
        }
        long endBuffer = System.currentTimeMillis();
        System.out.println("Thời gian với StringBuffer: " + (endBuffer - startBuffer) + " ms ");

//        Nhận xét
        System.out.println("\n Nhận xét:");
        System.out.println("- String: Không hiệu quả chi phép nối chuỗi nhiều lần do tạo ra nhiều đối tượng mới.");
        System.out.println("- StringBuilder: Hiệu quả và nhanh chóng, thích hợp với nhiều thao tác nối chuỗi trong 1 luồng ");
        System.out.println("- StringBuffer: Tương tự như StringBuilder nhưng an toàn với đa luồng, có thể chậm hơn một chút do đồng bộ hóa  ");
    }
}
