import java.util.Scanner;

public class b2 {
    public void execute(Scanner sc) {
        System.out.println("Moi nhap ki tu: ");
        char code = sc.next().charAt(0);
        code = Character.toUpperCase(code);
        switch (code){
            case 'A':
                System.out.println("Tang 1: Sach van hoc");
                break;
            case 'B':
                System.out.println("Tang 2: Sach khoa hoc");
                break;
            case 'C':
                System.out.println("Tang 3: Sach ngoai ngu");

                break;
            case 'D':
                System.out.println("Tang 4: Sach tin hoc");
                break;
            default:
                System.out.println("Ma nhap khong hop le");
                break;
        }

    }
    }
