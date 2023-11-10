package ArrayQue;

import java.util.Arrays;

public class Find_pairs {
    public static int getPairsCount(int[] arr, int n, int k) { // this function does not handles duplicate elements in array
        // code here
        Arrays.sort(arr);
        int i =0, j=n-1, sum = 0,count=0;
        while(i<j){
            sum = arr[i]+arr[j];
            if(sum == k){
                count++;
                i++;
                j--;
            }else if(sum > k){
                j--;
            }else{// sum < k , so me need to increse i , for adding values so that we near about the k
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,5,2};
        System.out.println(getPairsCount(arr,4,6)); //output : 2 , (5,1) and (2,4)
    }


    // this function handles dupalicate value in given array
    public static int getPairsCount_duplicate(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int i = 0, j = n - 1, count = 0;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == k) {
                if (arr[i] == arr[j]) {
                    int len = j - i + 1;
                    count += (len * (len - 1)) / 2; // Calculate the count for duplicate elements
                    break;
                } else {
                    count++;
                    i++;
                    j--;
                }
            } else if (sum > k) {
                j--;
            } else {
                i++;
            }
        }
        return count;
    }
}
