import java.util.ArrayList;
import java.util.List;

public class b3 {
    static void  execute(){
        List<Integer> l1 = new ArrayList<>(List.of(101, 102, 105));
        List<Integer> l3 = new ArrayList<>(List.of(102, 105, 108));
        List<String> l4 = new ArrayList<>(List.of("DN02", "DN04"));
        List<String> l2 = new ArrayList<>(List.of("DN01", "DN02", "DN03"));
        findCommonPatients(l1,l3);
        findCommonPatients(l2,l4);
    }
    static <T> void findCommonPatients(List<T> A,List<T> B){
        List<T> list = new ArrayList<>();
        for (T x: A){
            if(B.contains(x)){
                list.add(x);
            }
        }
        for (T x: list) System.out.print(x + " ");
    }
}
