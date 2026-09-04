class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        long sum = 0;
        long maxSum = 0;

        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            // Add current element
            sum += nums[right];
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            // Keep window size = k
            if (right - left + 1 > k) {
                int removed = nums[left];

                sum -= removed;

                map.put(removed, map.get(removed) - 1);

                if (map.get(removed) == 0) {
                    map.remove(removed);
                }

                left++;
            }

            // All k elements are distinct
            if (right - left + 1 == k && map.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}