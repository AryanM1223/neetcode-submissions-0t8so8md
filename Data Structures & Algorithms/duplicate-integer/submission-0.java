class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
           map.put(num,map.getOrDefault(num,0) + 1);
        }

        for(int num:nums){
            int cnt = map.get(num);
            if(cnt > 1){
                return true;
            }
        }

        return false;
    }
}