import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class b3 {
    static void use() {
        Set<String> thanhPhanThuoc = new HashSet<>(Arrays.asList("Aspirin", "Caffeine", "Paracetamol"));
        Set<String> chatDiUng = new HashSet<>(Arrays.asList("Penicillin", "Aspirin", "Pollen"));
        String allergy = "Chat di ung: ";
        String safe = "Thanh phan an toan: ";
        for (String x : thanhPhanThuoc){
            if(chatDiUng.contains(x)){
                allergy += x + ", ";
            }else{
                safe += x + ", ";
            }
        }
        System.out.println(allergy);
        System.out.println(safe);


    }
}
