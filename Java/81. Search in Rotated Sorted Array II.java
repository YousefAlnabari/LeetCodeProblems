class Solution {
    public boolean search(int[] nums, int target) {
        int len = nums.length;
        for(int i = 0; i < len; i++)
            if(nums[i] == target)
                return true;
        return false;
    }
}
