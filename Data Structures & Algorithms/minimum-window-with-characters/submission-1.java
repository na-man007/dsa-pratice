class Solution {
    private String minWindow(String s, String t) {
    String ans = "";
    if(s.length()<t.length()) return ans;
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    for(char c: t.toCharArray()){
        map.put(c, map.getOrDefault(c, 0)+1);
    }
    int i=0,j=0;
    while(j<s.length()){
        char c = s.charAt(j);
        if(map.containsKey(c)){
            map.put(c, map.get(c)-1);
        }
        while(allZeroMember(map)){
            String temp = s.substring(i,j+1);
            if(ans.equals("") || temp.length()<ans.length()){
                ans = temp;
            }
            char leftChar = s.charAt(i);
            if(map.containsKey(leftChar)){
                map.put(leftChar, map.get(leftChar)+1);
            }
            i++;
        }
        j++;
    }
    return ans;
}

private boolean allZeroMember(HashMap<Character, Integer> map) {
    for (int val : map.values()) {
        if (val > 0) return false; // if any required count still positive, not satisfied
    }
    return true;
}

}
