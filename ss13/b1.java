import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class b1 {
    static void execute(){
        List<Double> list1 = new ArrayList<>(List.of(36.5, 40.2, 37.0, 12.5, 39.8, 99.9, 36.8));
        Iterator<Double> it1 = list1.iterator();
        double total = 0.0;
        while (it1.hasNext()){
            double n = it1.next();
            if(n < 34.0 || n > 42.0){
                it1.remove();
            }else{
                total += n;
            }
        }
        System.out.println("Nhiet do tb:" + (total/list1.size()));
    }
}
