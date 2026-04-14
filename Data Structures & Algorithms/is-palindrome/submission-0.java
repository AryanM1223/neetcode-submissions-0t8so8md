class Solution {
    public boolean isPalindrome(String s) {
        String clean = s.replaceAll("[^a-zA-Z0-9]", "");

        String a = clean.toLowerCase();
        int n = clean.length();
        int left = 0;
        int right = n - 1;
        while(left<right){
            if(a.charAt(left) != a.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
