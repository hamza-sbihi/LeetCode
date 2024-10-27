class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) {

        helper(0,nums);
        return ans;
    }
    public void helper(int start,int[] nums){
            if(start>=nums.length)
            ans.add(new ArrayList<>(list));
            else{
                list.add(nums[start]);
                helper(start+1,nums);
                list.remove(list.size()-1);
                helper(start+1,nums);
            }
        }
}