class Solution {
    public int findPeakElement(int[] nums) {
        int l=0;
        int r=nums.length-1;
        if(r==0) return 0;
        int res=Integer.MIN_VALUE;
        while(l<=r){
            int m =(r-l)/2 +l;
            int left = (m-1==-1)?Integer.MIN_VALUE:nums[m-1];
            int right = (m+1==nums.length)?Integer.MIN_VALUE:nums[m+1];
            if(nums[m]>left && nums[m]>right) return m;
            else if(nums[m]<nums[m+1]) l=m+1;
            else r=m-1;
        }
        return l;
    }
}