import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Shape s1 = new Circle(5);        // r = 5
//        Shape s2 = new Rectangle(4, 6);  // width = 4, length = 6
//        s1.getArea();
//        s1.getPerimeter();
//        s2.getArea();
//        s2.getPerimeter();
//        Vehicle v1 = new Car("toyota");
//        Vehicle v2 = new Bicyle("Nobita");
//        System.out.println(v1.brand);
//        v1.move();
//        System.out.println(v2.brand);
//        v2.move();

//        Duck d = new Duck();
//        Fish f  = new Fish();
//        d.fly();
//        d.swim();
//        f.swim();
//        RemoteControl smartLight  = new RemoteControl() {
//            @Override
//            public void powerOn() {
//                System.out.println("den da bat");
//            }
//
//        };
//        smartLight.checkBattery();
//        smartLight.powerOn();
//
//        Employee e1 = new OfficeStaff("An", 8000);
//        Employee e2 = new Manager("Binh", 10000);
//
//        Employee[] employees = {e1, e2};
//
//        for (Employee e : employees) {
//            System.out.println("Ten: " + e.name);
//            System.out.println("Luong: " + e.calculateSalary());
//            System.out.println("-----");
//        }
        List<Product> products = new ArrayList<>();
        products.add(new Product("Banana", 20));
        products.add(new Product("Apple", 15));
        products.add(new Product("Orange", 25));

        // Anonymous Class: sắp xếp theo giá tăng dần
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.price, p2.price);
            }
        });

        // Lambda Expression: sắp xếp theo tên A-Z
        products.sort((p1, p2) -> p1.name.compareTo(p2.name));

        for (Product p : products) {
            System.out.println(p.name + " - " + p.price);
        }
    }
}