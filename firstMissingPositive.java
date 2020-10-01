package sol;


import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

class Solution {
    private static final Logger LOGGER = Logger.getLogger( Solution.class.getName() );

    public int firstMissingPositive(int[] nums) {
        int answer = 1;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] < 1 || nums[i] > nums.length || nums[i] == nums[nums[i] -1]) {
                i++;
                continue;
            }
            int temp = nums[nums[i] - 1];
            nums[nums[i] - 1] = nums[i];
            nums[i] = temp;
        }
        LOGGER.log(Level.INFO, "{0}", Arrays.toString(nums));
        for(int num : nums) {
            if(answer == num) {
                answer++;
            }
        }
        return answer;
    }
}
