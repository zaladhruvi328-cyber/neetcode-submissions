class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        HashMap<Character,Integer> ss = new HashMap<>();
        for(char c : s.toCharArray())
        {
            ss.put(c,ss.getOrDefault(c,0)+1);
        }
        for(char c : t.toCharArray())
        {
            if(!ss.containsKey(c))
                return false;
            else
            {
                ss.put(c,ss.get(c)-1);
                if(ss.get(c)<0)
                    return false;
            }
        }
        return true;
    }
}
