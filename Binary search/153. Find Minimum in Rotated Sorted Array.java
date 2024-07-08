class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int r= nums.length -1;
        int res =Integer.MAX_VALUE;
        while(l<=r){
            int m = (r-l)/2 +l;
            res=(nums[m]<res)?nums[m]:res;
            if(nums[m]<nums[r]){
                r=m-1;
            }else l=m+1;
        }
        return res;
        
    }
}