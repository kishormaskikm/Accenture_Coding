package Basic_Que;

import java.util.Arrays;

public class Union_array {
    //union of two array , if arr1 = [2,4,6] and arr2 = [1,5,7] then ans = [2,4,6,1,5,7];
    public static int[] UnionArray(int[] arr1, int[] arr2){
        int[] ans = new int[arr1.length + arr2.length];
        //inserting first array elements

        for(int i = 0; i<arr1.length; i++){
            ans[i] = arr1[i];
        }
        //inserting second array elements
        for(int j = 0; j<arr2.length; j++){
            ans[arr1.length + j] = arr2[j];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,1,3};
        int[] arr2 = {1,3,7};
        int[] result = UnionArray(arr1,arr2);
        System.out.println(Arrays.toString(result));
    }

}
