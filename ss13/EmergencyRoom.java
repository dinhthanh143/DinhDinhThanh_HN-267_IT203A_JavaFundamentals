import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EmergencyRoom {
    static List<String> list = new LinkedList<>();
    static void patientCheckIn(String name){
        list.add(name);
   }
    static void emergencyCheckIn(String name){
        list.addFirst(name);
    }

    static void treatPatient(){
        if(!list.isEmpty()){
            System.out.println("Dang dieu tri benh nhan: "+list.getFirst());
            list.removeFirst();
        }else{
            System.out.println("Ko co benh nhan nao");
        }
    }
}
