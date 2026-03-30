class Solution {
    public int secondLargestElement(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int s_largest = Integer.MIN_VALUE;

        for(int i = 0; i<nums.length; i++) {
            if(nums[i] > largest) {
                largest = nums[i];
            }

            if(nums[i] < largest && s_largest <nums[i]) {            
                s_largest=nums[i];
            }
        }

        if(s_largest ==Integer.MIN_VALUE) {
            return -1;
        }
        return s_largest;
    }
}