import java.util.Scanner;
public class b1 {
    public void execute(Scanner sc){
        System.out.println("Nhap tuoi: ");
        int age = sc.nextInt();
        System.out.println("Nhap so sach dang muon: ");
        int amount = sc.nextInt();
        String result = "";
        if(age >= 18 && amount <=3){
            result = "Du dieu kien muon sach quy hiem";
        }else if(age < 18){
            result = "Ban chua du tuoi";
        }else{
            result = "Ban da muon toi da 3 cuon";
        }
        System.out.println("ket qua: Ban " + result);
    }
}
