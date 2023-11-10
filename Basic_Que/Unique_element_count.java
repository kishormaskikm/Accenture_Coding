package Basic_Que;

public class Unique_element_count {
    public static int count_unique_element(int[] nums) {
        if (nums.length == 0) {
            return 0; // Handle the case of an empty array
        }

        int uniqueCount = 1; // Initialize with 1 since the first element is unique

        for (int i = 1; i < nums.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    isUnique = false;
                    break; // No need to continue checking once a duplicate is found
                }
            }

            if (isUnique) {
                uniqueCount++;
            }
        }

        return uniqueCount;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 4, 4};
        int ans = count_unique_element(arr);
        System.out.println(ans); // This will correctly output 4 for the given array
    }

}
