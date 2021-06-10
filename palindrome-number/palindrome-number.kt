class Solution {
    fun isPalindrome(x: Int): Boolean {
        if ( x < 0) {
            return false
        }

        (x.toString().reversed().toCharArray().joinToString("").toLong()).run {
            if ( this > Int.MAX_VALUE) {
                return false
            }
            if ( this == x.toLong()) {
                return true
            }
        }

        return false
    }
}