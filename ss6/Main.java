import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1
//        Student s2 = new Student(2, "Dinh Dinh Anh", 2016, 7.5);
//        Student s1 = new Student(1, "Dinh Dinh THanh", 2006, 9.5);
//        s1.displayInfo();
//        s2.displayInfo();
        //2
//        Account a1 = new Account("dinhthanh111", "abc12345", "thanh@gmail.com");
//        Account a2 = new Account("neonlime", "123456", "thanhdeptrai@gmail.com");
//        a1.displayInfo();
//        a2.displayInfo();
//        a1.changePassword("newPas1244");
//        System.out.println(a1.password);

        //3
//        Product p1 = new Product(10, "gucci", 1000);
//        p1.displayInfo();
//        p1.setPrice(-1);
//        p1.setPrice(2000);
//        p1.displayInfo();

        //4
//        Employee e1 = new Employee();
//        Employee e2 = new Employee(12, "Thanh");
//        Employee e3 = new Employee(25000, "Hau", 33);
//        e1.displayInfo();
//        e2.displayInfo();
//        e3.displayInfo();

        //5
//        Book b = new Book(1, "Clean Code", "Robert C. Martin", 99.5);
//        b.displayInfo();

        //6
        User u1 = new User(1, "admin@gmail.com", "123456", "admin");
        User u2 = new User(2, "user01@ptit.edu.vn", "password@2025", "user01");
        u1.displayInfo();
        u2.displayInfo();
        u1.setEmail("abc");
        u1.setEmail("thanh@gmail.com");
        u1.setPassword("");
        u1.setPassword("gvdfdgdfgfd");
        u1.displayInfo();
        System.out.println(u1.getPassword());




    }
}