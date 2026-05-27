class Solution {
    private int[] topKFrequent(int[] nums, int k) {
    int [] ans = new int[k];
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for(int i: nums) {
        if (map.containsKey(i)) {
            map.put(i, map.get(i) + 1);
        } else {
            map.put(i, 1);
        }
    }

    // create an array of lists to store the numbers based on their frequency
    List<Integer>[] buckets = new List[nums.length + 1];
    for (int key: map.keySet()) {
        int freq = map.get(key);
        if (buckets[freq] == null) {
            buckets[freq] = new ArrayList<Integer>();
        }
        buckets[freq].add(key);
    }

    // traverse the buckets from the end to get the most frequent elements
    int index = 0;
    for (int i = buckets.length - 1; i >= 0 && index < k; i--) {
        if (buckets[i] != null) {
            for (int num : buckets[i]) {
                ans[index++] = num;
                if (index == k) {
                    break;
                }
            }
        }
    }

    return ans;
}

}
