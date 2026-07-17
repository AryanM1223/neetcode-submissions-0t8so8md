class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) ->{
            int distA = (a[0]*a[0]) + (a[1]*a[1]);
            int distB = (b[0]*b[0]) + (b[1]*b[1]);

            return distB - distA;
        });
        int[][] ans = new int[k][2];
        for(int[]num:points){
            pq.offer(num);
            if(pq.size() > k){
                pq.poll();
            }

            }

           for (int i = 0; i < k; i++) {
                ans[i] = pq.poll();
            }

        return ans;
    }
}
