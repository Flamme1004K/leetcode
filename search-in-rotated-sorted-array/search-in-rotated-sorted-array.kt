class Solution {
    fun search(nums: IntArray, target: Int): Int {
        for(index in nums.indices) {
            if (nums[index] == target) {
                return index
            }
        }
        return -1
    }
}