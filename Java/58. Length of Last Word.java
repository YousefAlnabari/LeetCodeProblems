class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split("\\s+");
        int len = 0;
        for(int i = 0; i < words.length; i++)
            if(words[i] != " ")
                len = words[i].length();
        return len;
    }
}
