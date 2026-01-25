import java.util.Scanner;

public class b2 {
    public void execute(Scanner sc){
        System.out.println("Nhap so ngay cham tre: ");
        int day = sc.nextInt();
        System.out.println("Nhap so luong sach muon: ");
        int amount = sc.nextInt();

        double ogFee = day * amount * 5000;
        double newFee = ogFee;
        boolean lock = false;
        if(day > 7 && amount >= 3) {
            newFee = newFee * 1.2;
        }
        if(newFee > 50000){
            lock = true;
        }
        System.out.printf("\nTien phat goc: %.1f", ogFee);
        System.out.printf("\nTien phat sau dieu chinh: %.1f", newFee);
        System.out.printf("\nYeu cau khoa the %b: ", lock);
    }
}
