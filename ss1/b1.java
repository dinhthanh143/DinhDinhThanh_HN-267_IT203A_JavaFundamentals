import java.util.Scanner;
public class b1 {
    public void bai1(Scanner sc){
        System.out.println("Nhap ma sach: ");
        String id = sc.nextLine();
        System.out.println("Nhap ten sach: ");
        String title = sc.nextLine();
        System.out.println("Nhap nam xuat ban: ");
        int year = sc.nextInt();
        System.out.println("Nhap gia bia: ");
        float price = sc.nextFloat();
        System.out.println("Sach con trong kho (true/false): ");
        boolean inStock = sc.nextBoolean();
        int age = 2026 - year;
        String status = inStock ? "Con sach" : "Het sach";
        System.out.println("\n--- PHIẾU THÔNG TIN SÁCH ---");
        System.out.println("Tên sách: " + title.toUpperCase());
        System.out.printf("Mã số: %s | Tuổi thọ: %d năm\n", id, age);
        System.out.printf("Giá bán: %.2f VNĐ\n", price);
        System.out.println("Tình trạng: " + status);
    }
}
