class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> sum = new ArrayList<>();
        combo(nums,target,0,0,sum);

        return ans;
    }

    public void combo(int[] nums , int t , int s, int i, List<Integer> sum){
        
        

        // base case;
        if(s == t){
            ans.add(new ArrayList<>(sum));
            return;
        }

        if(s>t || i == nums.length)return;

        // choice to include 
        sum.add(nums[i]);

        combo(nums,t,s+nums[i],i, sum);
        // undo the add
        sum.remove(sum.size() - 1);

        combo(nums,t,s,i + 1, sum);



    }
}
