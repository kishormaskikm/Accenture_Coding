package Aceenture;

public class MaxInArray {
    public static void max_in_array(int arr[], int length)
    {
        int max = arr[0], index = 0;
        for (int i = 1; i < length; i++)
            if (arr[i] > max)
            {
                max = arr[i];
                index = i;
            }
        System.out.println (max);
        System.out.println (index);
    }

    public static void main(String[] args) {
        int[] arr = {25,45,82,54,89,14,54,23,62,17};
        max_in_array(arr,arr.length);

    }

}
