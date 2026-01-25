
public class b3 {
    public void execute() {
        String book1 = "Java Basic";
        String book2 = "Python Intro";
        System.out.printf("Truoc khi hoan doi: %s , %s\n", book1, book2);
        String temp = book1;
        book1 = book2;
        book2 = temp;
        System.out.printf("Sau khi hoan doi: %s , %s\n", book1, book2);
//Trong Java, chuỗi (String) là kiểu dữ liệu tham chiếu.
// Khi bạn thực hiện hoán đổi, chúng ta không di chuyển
// nội dung chữ "Java Basic" hay "Python Intro" đi đâu cả,
// mà chỉ thay đổi địa chỉ (con trỏ) mà các biến đang nắm giữ trên Stack.
    }
}
