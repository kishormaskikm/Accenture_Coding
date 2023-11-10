package Basic_Que;
//sort the array , o's are first then 1's , -> do not use extra space

import java.util.Arrays;

//using Two pointer approch
public class sort_Zeros_and_One {
    public static int[] sort(int[] arr){
        int s = 0;
        int e = arr.length-1;
        int i =0; // third pointer for travelsing array
        while(s<e){
            if(arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[s];
                arr[s]= temp;

                i++;
                s++;
            }
            if(arr[i] == 1){
                int temp = arr[i];
                arr[i] = arr[e];
                arr[e]= temp;

                i++;
                e--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
      int[] arr = {0,1,0,1,1,0,0,0,1,1,0};
      int[] result = sort(arr);
        System.out.println(Arrays.toString(result));
    }

}
