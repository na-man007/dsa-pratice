class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> mp  = new HashMap<>();
        for(int x:arr){
            mp.put(x, mp.getOrDefault(x,0)+1);
        }

        int ans = -1;

        for (Map.Entry<Integer,Integer> mapElement : mp.entrySet()) {
            if(mapElement.getKey() == mapElement.getValue())
            {
                ans = Math.max(ans, mapElement.getKey());
            }
        }

        return ans;
    }
}