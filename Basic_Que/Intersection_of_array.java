package Basic_Que;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersection_of_array {
    public static int[] Intersection(int[] arr1 , int[] arr2){
        int[] ans = new int[arr1.length];
        int k = 0;
        for(int i =0; i<arr1.length; i++){
            for (int j = 0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    ans[k] = arr1[i];
                    k++;
                }
            }
        }
        return ans;
    } // In this code the problem is output array size so we use Arraylist
    public static ArrayList<Integer> Intersection_arraylist(int[] arr1 , int[] arr2){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =0; i<arr1.length; i++){
            for (int j = 0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    ans.add(arr1[i]);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,4,6,0,7,5};
        int[] arr2 = {1,6,4,5};
        ArrayList<Integer> result = Intersection_arraylist(arr1,arr2);
        System.out.println(result);
    }

}
