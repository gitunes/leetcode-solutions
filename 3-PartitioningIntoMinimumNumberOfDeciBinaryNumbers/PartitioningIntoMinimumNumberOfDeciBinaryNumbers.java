class Solution {
   public int minPartitions(String n) {
        int maxNumPresent  = 0;
        for(int i=0;i<n.length();i++){
            int currentDigit = n.charAt(i)-'0';
            if(currentDigit>maxNumPresent){
                maxNumPresent = currentDigit;
            }
        }
        return maxNumPresent;
    }
}