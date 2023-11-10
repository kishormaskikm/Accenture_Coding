package ArrayQue;

import java.util.Arrays;

public class union_sorted_arr {
    public static int[] Union_of_sorted_arr(int[] arr1, int[] arr2){
        int i = 0, k =0, j = 0;
        int[] merged = new int[arr1.length + arr2.length];
        while (i < arr1.length && j <  arr2.length) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else if(arr1[i] > arr2[j]) {
                merged[k++] = arr2[j++];
            }else{ // arr[i] == arr[j]
                merged[k++] = arr1[i];
                i++;
                j++;
            }
        }
        // Copy remaining elements from arr1, if any
        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }

        // Copy remaining elements from arr2, if any
        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }

    public static void main(String[] args) {
        int[] arr1 = {10,20,30,40,60};
        int[] arr2 = {20,30,50,60,70,80};

        System.out.println(Arrays.toString(Union_of_sorted_arr(arr1,arr2)));
    }

}
