class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(String s: strs)
        {
            int[] count = new int[26];
            for(int i=0;i<s.length();i++)
            {
                count[s.charAt(i)-'a']++;
            }
            String ss = Arrays.toString(count);
            
            map.putIfAbsent(ss, new ArrayList<>());
            map.get(ss).add(s);

        }

        result.addAll(map.values());
        return result;
    }
}
