import java.util.Scanner;

public class b5 {
    public void execute(Scanner sc) {
        int score = 100;
        int input = 0;
        System.out.println("---He thong danh gia doc gia---");
        System.out.println("(Nhap so ngay tre. Nhap 999 de ket thuc)");
        while (input != 999){
            System.out.println("Nhap so ngay tre: ");
            input = sc.nextInt();
            if(input == 999) break;
            int value = 0;
            if(input <= 0){
                value = 5;
            }else {
                value = input * (-2);
            }
            score += value;
            System.out.printf("-> Tra tre %d ngay: %d diem\n", input, value );
        }
        System.out.println("TOng diem uy tin: "+score);
        String rank = "";
        if(score < 80){
            rank = "Doc gia can luu y";
        }else if(score < 120){
            rank = "Doc gia Tieu chuan";
        }else{
            rank = "Doc gia Than thiet";
        }
        System.out.println("Xep loai: "+ rank);

    }
    }
