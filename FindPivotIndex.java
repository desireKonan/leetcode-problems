class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length == 0)
            return -1;

        
        return -1;
    }


    public int sumSubArray(int[] subArray, int start, int end) {
        int sum = 0;
        for(int i = start; i <= end; i++)
            sum += subArray[i];
        return sum;
    }

    public static void main(String[] args) {
        
    }
}