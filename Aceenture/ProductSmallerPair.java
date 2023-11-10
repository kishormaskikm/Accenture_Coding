package Aceenture;

import java.util.Arrays;

public class ProductSmallerPair {

    public static void main(String[] args) {
        int[] arr = {9,8,3,-7,3,9};
        System.out.println(ProductSmallerPair(arr,6,4));
    }
    public static int ProductSmallerPair(int[] arr, int n, int sum){ // using inbuilt sort
        if(arr.length <=3){
            return -1;
        }
        Arrays.sort(arr);
        for(int i = 0; i<n-1; i++){
            if(arr[i] == arr[i+1]){
                i++;
            }else{
                if(arr[i] + arr[i+1] <= sum){
                    return arr[i]*arr[i+1];
                }
            }
        }
        return 0;
    }

    //without using inbuild sort
    public static int productSmallestPair (int arr[], int n, int sum)
    {
        if (n <2)
            return -1;
        int ans, temp, check;
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        check = arr[0] + arr[1];
        if (check <= sum)
            return arr[0] * arr[1];
        else
            return 0;
    }

}
