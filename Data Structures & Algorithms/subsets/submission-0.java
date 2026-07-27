class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> curr = new ArrayList<>();

        backtrack(0,curr,nums);
        return list;
        
    }

    public void backtrack(int idx , ArrayList<Integer> curr, int[] nums){
        if(idx == nums.length){
            list.add(new ArrayList<Integer>(curr));
            return;
        }

       
        curr.add(nums[idx]);
     
        backtrack(idx + 1 , curr,nums);

        curr.remove(curr.size() - 1);
        backtrack(idx + 1 , curr,nums);
    }
}
