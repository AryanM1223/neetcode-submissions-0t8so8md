class Solution {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        if (n == 0){
            return res;
        }
        StringBuilder s = new StringBuilder();
        backtrack(s,0,n,0,0);

        return res;

    }
    public void backtrack(StringBuilder s , int i , int n,int o,int c){
        if(i == 2*n){
            res.add(s.toString());
            return;
        }
        // add (
        
        if(o < n){
        s.append("(");
        backtrack(s,i + 1,n,o + 1,c);
       s.deleteCharAt(s.length() - 1);
        }

        // add )
        if(o > c){
        s.append(")");
        backtrack(s,i+1,n,o,c+1);
        s.deleteCharAt(s.length() - 1);
        }
    }
}
