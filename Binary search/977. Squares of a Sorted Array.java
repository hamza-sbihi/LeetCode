class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0;
        int r=nums.length -1;
        int[] res=new int[nums.length];
        int pos=nums.length -1;
        while(l<=r){
        if(nums[l]*nums[l]>=nums[r]*nums[r]){
            res[pos]=nums[l]*nums[l];
            pos--;
            l++;
        }
        else if(nums[l]*nums[l]<nums[r]*nums[r]){
           res[pos]=nums[r]*nums[r];
            pos--;
            r--; 
        }

        }
        return res;
        
    }
}