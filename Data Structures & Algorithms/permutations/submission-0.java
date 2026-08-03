class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ps = new ArrayList<>();
        ps.add(new ArrayList<>());

        for (int num : nums) {
            List<List<Integer>> perm = new ArrayList<>();

            for (List<Integer> p : ps) {
                for (int i = 0; i <= p.size(); i++) {
                    List<Integer> copy = new ArrayList<>(p);
                    copy.add(i, num);
                    perm.add(copy);
                }
            }

            ps = perm;
        }

        return ps;
    }
}