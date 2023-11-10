package ArrayQue;

import java.util.ArrayList;
import java.util.Arrays;

public class Large_Factorial {
    public static ArrayList<Integer> factorial(int N){
        //code here
        int ans = 1;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i<= N; i++){
             ans = ans * i;
             list.set(0, ans);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(factorial(10));

    }
}
