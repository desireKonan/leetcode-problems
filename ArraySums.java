class Solution {
    public int[] runningSum(int[] nums) {
        int[] arraySums = new int[nums.length];

        for(int i = 0; i < arraySums.length; i++)
            for(int j = 0; j <= i; j++)
                arraySums[i] += nums[j];
        
        return arraySums;
    }
}