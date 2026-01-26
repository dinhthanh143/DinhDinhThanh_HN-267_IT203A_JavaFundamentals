import java.util.Scanner;

public class b6 {
    public void execute(Scanner sc) {
        int max = -1;
        int min = -1;
        int total = 0;
    for (int i = 1; i<=7; i++){
        if(i == 7){
            System.out.printf("Nhap luot muon ngay chu nhat: \n" );
        }else{
            System.out.printf("Nhap luot muon ngay thu %d \n", i +1 );
        }
        int val = sc.nextInt();
        total += val;
        if (i == 1 ) {
            min = val;
            max = val;
        }
        if( val > max) max = val;
        if( val < min) min = val;
    }
        System.out.println("---Ket qua thong ke---");
        System.out.println("Luot muon cao nhat: " + max);
        System.out.println("Luot muon thap nhat: " + min);
        System.out.println("Trung binh luot muon/ngay: " + (double) total/7);
    }
    }
