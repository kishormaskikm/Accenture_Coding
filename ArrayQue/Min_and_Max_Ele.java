package ArrayQue;
//https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
public class Min_and_Max_Ele {
    public static void main(String[] args) {
        int[] arr = {10,20,30,4,65,21,12,47,9,22};
        min_max(arr);
    }
    public static void min_max(int[] arr){
        int min_so_far = Integer.MAX_VALUE;
        int max_so_far = Integer.MIN_VALUE;

        if(arr.length % 2 != 0 ){
            min_so_far = arr[0];
            max_so_far = arr[0];
        }

        for(int i = 0; i<arr.length; i+=2){
            int first = arr[i];
            int second = arr[i+1];

            if (first > second) {
                max_so_far = Math.max(max_so_far, first);
                min_so_far = Math.min(min_so_far, second);
            } else {
                max_so_far = Math.max(max_so_far, second);
                min_so_far = Math.min(min_so_far, first);
            }
        }
        System.out.println("Min Element -> " + min_so_far);
        System.out.println("Max Element -> " + max_so_far);
    }

}
