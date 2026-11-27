class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int case1 = roblinear(nums,0,n-2);
        int case2 = roblinear(nums,1,n-1);
        return Math.max(case1,case2);
    }
    public int roblinear(int[] nums,int start,int end){
        int prev = nums[start];
        int prev2 = 0;
        for(int i=start+1;i<=end;i++){
            int take = nums[i] + prev2;
            int nottake = prev;
            int curr = Math.max(take,nottake);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}