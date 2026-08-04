class Solution {
    List<String> result = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        

        HashMap<Character,String> map = new HashMap<>();

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        if (digits == null || digits.length() == 0) {
            return result;
        }
        backtrack(digits, 0, new StringBuilder(), result, map);
        return result;

    }

    public void backtrack(String digits,int idx, StringBuilder curr ,List<String> result,HashMap<Character,String> map){
        if(idx == digits.length()){
            result.add(curr.toString());
            return;
        }

        String letrs = map.get(digits.charAt(idx));

        for(char ch : letrs.toCharArray()){
            curr.append(ch);
            backtrack(digits,idx+1,curr,result,map);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}
