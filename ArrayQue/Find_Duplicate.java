package ArrayQue;
//https://leetcode.com/problems/find-the-duplicate-number/
public class Find_Duplicate {

    // This approch solved by modifying araay
    public int findDuplicate(int[] nums) {

        for (int i = 0; i<nums.length;i++){
            int index = Math.abs(nums[i]);

            if(nums[index] < 0){
                return index;
            }

            nums[index] = - nums[index];
        }
        return -1;
    }

    // if we want to solved same problem wihtout modifying the aaray then Learned "Flody cycle finding algorithm"
}
