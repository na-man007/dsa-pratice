class Solution {
    public boolean checkInclusion(String s1, String s2) {
    int[] count = new int[26];
    if(s2.length()<s1.length()) return false;
    for(int i=0;i<s1.length();i++){
        count[s1.charAt(i) - 'a']++;
        count[s2.charAt(i) - 'a']--;
    }
    if(allZeroCount(count)) return true;
    for(int right=s1.length();right<s2.length();right++) {
        char c = s2.charAt(right);
        count[s2.charAt(right)-'a']--;
        count[s2.charAt(right-s1.length())-'a']++;
        if(allZeroCount(count)) return true;
    }
    return false;
}

public boolean allZeroCount(int[] count) {
    for(int i=0;i<count.length;i++){
        if(count[i]!=0) return false;
    }
    return true;
}
}
