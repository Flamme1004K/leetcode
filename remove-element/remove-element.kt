class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var pointer = 0;


        for (i in nums.indices) {
            if(nums[i] != `val`) {
                nums[pointer++] = nums[i]
            }
        }

        return pointer
    }
}