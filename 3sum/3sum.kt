class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val res = HashSet<List<Int>>()
        nums.sort()
        for (i in nums.indices){
            var j = i+1
            var k = nums.lastIndex
            val tmp = - nums[i]
            while (j < k){
                val sum = nums[j] + nums[k]
                when {
                    sum == tmp -> {
                        res.add(listOf(nums[i],nums[j],nums[k]))
                        j++ // 무한루프가 돌기 때문에 j++, k-- 해줘야함.
                        k--
                    }
                    sum < tmp ->{
                        j++
                    }
                    else ->{
                        k--
                    }
                }
            }
        }
        return res.toList()
    }
}