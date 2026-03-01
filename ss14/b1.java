import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class b1 {
    static  void use(){
        Set<String> set = new LinkedHashSet<>(Arrays.asList("Nguyễn Văn A – Yên Bái", "Trần Thị B – Thái Bình", "Nguyễn Văn A – Yên Bái", "Lê Văn C – Hưng Yên"));
        set.forEach(name -> System.out.println(name));
    }
}
