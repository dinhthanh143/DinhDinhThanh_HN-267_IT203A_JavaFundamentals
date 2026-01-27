
public class b5 {
    public static int deleteBook(int[] arr, int n, int bookId){
        int index = -1;
        for (int i = 0 ; i < n ; i ++){
            if(arr[i] == bookId){
                index = i;
            }
        }
        if( index == -1) {
            System.out.println("Khong tim thay sach voi ma "+bookId);
            return n;
        }
        n--;
        for (int i = index ; i < n ; i ++){
            arr[i] = arr[i+1];
        }
        System.out.println("da xoa ma sach "+bookId);
        System.out.printf("Kho sach hien tai: %d cuon\n", n);
        for (int i = 0 ; i < n ; i ++){
            System.out.printf("%d ", arr[i]);
        }
        return n ;
    }

}
