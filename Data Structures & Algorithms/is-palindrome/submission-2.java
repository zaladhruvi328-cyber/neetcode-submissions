class Solution {
    public boolean isPalindrome(String s) {
        int l =0;
        int r = s.length()-1;
        s = s.toLowerCase(Locale.ROOT);
        while(l<r)
        {
            while(l<s.length()-1 && !isAlphaNumeric(s.charAt(l))) l++;
            while(r>=0 && !isAlphaNumeric(s.charAt(r))) r--;

            if(l<s.length()-1 && r>=0 && s.charAt(l)!=s.charAt(r)) 
            {
                return false;
            }
            
            l++;
            r--;
        }
        return true;
    }

    public boolean isAlphaNumeric(char c)
    {
        if((c>='a' && c<='z') ||
           (c>='0' && c<='9'))
           return true;
        return false;
    }
}
