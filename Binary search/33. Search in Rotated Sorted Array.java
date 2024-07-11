class Solution {
    public int findMin(int[]nums){
        int l=0;
        int r= nums.length -1;
        while (l <= r) {
            if (nums[l] <= nums[r]) {
                return l;
            }
            int mid = (l + r) / 2;
            if (nums[mid] >= nums[l]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return 0;
    }
    public int search(int[] nums, int target) {

        if(nums.length==2){
            if(nums[0]==target)return 0;
            else if(nums[1]==target) return 1;
            else return -1;
        }

        if(target<nums[nums.length -1]){
            int l1=findMin(nums);
            System.out.println(l1);
            int r1= nums.length -1;
            int m=0;
            while(l1<=r1){
                m=(r1-l1)/2 +l1;
                if(nums[m]<target) l1=m+1;
                else if(nums[m]>target) r1=m-1;
                else return m;
            }
            return -1;

        }
        else if(target>nums[nums.length -1]){
            int l2=0;
            int r2=findMin(nums);
            System.out.println(r2);
            int m=0;
            while(l2<=r2){
                m=(r2-l2)/2 +l2;
                if(nums[m]<target) l2=m+1;
                else if(nums[m]>target) r2=m-1;
                else return m;
            }
            return -1;

        }
        else if(target==nums[nums.length -1]) return nums.length -1;
        else return -1;
        
    }
}