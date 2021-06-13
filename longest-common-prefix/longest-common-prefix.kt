class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var overlapStr = ""
        val strsArray = strs.map { str ->
            if(str == "") {
                return overlapStr
            }
            str.toCharArray()
        }

        if(strsArray.size == 1) {
            return strs[0]
        }

        for (i in strsArray[0].indices) {
            var flag = true
            var str = ""
            for(j in 1 until strsArray.size) {
                if(i == strsArray[j].size) {
                    flag = false
                    break
                }
                if(strsArray[0][i] == strsArray[j][i]) {
                    str = strsArray[0][i].toString()
                } else {
                    flag = false
                    break
                }
            }

            if (flag) {
                overlapStr += str
            } else {
                break
            }
        }

        return overlapStr
    }
}