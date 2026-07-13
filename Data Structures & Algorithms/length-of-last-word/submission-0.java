class Solution {
    public int lengthOfLastWord(String s) {
        String s2 =s.strip();
        int l = s2.length();
        int i = l-1;
        while(i>=0){
            if(s2.charAt(i) == ' '){
                return l-1-i;
            }
            i--;
        }
        return l;
    }
}