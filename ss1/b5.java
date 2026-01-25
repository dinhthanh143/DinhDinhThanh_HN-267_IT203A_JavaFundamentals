import java.util.Scanner;
public class b5 {
    public void execute(Scanner sc){
        System.out.println("Moi nhap so nguyen 4 chu so: ");
        int num = sc.nextInt();
        String status = "Khong hop le";
        int thousand = num / 1000;
        int hundred = (num / 100) % 10;
        int dozen = (num / 10) % 10;
        int unit = num % 10;
        int sumOfFirstThreeNumber  =  thousand + hundred + dozen;
        if( sumOfFirstThreeNumber % 10 == unit ){
            status = "Hop le";
        }
        System.out.println("Chu so kiem tra ky vong: "+ unit );
        System.out.println("Ket qua kiem tra: " + status);
    }
}
