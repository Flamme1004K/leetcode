class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        var zeroCounts = 0
        var prod = 1
        for(n in nums){
            if(n != 0)
                prod *= n
            else
                zeroCounts++
            if(zeroCounts == 2)
                break
        }
        if(zeroCounts==2) {
            for(i in nums.indices){
                nums[i] = 0
            }
        }
        else if(zeroCounts==1){
            for(i in nums.indices){
                if(nums[i] != 0)
                    nums[i] = 0
                else
                    nums[i] = prod
            }
        }
        else{
            for(i in nums.indices){
                nums[i] = prod/nums[i]
            }
        }
        return nums
    }
}