public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];   
        int currentMax = nums[0]; 

        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {1};
        int[] nums3 = {5, 4, -1, 7, 8};

        System.out.println("Max Subarray Sum (Example 1): " + solution.maxSubArray(nums1)); 
        System.out.println("Max Subarray Sum (Example 2): " + solution.maxSubArray(nums2)); 
        System.out.println("Max Subarray Sum (Example 3): " + solution.maxSubArray(nums3)); 
    }
}
