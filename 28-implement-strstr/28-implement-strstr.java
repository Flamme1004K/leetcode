class Solution {
    public int strStr(String haystack, String needle) {
         if (needle.isEmpty() || haystack.equals(needle)) {
            return 0;
        }

        if(haystack.contains(needle)) {
            if(haystack.startsWith(needle)) {
                return 0;
            }
            String[] split = haystack.split(needle);
            return split[0].length();
        }

        return -1;
    }
}