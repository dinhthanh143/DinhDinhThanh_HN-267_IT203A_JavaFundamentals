import java.util.Scanner;

public class b6 {
    public void execute(Scanner sc){
        System.out.println("Nhap so thu tu cua sach trong he thong: ");
        int pos = sc.nextInt();
        int shelf = (pos - 1) / 25 + 1;
        int address = (pos - 1) % 25 + 1;
        String area = (shelf <= 10) ? "Khu Can" : "Khu Vien";
        System.out.println("---THONG TIN DINH VI---");
        System.out.println("Sach so: " + pos);
        System.out.printf("Dia chi: Ke %d - Vi tri %d \n", shelf, address);
        System.out.println("Phan khu: " + area);
    }
}
