class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        
        if(nums.length == 0){
            return 0;
        }
        
        int maxSeq = 1;
        int count = 1;
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] - nums[i-1] != 1  && nums[i] - nums[i-1] != 0 && nums[i] - nums[i-1] != -1){
                if(maxSeq < count){
                    maxSeq = count;
                }
                count = 1;
            }
            else{
                if(nums[i] - nums[i-1] != 0){
                  count++;
                }
                if(maxSeq < count){
                    maxSeq = count;
                }
                continue;
            }
        }
        
        return maxSeq;
    }
}