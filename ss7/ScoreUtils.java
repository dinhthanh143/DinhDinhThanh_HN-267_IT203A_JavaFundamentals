public class ScoreUtils {
    public static void getResult(int score){
        if(score >= 5){
            System.out.println("Dat");
        }else{
            System.out.println("Khong dat");
        }
    }

    public static void calAvg(int[] arr){
        double avg = 0;
        for(int i = 0; i < arr.length ; i ++){
            avg += arr[i];
        }
        avg = avg/ arr.length;
        System.out.println(avg);
    }
}
