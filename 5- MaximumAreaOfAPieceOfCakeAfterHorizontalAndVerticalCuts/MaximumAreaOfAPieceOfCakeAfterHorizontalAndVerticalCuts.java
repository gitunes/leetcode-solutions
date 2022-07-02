class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(verticalCuts);
        long mod =(long)(1e9 + 7);
        Arrays.sort(horizontalCuts);
        long x=horizontalCuts[0];
        for(int i=1;i<horizontalCuts.length;i++){
            x=Math.max(x,horizontalCuts[i]-horizontalCuts[i-1]);
        }
        x=Math.max(x,h-horizontalCuts[horizontalCuts.length-1]);
        long y=verticalCuts[0];
        for(int i=1;i<verticalCuts.length;i++){
            y=Math.max(y,verticalCuts[i]-verticalCuts[i-1]);
        }
        y=Math.max(y,w-verticalCuts[verticalCuts.length-1]);
        
        x=x%mod;
        y=y%mod;
        int val=(int)((x*y)%mod);
        return val;
    }
}