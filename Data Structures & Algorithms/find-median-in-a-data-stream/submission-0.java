class MedianFinder {
    PriorityQueue<Integer> lq;
    PriorityQueue<Integer> rq;
    public MedianFinder() {
         lq = new PriorityQueue<>(Collections.reverseOrder());
          rq = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        lq.offer(num);
        rq.offer(lq.poll());
        if(rq.size() > lq.size()){
            lq.offer(rq.poll());
        }
    }
    
    public double findMedian() {
        double mean = 0;
        if(lq.size() > rq.size()){
            mean= lq.peek();
        }
        else{
            double b = lq.peek();
            double c = rq.peek();

            mean =  (double)(c+b)/2.0;
        }
        return mean;
    }
}
