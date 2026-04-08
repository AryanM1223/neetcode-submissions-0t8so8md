class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int[] and = new int[2];
        int cnt = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int difference = target - nums[i];
            if(map.containsKey(difference)){
                  ans[0] = map.get(difference);
                ans[1] = i; 
        
            }
            else{
               map.put(nums[i] , i);
            }

        }
        return ans;



        
    }

    public static void reverse(int[] arr) {
    int left = 0, right = arr.length - 1;

    while (left < right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        left++;
        right--;
    }
}
}
