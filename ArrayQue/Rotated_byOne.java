package ArrayQue;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Rotated_byOne {
    public static void rotate(int arr[], int n)
    {
        int last_element = arr[n-1];
        for(int i = n-1; i>0 ; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last_element;

        //we use reverse loop becouse if we use forword loop then values become Overwrite
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //Output should be -> {5,1,2,3,4}
    }
}
