import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1
//        System.out.println("Nhap so luong sach: ");
//        int num1 = sc.nextInt();
//        int[] arr1 = b1.addBookToLibraries(num1);
//        b1.displayLibraries(arr1);
//       //2
//        ArrayList<String> Books = new ArrayList<>();
//        Books.add("A");
//        Books.add("B");
//        Books.add("C");
//        Books.add("D");
//        Books.add("E");
//        System.out.println("Moi nhap ten sach can tim: ");
//        String  val2 = sc.nextLine();
//        b2.searchBooks(Books, val2);
        //3
        String[] names3 = {
                "Java Programming",
                "Python Basics",
                "Web Development",
                "Data Structures",
                "Machine Learning"
        };

        int[] quantities3 = {15, 25, 24, 3, 12};
        int n3 = 5;
//        b3.maxQuantityOfBooks(names3, quantities3);
//        b3.minQuantityOfBooks(names3, quantities3);

        //4
//        b4.sortBooks(quantities3);
        //5
//        System.out.printf("Kho sach hien tai: %d cuon\n", n3);
//        for (int i = 0 ; i < n3 ; i ++){
//            System.out.printf("%d ", quantities3[i]);
//        }
//        int check5 = 1;
//        while (check5 == 1){
//            System.out.println("\nnhap ma sach can xoa (0 de thoat): ");
//            int id = sc.nextInt();
//            if(id == 0) break;
//            n3 = b5.deleteBook(quantities3, n3 , id);
//        }
        //6
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 3, 6, 8, 9};
        b6.mergeBooks(arr1, arr2);
    }

}