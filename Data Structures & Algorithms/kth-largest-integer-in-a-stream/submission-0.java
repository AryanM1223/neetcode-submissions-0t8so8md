class KthLargest {
     PriorityQueue<Integer> pq;
     int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.pq = new PriorityQueue<>(k);
        for(int num:nums){
            pq.offer(num);
        }
    }
    
    public int add(int val) {
       pq.offer(val);

       if(pq.size() > k ){
        while(pq.size() > k){
            pq.poll();
        }
       }
        int a = pq.peek();
       return a;
    }
}
