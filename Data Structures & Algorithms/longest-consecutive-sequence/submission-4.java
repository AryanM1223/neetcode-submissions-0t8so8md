class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        if(nums.length == 0)return 0;
        int st = nums[0];
        for(int i = 0; i < nums.length;i++){
            set.add(nums[i]);
        }
        int maxCnt = 0;
       for(int num:nums){
        if(set.contains(num - 1))continue;
        else{
            int s = num;
            int i = 0;
            int cnt = 0;
            while(set.contains(s + i)){
                cnt++;
                i++;
            }
            maxCnt = Math.max(cnt,maxCnt);
           
        }
       }
        
        return maxCnt;
        
    }
}
