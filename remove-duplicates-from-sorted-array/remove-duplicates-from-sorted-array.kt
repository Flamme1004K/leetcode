class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var pointer = 0

        for (i in 1 until nums.size) {
            if (nums[pointer] != nums[i]) {
                nums[++pointer] = nums[i]
            }
        }

        return pointer + 1
    }
}