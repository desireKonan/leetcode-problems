class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1Start = 0;
        int nums2Start = 0;
        int nums1End   = nums1.length - 1;
        int nums2End   = nums2.length - 1;
        int nums1Mid = 0, nums2Mid = 0;
        double median = 0;

        
        //Tant que les 2 tableaux n'ont pas été totalement parcourus.
        if((nums1.length + nums2.length) % 2 == 0) {
            while(nums1Start <= nums1End || nums2Start <= nums2End) {
                nums1Mid = (nums1Start + nums1End) / 2;
                nums2Mid = (nums2Start + nums2End) / 2;

                if(nums1[nums1Mid] < nums2[nums2Mid]) {
                    nums1Start = nums1Mid + 1;
                    nums2End   = nums2Mid - 1;  
                } else {
                    nums2Start = nums2Mid + 1;
                    nums1End   = nums1Mid - 1;  
                }
            }

            return (double) ( (double) (nums1[nums1Mid] + nums2[nums2Mid]) / 2);
        } else {
            while(nums1Start <= nums1End || nums2Start <= nums2End) {
                nums1Mid = (nums1Start + nums1End) / 2;
                nums2Mid = (nums2Start + nums2End) / 2;

                if(nums1[nums1Mid] < nums2[nums2Mid]) {
                    nums2Start = nums2Mid + 1;
                    nums1End   = nums1Mid - 1; 
                    median = nums2[nums2Mid]; 
                } else {
                    nums2End   = nums2Mid - 1;
                    nums1Start = nums1Mid + 1;
                    median = nums1[nums1Mid]; 
                }
            }
            return median;
        }
    }
}