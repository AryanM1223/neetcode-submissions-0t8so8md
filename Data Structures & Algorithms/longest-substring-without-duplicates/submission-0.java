class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int maxL = 0;
        
        char[] arr = s.toCharArray();
        HashSet<Character> set = new HashSet<>();

        while (right < arr.length) {
            while (set.contains(arr[right])) {
                set.remove(arr[left]);
                left++;
            }

            set.add(arr[right]);

            maxL = Math.max(maxL, right - left + 1);

            right++;
        }

        return maxL;
    }
}