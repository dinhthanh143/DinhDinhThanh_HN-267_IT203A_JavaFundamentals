import java.util.Scanner;

public class b4 {
    public void execute(Scanner sc) {
        int id = 0;
        do {
            System.out.println("Nhap ma ID sach moi: ");
            id = sc.nextInt();
            if (id < 0 ){
                System.out.println("Loi. ID phai la so duong");
            }
        } while (id <= 0);

        System.out.printf("\nXac nhan: Ma sach %d da duoc ghi nhan", id);

    }
    }
