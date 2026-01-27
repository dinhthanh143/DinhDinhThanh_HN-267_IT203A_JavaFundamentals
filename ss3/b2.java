import java.util.ArrayList;

public class b2 {


    public static void searchBooks(ArrayList<String> arr, String search){
        int index = arr.indexOf(search);
        if(index >= 0 ){
            System.out.printf("Tim thay sach '%s' tai vi tri so %d",search,index);
        }else{
            System.out.println("Sach khong ton tai trong thu vien");
        }
    }
}
