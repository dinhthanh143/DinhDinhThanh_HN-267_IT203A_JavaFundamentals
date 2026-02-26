import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class b2 {
    static void execute(){
        List<String> list = new ArrayList<>(List.of("Paracetamol", "Ibuprofen", "Panadol", "Paracetamol", "Aspirin", "Ibuprofen"));
        List<String> newList = new ArrayList<>();
        for (String x : list){
            if(!newList.contains(x)){
                newList.add(x);
            }
        }

        Collections.sort(newList);
        for (String x : newList) {
            System.out.print(x + " ");
        }
        }
}
