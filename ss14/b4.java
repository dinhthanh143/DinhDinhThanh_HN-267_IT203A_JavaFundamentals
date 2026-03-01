import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class b4 {
    static  void  use(){
        List<String> list  = new ArrayList<>(List.of("Cúm A", "Sốt xuất huyết", "Cúm A", "Covid-19", "Cúm A", "Sốt xuất huyết"));
        Map<String , Integer> report = new TreeMap<>();

        for (String benh : list){
            report.put(benh, report.getOrDefault(benh, 0 ) + 1);
        }

        System.out.println("Bao cao:");
        report.forEach((name, count) ->{
            System.out.println(name + ": " + count);
        });
    }
}
