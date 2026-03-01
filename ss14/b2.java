import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class b2 {
    static  void use(Scanner sc){
        Map<String, String> map = new HashMap<>();
        map.put("T01", "Paracetamol");
        map.put("T02", "Ibuprofen");
        map.put("T03", "Amoxicillin");
        map.put("T04", "Aspirin");
        map.put("T05", "Vitamin C");
        System.out.println("Moi nhap ma: ");
        String id =   sc.nextLine().trim();
        String val = map.get(id);
        if (val != null){
            System.out.println(val);
        }else{
            System.out.println("KO CO");
        }
    }
}
