public class Bai2 {
    public static void main (String[] args){
        StringBuilder str1 = new StringBuilder("Hello, Java World!");

//      In chuỗi ban đầu
        System.out.println("Chuỗi ban đầu: " + str1);

//        Xóa các ký tự từ 5 - 9
        str1.delete(5,11);
        System.out.println("Chuỗi sau khi xóa: " + str1);

//        Thay thế World bằng Universe
        int start = str1.indexOf("World!");
        int end = start + "World!".length();

        if (start != -1){
            str1.replace(start, end, "Universe");
        }
        System.out.println("Chuỗi sau khi thay thế: " + str1);
    }
}
