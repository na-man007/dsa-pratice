class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder s= new StringBuilder();
        int n=columnNumber;
        while(n>0){
            n--;
            int r=n%26;
            s.append((char)('A'+r));
            n/=26;
        }
        return s.reverse().toString();
    }
}