class Solution {

    public String encode(List<String> strs) {
    // create a string with length appended to each string

    String ans  = "";
    for(String s: strs) {
        ans += s.length() + "#" + s;
    }
    return ans;
}

public List<String> decode(String str) {
    // need to split the string based on the length of each string and the delimiter #
    List<String> ans = new ArrayList<String>();
    int i = 0;
    while(i < str.length()) {
        int j = i;
        while (str.charAt(j) != '#') {
            j++;
        }
        int length = Integer.parseInt(str.substring(i, j));
        ans.add(str.substring(j + 1, j + 1 + length));
        i = j + 1 + length;
    }
    return ans;
}
}
