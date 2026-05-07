class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for(String s:strs){
            int length = s.length();
            str.append(length + "#" + s);
        }
        return str.toString();

    }

    public List<String> decode(String str) {
        List<String> code = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;

            while(str.charAt(j) != '#'){
                j++;
            }

            int len = Integer.parseInt(str.substring(i,j));
            String word = str.substring(j+1,j+1+len);
            code.add(word);
            i = j + len + 1;
            
        }

        return code;
    }
}
