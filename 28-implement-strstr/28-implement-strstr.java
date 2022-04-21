class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty() || haystack.equals(needle) || haystack.startsWith(needle)) {
            return 0;
        }

        if (haystack.contains(needle)) {
            String[] split = haystack.split(needle);
            return split[0].length();
        }

        return -1;
    }
}