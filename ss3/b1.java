import java.util.Scanner;

public class b1 {
    static Scanner sc = new Scanner(System.in);
    public static int[] addBookToLibraries(int n){
    int[] arr = new int[n];
        for (int i = 0; i <= arr.length - 1; i++){
            System.out.printf("sach thu %d \n", i+1);
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void displayLibraries(int[] arr){
        System.out.println("Danh sach ma sach: ");
        for (int i = 0; i <= arr.length - 1; i++){
            System.out.printf("%d ", arr[i]);
        }
    }
}
