class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int[] arr = new int[2];
        int n = numbers.length;
        int right = n - 1;
        while(left < right){
            if(numbers[left] + numbers[right] == target){
                    arr[0] = left + 1;
                    arr[1] = right + 1;
                    break;
            }
            if(numbers[left] + numbers[right] > target){
                right--;
            }
            else{
                left++;

            }
        }

        return arr;
    }
}
