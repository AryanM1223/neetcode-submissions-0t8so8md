class Solution {
    List<List<Integer>> lt = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(arr,0,nums);
        return lt;
    }
    public void backtrack(List<Integer> arr , int i , int[] nums){
        // base case
        if(i == nums.length){
            lt.add(new ArrayList<>(arr));
            return;
        }

        // add choice 
        arr.add(nums[i]);
        backtrack(arr,i + 1,nums);
        arr.remove(arr.size() - 1);

        // choice to remove duplicates 
        while(i + 1 < nums.length && nums[i] == nums[i + 1]){
            i += 1;
        }
        backtrack(arr,i + 1, nums);


    }
}
