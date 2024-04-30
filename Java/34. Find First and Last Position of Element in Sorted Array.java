class Solution {
    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == target) {
                int j = i;
                while (j + 1 < len && nums[j + 1] == target) {
                    j++;
                }
                return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }
}
