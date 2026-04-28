class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxp = 0;
        for(int p:piles){
            maxp = Math.max(maxp,p);
        }
        int left = 1;
        int right = maxp;
        int mid = 0;
        int minTime = Integer.MAX_VALUE;
        if(h == piles.length)return maxp;
        while(left < right){
             mid = left + (right - left)/2;
            int time = bananaTime( piles , mid);
            if(time > h){
                left = mid + 1;
            }
            else{
                right = mid;
            }


        }

        return left;

    }

    public int bananaTime(int[] nums , int k){
        int time = 0;
        int maxTime = 0;
        for(int num:nums){
              time = (int) Math.ceil((double)num/k);
              maxTime += time;
        }
        return maxTime;
    }
}
