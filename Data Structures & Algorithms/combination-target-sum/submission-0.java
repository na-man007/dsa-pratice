class Solution {
    public List<List<Integer>> combinationSum(int[] n, int t) {
        List<List<Integer>> ans  = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        solve(0,n,curr,ans,0,t);

        return ans;
    }

    void solve(int i, int[] n, List<Integer> curr, List<List<Integer>> ans, int s, int t){
        if(s==t)
        {
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(i>=n.length || s>t)
        return;

        curr.add(n[i]);
        solve(i, n, curr, ans, s+n[i], t);
        curr.remove(curr.size() - 1);
        solve(i+1, n, curr, ans, s, t);
    }
}
