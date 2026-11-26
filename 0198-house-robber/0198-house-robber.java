class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        // int prev1 = 0;
        // int prev2 = 0;
        // for(int i=0;i<n;i++){
        //     int pick = nums[i] + prev2;
        //     int notPick = prev1;
        //     int curr = Math.max(pick,notPick);
        //     prev2 = prev1;
        //     prev1 = curr;
        // }
        if(n==1) return nums[0];
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            int pick = nums[i] + dp[i-2];
            int notpick = dp[i-1];
            dp[i] = Math.max(pick,notpick);
        }
        return dp[n-1];
    }
}