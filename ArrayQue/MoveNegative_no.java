package ArrayQue;

import java.util.Arrays;
//Two pointer approch
public class MoveNegative_no {
    public static void move_negative_ele(int[] arr){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            if(arr[s] < 0){
                s++;
            }else{
                int temp = arr[e];
                arr[e] = arr[s];
                arr[s] = temp;
                e--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = {-12,11,-13,-5,6,-7,5,-3,-6};
        move_negative_ele(arr);
    }
}
