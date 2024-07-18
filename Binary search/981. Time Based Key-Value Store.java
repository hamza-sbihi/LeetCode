class TimeMap {

    HashMap<String,List<Pair<String,Integer>>> m;

    public TimeMap() {
        m=new HashMap<>(); 
    }
    
    public void set(String key, String value, int timestamp) {
      if(!m.containsKey(key)) m.put(key,new ArrayList<>());
      m.get(key).add(new Pair(value,timestamp));  
    }
    
    public String get(String key, int timestamp) {
        if(!m.containsKey(key)) return "";
        List<Pair<String,Integer>> list=m.get(key);
        int l =0;
        int r=list.size()-1;
        int res=0;
        while(l<=r){
            int m=(r-l+1)/2 +l;
            if(list.get(m).getValue()<=timestamp){
                res=m;
                l=m+1;
            }
            else r=m-1;
        }
        return list.get(res).getValue() <=timestamp ? list.get(res).getKey():"";
    }
}