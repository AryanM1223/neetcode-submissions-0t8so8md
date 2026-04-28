class MinStack {
    int[] arr;
    int xpo = -1;

    public MinStack() {
        this.arr = new int[500];
    }
    
    public void push(int val) {
        xpo++;
        arr[xpo] = val;
    }
    
    public void pop() {
        int ret = arr[xpo--];
    }
    
    public int top() {
        int ret = arr[xpo];
        return ret;
    }
    
    public int getMin() {
        int mine = Integer.MAX_VALUE;
        for(int i = 0;i <= xpo;i++){
           mine = Math.min(mine,arr[i]);
        }
        return mine;
    }
}
