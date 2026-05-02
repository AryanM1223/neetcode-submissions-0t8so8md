class TimeMap {
    HashMap<String,ArrayList<Alpha>> map;

    public TimeMap() {
        this.map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        Alpha alpha = new Alpha(value,timestamp);
       map.computeIfAbsent(key , k -> new ArrayList<>()).add(alpha);
    }
    
    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";
        ArrayList<Alpha> list = map.get(key);
        int left = 0, right = list.size() - 1;
        String result = "";
        while(left <= right){
            int mid = left + (right - left)/2;
            if(list.get(mid).timestamp <= timestamp){
                result = list.get(mid).value;
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return result;
    }
}

class Alpha {
    String value;
    int timestamp;

    public Alpha(String value, int timestamp) {
        this.value = value;
        this.timestamp = timestamp;
    }
}