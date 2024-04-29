class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        for(int i = 0; i < len; i++)
            if(nums[i] != i)
                return i;
        return len;
    }
}
