class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var bestSum = nums[0]
        var currentSum = nums[0]
        
        for (i in 1 until nums.size) {
            currentSum = maxOf(nums[i], currentSum + nums[i])
            bestSum = maxOf(bestSum, currentSum)
        }
        return bestSum
    }
}