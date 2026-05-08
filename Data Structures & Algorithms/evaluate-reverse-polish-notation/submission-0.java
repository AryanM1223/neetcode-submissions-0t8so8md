class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(String token:tokens){

            if(token.equals("+")){
                int a = st.pop();
                int b = st.pop();
                int c = a + b;
                st.push(c);
            }

             else if(token.equals("*")){
                int a = st.pop();
                int b = st.pop();
                int c= a * b;
                st.push(c);
            }

             else if(token.equals("-")){
                int b = st.pop();
                int a = st.pop();
                int c = a - b;
                st.push(c);
            }

             else if(token.equals("/")){
                int b = st.pop();
                int a = st.pop();
                int c = a / b;
                st.push(c);
            }

            else{
                st.push(Integer.parseInt(token));
            }
        }

        return st.pop();
    }
}
