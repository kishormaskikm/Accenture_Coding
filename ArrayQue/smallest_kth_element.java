package ArrayQue;

import java.util.Arrays;

public class smallest_kth_element {
    //Approch 1 -> complexity O(N log N)
    public static int kthSmallest(int[] arr,  int k)
    {
        //Your code here
        Arrays.sort(arr);
        return arr[k];
    }
    //Approch 2


    public static void main(String[] args) {
        int[] arr = {7,10,4,20,15};
        int ans = kthSmallest(arr,1);
        System.out.println(ans);

    }
}
