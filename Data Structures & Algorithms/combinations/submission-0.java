class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> currAns = new ArrayList<>();
        dfs(n, k, ans, currAns, 1);
        return ans;
    }

    void dfs(int n , int k, List<List<Integer>> ans, List<Integer> currAns, int i){
        if(currAns.size() == k)
        {
            ans.add(new ArrayList<>(currAns));
            return;
        }
        
        if(i>n)
        return;

        currAns.add(i);
        dfs(n, k, ans, currAns, i+1);
        currAns.remove(currAns.size() -1 );
        dfs(n, k, ans, currAns, i+1);
    }
}