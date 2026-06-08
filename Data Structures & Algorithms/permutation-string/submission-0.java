class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length())return false;
        int k = s1.length();
        HashMap<Character , Integer> map = new HashMap<>();
        HashMap<Character , Integer> mp = new HashMap<>();
        for(char c : s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        int j = 0;
        while(j != k){
            char s = s2.charAt(j);
            mp.put(s,mp.getOrDefault(s,0) + 1);
            j++;
        }
        if(map.equals(mp)) return true;
        for(int i = k;i < s2.length();i++){
            char add = s2.charAt(i);
            mp.put(add,mp.getOrDefault(add,0)+1);

            char removed = s2.charAt(i - k);
            mp.put(removed , mp.get(removed) - 1);

            if(mp.get(removed) == 0){
                mp.remove(removed);
            }

            if(map.equals(mp))return true;
        }
        return false;
    }
}
