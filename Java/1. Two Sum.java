class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] x = new int[2];
        int len = nums.length;
        for(int i = 0; i < len; i++)
            for (int k = 0; k < len && k != i; k++)
                if((nums[i] + nums[k]) == target) {
                    x[0] = i;
                    x[1] = k;
                }
        return x;
    }
}
