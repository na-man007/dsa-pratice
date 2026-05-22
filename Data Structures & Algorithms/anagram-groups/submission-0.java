class Solution {
    public String sortString(String s){
    char[] arr = s.toCharArray();
    Arrays.sort(arr);
    return new String(arr);
}

public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
    List<List<String>> ans = new ArrayList<List<String>>();
    for(String s: strs){
        if(map.containsKey(sortString(s))){
            map.get(sortString(s)).add(s);
        }
        else{
            ArrayList<String> list = new ArrayList<String>();
            list.add(s);
            map.put(sortString(s), list);
        }
    }
    for(String key: map.keySet()){
        ans.add(map.get(key));
    }
    return ans;
}
}
