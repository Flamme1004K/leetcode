class Solution {
    public int dominantIndex(int[] nums) {
       if (nums.length == 1) {
            return 0;
        }

        int maxIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }


        for (int i = 0; i < nums.length; i++) {
            if (i != maxIndex) {
                if (nums[i] * 2 > nums[maxIndex]) {
                    return -1;
                }
            }
        }

        return maxIndex;
    }
}