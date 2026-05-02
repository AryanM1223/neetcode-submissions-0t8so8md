class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int result = Integer.MAX_VALUE;
        int right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left)/2;
            result = Math.min(result,nums[mid]);
            if(nums[right] <= nums[mid]){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }

        return Math.min(result, nums[left]);
    }
}
