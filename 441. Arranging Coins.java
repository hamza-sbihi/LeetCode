class Solution {
    public int arrangeCoins(int n) {
        long l=1;
        long r=n;
        int res=0;
       while(l<=r){
        long m=((l+r)/2);
        long coins = (m+1)*(m)/2;
        if(n<coins)
        r=m-1;
        else {
        res=Math.max(res,(int)m);
        l=m+1;
        }
       }
       return res;
        
    }
    
}