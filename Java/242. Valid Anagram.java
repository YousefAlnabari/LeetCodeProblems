class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        int lenS = ss.length, lenT = tt.length;
        if(lenS != lenT)
            return false;
        for(int i = 0; i < lenS; i++)
            if(ss[i] != tt[i])
                return false;
        return true;
    }
}
