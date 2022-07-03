class Solution {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length == 1) return 1;
        int prev = nums[1] - nums[0];
        int count = prev == 0 ? 1 : 2;
        for (int i = 2; i < nums.length; i++) {
            int curr = nums[i] - nums[i - 1];
            if (prev <= 0) {
                if (curr > 0) {
                    count++;
                    prev = curr;
                    continue;
                }
            }
            if (prev >= 0) {
                if (curr < 0) {
                    count++;
                    prev = curr;
                }
            }
        }
        return count;
    }
}