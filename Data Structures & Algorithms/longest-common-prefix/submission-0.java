class Solution {
    public String longestCommonPrefix(String[] strs) {
    int i = 0;
    int minLength = strs[0].length();
    for (String str : strs) {
        minLength = Math.min(minLength, str.length());
    }
    while(i<minLength){
        for(int j=0;j<strs.length;j++){
            if(strs[j].charAt(i) != strs[0].charAt(i)){
                return strs[0].substring(0,i);
            }
        }
        i++;
    }
    return strs[0].substring(0,i);
}
}