class Solution {
    public boolean isShippable (int cap, int days, int[] weights){
        int ship=1;
        int currentCap=cap;
        for(int w: weights){
            if(currentCap>=w){
                currentCap-=w;               
            }
            else {
                currentCap=cap;
                ship++;
                currentCap-=w;
            }
        }
        return ship<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l=Integer.MIN_VALUE;
        int r=0;
        for(int w: weights){
            if(w>l) l=w;
            r+=w;
        }
        l=Math.max(l,r/days);
        int res=r;
        while(l<=r){
            int cap =(r+l)/2;
            if(isShippable(cap,days,weights)){
                res=Math.min(res,cap);
                r=cap-1;
            }else
            {l=cap+1;}
            
        }
        return res;
        
    }
}