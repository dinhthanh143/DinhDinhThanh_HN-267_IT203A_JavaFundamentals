import java.util.Scanner;

public class b4 {
    public void execute(Scanner sc) {
        System.out.println("nhap gia sach: ");
        double price = sc.nextDouble();
        System.out.println("nhap ty gia: ");
        float rate = sc.nextFloat();
        double total = price * rate;
        long rounded = (long) total;
        System.out.println("Gia chinh xac(f): " + total);
        System.out.printf("Gia lam tron (long): %d", rounded);

    }
}
