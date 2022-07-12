class Solution {
    public boolean makesquare(int[] matchsticks) {

        if (matchsticks.length < 4) {
            return false;
        }
        int sum = 0;
        for (int i = 0; i < matchsticks.length; i++) {
            sum += matchsticks[i];
        }
        int side = sum / 4;

        if (sum % 4 != 0) {
            return false;
        }
        Arrays.sort(matchsticks);
        int side1 = 0, side2 = 0, side3 = 0, side4 = 0, index = matchsticks.length - 1;

        return helper(side1, side2, side3, side4, index, side, matchsticks);
    }

    public boolean helper(int s1, int s2, int s3, int s4, int idx, int side, int[] arr) {

        if (idx == -1) {
            return s1 == s2 && s2 == s3 && s3 == s4;
        }

        if (s1 > side || s2 > side || s3 > side || s4 > side || idx == -1) {
            return false;
        }
        
        return helper(s1 + arr[idx], s2, s3, s4, idx - 1, side, arr) ||
            helper(s1, s2 + arr[idx], s3, s4, idx - 1, side, arr) ||
            helper(s1, s2, s3 + arr[idx], s4, idx - 1, side, arr) ||
            helper(s1, s2, s3, s4 + arr[idx], idx - 1, side, arr);
    }

}