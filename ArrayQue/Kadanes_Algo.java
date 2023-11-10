package ArrayQue;
//https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
public class Kadanes_Algo {
    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){

        int curSum = arr[0]; // Initialize curSum with the first element of the array
        int maxSum = arr[0]; // Initialize maxSum with the first element of the array

        for (int i = 1; i < n; i++) {
            // Check whether adding the current element to curSum improves it or not
            curSum = Math.max(arr[i], curSum + arr[i]);

            // Update maxSum if curSum becomes greater
            maxSum = Math.max(maxSum, curSum);
        }

        return maxSum;

    }
}
