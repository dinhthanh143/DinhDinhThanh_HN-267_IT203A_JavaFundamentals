public class b2 {
    public static void execute(){
        int num = 12;
        Student s3 = new Student(3, "nhat");
        Student s4 = s3;

        int num2 = num;
        num = 14;
        System.out.println(num2);
        s3.name = "abc";
        System.out.println(s3);
        //b = a copy giá trị nên a và b độc lập, thay đổi a không ảnh hưởng b.
        //s4 = s3 copy địa chỉ nên cùng trỏ 1 object, thay đổi s3 thì s4 cũng đổi.
        //Nguyên thủy copy giá trị (độc lập), tham chiếu copy địa chỉ (ảnh hưởng nhau).
    }
}
