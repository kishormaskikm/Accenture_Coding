package Aceenture;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        // Example array
        int[] nums = {1, 3, 5, 4, 7, 8, 9, 2, 6};

        // Calling the findLengthOfLCIS method
        int result = findLengthOfLCIS(nums);

        // Printing the result
        System.out.println("Length of Longest Continuous Increasing Subsequence: " + result);
    }

    // Function to find the length of the longest continuous increasing subsequence
    private static int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxLength = 1;  // Minimum length is 1 for any non-empty array
        int currentLength = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                // If the current element is greater than the previous, it's part of an increasing subsequence
                currentLength++;
            } else {
                // If not, update the maximum length and reset the current length
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }

        // Update maxLength one more time in case the longest subsequence ends at the last element
        maxLength = Math.max(maxLength, currentLength);

        return maxLength;
    }
}

