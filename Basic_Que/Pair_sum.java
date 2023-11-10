package Basic_Que;

public class Pair_sum {
    public static void pair_sum_array(int[] arr, int sum){
        for(int i = 0; i<arr.length; i++){
            int element = arr[i];
            for(int j = i+1; j< arr.length; j++){
                if(element + arr[j] == sum){
                    System.out.println("pair is "+ "("+element+","+arr[j]+")");
                }
            }
        }
    }

}
