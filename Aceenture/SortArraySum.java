package Aceenture;

//def LargeSmallSum(arr)
//
//        The function accepts an integers arr of size ’length’ as its arguments you are required to return the sum of
//        second largest  element from the even positions and second smallest from the odd position of given ‘arr’


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortArraySum {
    public static int sort_array_diff(int[] arr, int n){


        if (n <= 3)
            return 0;
        ArrayList < Integer > even = new ArrayList < Integer > ();
        ArrayList< Integer > odd = new ArrayList < Integer > ();
        even.add (arr[0]);

        for (int i = 1; i < arr.length; i++)
        {
            if (i % 2 == 0)
                even.add (arr[i]);
            else
                odd.add (arr[i]);
        }
        Collections.sort (even);
        Collections.sort (odd);

        return even.get (even.size () - 2) + odd.get (odd.size () - 2);

    }

}
