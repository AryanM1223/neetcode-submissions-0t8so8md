class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = speed.length;
        int[][] fin = new int[n][2];
        Stack<Double> st = new Stack<>();

        for(int i = 0; i < n; i++){
            fin[i][0] = position[i];
            fin[i][1] = speed[i];
        }

        Arrays.sort(fin, (a,b) -> Integer.compare(b[0],a[0]));

        for(int i = 0; i < n; i++){
            double time = (double)(target - fin[i][0])/fin[i][1];
            if (st.isEmpty() || time > st.peek()) {
                st.push(time);
            }
        }

        return st.size();
    }
}
