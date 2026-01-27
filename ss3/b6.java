import java.util.ArrayList;

public class b6 {
  public static void mergeBooks(int[] a, int[] b){
      System.out.println("Kho cu: ");
      for (int i = 0 ; i < a.length ; i ++){
          System.out.printf("%d ", a[i]);
      }
      System.out.println("\nLo moi: ");
      for (int i = 0 ; i < b.length ; i ++){
          System.out.printf("%d ", b[i]);
      }
      //merge
      ArrayList<Integer> merged = new ArrayList<Integer>();
      for (int i = 0; i < a.length  ; i ++){
          merged.add(a[i]);
      }
      for (int i = 0; i < b.length  ; i ++){
          merged.add(b[i]);
      }
      //dup
      for (int i = 0 ; i < merged.size() ; i ++){
          for (int j = i+1 ; j < merged.size() ; j ++){
                if(merged.get(i) == merged.get(j)){
                    merged.remove(merged.get(j));
                }
          }
      }
      //sort
      for (int i = 0; i < merged.size() - 1; i++){
          for (int j = 0; j < merged.size() - 1 - i; j++){
              if(merged.get(j+1) < merged.get(j)){
                  int temp = merged.get(j);
                  merged.set(j, merged.get(j + 1));
                  merged.set(j+1, temp);
              }
          }
      }
      //print
      System.out.println("\nKho tong: ");
      for (int i = 0 ; i < merged.size() ; i ++){
          System.out.printf("%d ", merged.get(i));
      }


  }
}
