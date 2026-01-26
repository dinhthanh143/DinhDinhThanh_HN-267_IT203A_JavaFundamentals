import java.util.Scanner;
public class b3 {
    public void execute(Scanner sc) {
        System.out.println("Nhap so sach tra muon: ");
        int amount = sc.nextInt();
        int total = 0;
        for(int i = 1; i<= amount ; i++){
            System.out.printf("So ngay tre cua cuon thu %d: " ,i);
            int day = sc.nextInt();

            total += 5000 * day;
        }
        System.out.printf("\nTong tien phai tra: %d VND", total);
    }
    }
