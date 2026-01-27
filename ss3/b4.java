
public class b4 {
 public static void sortBooks(int[] arr){
     System.out.println("Truoc khi sap xep: ");
     for (int i = 0 ; i < arr.length ; i ++){
         System.out.printf("%d ", arr[i]);
     }
    for (int i = 0; i< arr.length - 1; i++){
        for (int j = 0; j< arr.length - 1 - i; j++){
            if(arr[j+1] < arr[j]){
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j+1] = temp;
            }
        }
    }
     System.out.println("\nSau khi sap xep: ");
     for (int i = 0 ; i < arr.length ; i ++){
         System.out.printf("%d ", arr[i]);
     }
 }
}
