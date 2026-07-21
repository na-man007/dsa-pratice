class Solution {
    public int minimumRecolors(String blocks, int k) {
        // we will calculate no of W in intial k, that is answer and with each retrieval we change it 

        int ans = Integer.MAX_VALUE, ct=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i) == 'W')
            ct++;
        }
        ans = Math.min(ct,ans);
        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(i) == 'W')
            ct++;
            if(blocks.charAt(i-k) == 'W')
            ct--;

            ans = Math.min(ans, ct);
        }
        return ans;
    }
}