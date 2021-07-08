class Solution {
    fun lengthOfLastWord(s: String): Int {
        for (index in s.split(" ").reversed()) {
            if(index.isNotEmpty()) {
                return index.length
            }
        }
        return 0
    }
}