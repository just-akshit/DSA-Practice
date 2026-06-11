1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length() != t.length()) return false;
4      HashMap<Character, Integer> map1 = new HashMap<>();   
5      HashMap<Character, Integer> map2 = new HashMap<>();   
6      for(char ch : s.toCharArray()){
7        map1.put(ch, map1.getOrDefault(ch, 0) + 1);
8      }
9      for(char ch : t.toCharArray()){
10        map2.put(ch, map2.getOrDefault(ch, 0) + 1);
11        
12      }
13      if(map1.equals(map2)){
14        return true;
15      }
16      return false;
17
18
19    }
20}