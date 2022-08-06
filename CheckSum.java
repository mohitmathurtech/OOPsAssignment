package learning;

import java.util.Arrays;

public class CheckSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {2,7,41,63};
		int target = 9;
		int[] result = twoSum(nums, target);
		System.out.println(Arrays.toString(result) + "  nums[" + result[0] + "] + nums[" + result[1] +"] = " + target);
	}

	public static int[] twoSum(int[] nums, int target) {
		
        for(int i=0;i<nums.length;i++){
            for (int j = i+1 ;j<nums.length;i++){
                if( nums[i] + nums[j] == target)
                    return new int[] {i,j};
            }
        }
        return nums;
    }

}
