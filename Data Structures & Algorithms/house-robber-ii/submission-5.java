  class Solution {
      public int rob(int[] nums) {
          int n = nums.length;
          if (n == 1) return nums[0];
          return Math.max(robLine(nums, 0, n - 2), robLine(nums, 1, n - 1));
      }

      private int robLine(int[] nums, int lo, int hi) {
          int prev = 0, curr = 0;   // best through i-2 and i-1
          for (int i = lo; i <= hi; i++) {
              int take = prev + nums[i];
              prev = curr;
              curr = Math.max(curr, take);
          }
          return curr;
      }
  }