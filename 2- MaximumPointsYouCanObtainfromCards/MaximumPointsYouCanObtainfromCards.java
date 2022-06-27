class Solution {
public int maxScore(int[] cardPoints, int k) {
int length = cardPoints.length;
int[] arr = new int[length + k];

    for(int i = 0; i < arr.length; i++){
        arr[i] = cardPoints[i % length];
    }
    
    int i = length - k;
    int j = i;
    int sum = 0;
    int max = Integer.MIN_VALUE;
    while(j < arr.length){
        sum+= arr[j];
        if(j - i + 1 < k){
            j++;
        }else{
            max = Math.max(max, sum);
            sum -= arr[i];
            i++;
            j++;
        }
    }
    
    return max;
}
}