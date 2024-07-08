class Solution {
    public boolean canEatBananas(int k, int[] piles, int h){
        int currentB=k;
        int hours=0;
        for(int p: piles){
            hours+=(p+k-1)/k;
            if(hours>h) return false;
        }
        return hours<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r =Integer.MIN_VALUE;
        int res=Integer.MAX_VALUE;
        for(int p: piles) r=(r<p)? p:r;  
        while(l<=r){
            int m =(r-l)/2 +l;
            if(canEatBananas(m,piles,h)){
            res=Math.min(m,res);
            r=m-1;
            }
            else l=m+1;
        }   
        return res;

    }

}