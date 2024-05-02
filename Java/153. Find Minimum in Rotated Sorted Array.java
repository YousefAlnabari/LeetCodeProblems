class Solution {
    public int findMin(int[] nums) {
        int min = nums[0], len = nums.length;
        for(int i = 1; i < len; i++)
            if(nums[i] < min)
                min = nums[i];
        return min;
    }
}
