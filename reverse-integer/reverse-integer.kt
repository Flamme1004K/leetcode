class Solution {
    fun reverse(x: Int): Int {
        val number = StringBuilder()
        val toCharArray = x.toString().reversed().toCharArray()
        if (toCharArray.last() == '-') {
            number.append("-")
        }
        for (index in toCharArray.indices) {
            if (index == 0) {
                if (toCharArray[0] == '0') {
                    number.append("")
                } else {
                    number.append(toCharArray[index])
                }
            } else if (index == toCharArray.lastIndex) {
                if (toCharArray[index] == '-') {
                    number.append("")
                } else {
                    number.append(toCharArray[index])
                }
            } else {
                number.append(toCharArray[index])
            }
        }

        if (number.toString() == "" ) {
            return 0
        }

        if (number.toString().toLong() > Int.MAX_VALUE || number.toString().toLong() < Int.MIN_VALUE) {
        return 0
        }


        return number.toString().toInt()
    }
}