class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s: strs){
            char[] chaar = s.toCharArray();
            Arrays.sort(chaar);
            String sorted = new String(chaar);
            map.putIfAbsent(sorted,new ArrayList<>());
            map.get(sorted).add(s);

        }

        return new ArrayList<>(map.values());

    }
}
