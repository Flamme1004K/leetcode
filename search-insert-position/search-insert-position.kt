class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var result = 0;
        nums.forEach { i ->
            if (i < target) {
                result++
            }
        }
        return result
    }
}