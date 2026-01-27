
public class b3 {
    public static void maxQuantityOfBooks(String[] names, int[] quantities){
        int max = quantities[0];

        for (int i  = 0 ; i< quantities.length ; i ++){
            if(quantities[i] > max){
                max = quantities[i];
            }
        }
        System.out.println("sach co so luong max: " + max);
        for (int i  = 0 ; i< quantities.length ; i ++){
            if(quantities[i] == max){
                System.out.println("- " + names[i]);
            }
        }
        System.out.println("------------------");
    }

    public static void minQuantityOfBooks(String[] names, int[] quantities) {
        int min = quantities[0];

        for (int i  = 0 ; i< quantities.length ; i ++){
            if(quantities[i] < min){
                min = quantities[i];
            }
        }
        System.out.println("sach co so luong min: " + min);
        for (int i  = 0 ; i< quantities.length ; i ++){
            if(quantities[i] == min){
                System.out.println("- " + names[i]);
            }
        }
        System.out.println("------------------");

    }
    }
