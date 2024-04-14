class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        String shortest = strs[0];
        for (String s : strs) {
            if (s.length() < shortest.length()) {
                shortest = s;
            }
        }
        
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < shortest.length(); i++) {
            char currentChar = shortest.charAt(i);
            
            for (String s : strs) {
                if (s.charAt(i) != currentChar) {
                    return prefix.toString();
                }
            }
            
            prefix.append(currentChar);
        }
        
        return prefix.toString();
    }
}
