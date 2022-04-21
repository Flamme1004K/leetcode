class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            char a = strs[0].charAt(i);
            boolean flag = false;
            for (String s : strs) {
                if (i >= s.length()) {
                    flag = false;
                    break;
                }

                char c = s.charAt(i);
                if (c != a) {
                    flag = false;
                    break;
                }
                flag = true;
            }
            if (flag) {
                str.append(a);
            } else {
                break;
            }
        }

        return str.toString();
    }
}