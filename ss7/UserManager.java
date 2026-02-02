import java.util.ArrayList;

public class UserManager {
    public static ArrayList<User> list = new ArrayList<>();

    public static void addUser(User u ){
        list.add(u);
        System.out.println("Them thanh cong");
    }

    public static void searchUser(int id){
        User foundUser = null;
        for (int i = 0; i < list.size() ; i++){
            if(list.get(i).ID == id){
                foundUser = list.get(i);
            }
        }
        if(foundUser != null){
            System.out.println("===============");
            System.out.println("ID: " + foundUser.ID);
            System.out.println("NAME: " + foundUser.username);
        }else{
            System.out.println("KO tim thay user voi id " + id);
        }
    }



}
