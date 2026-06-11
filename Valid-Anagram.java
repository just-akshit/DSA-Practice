1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length() != t.length()) return false;
4        int[] freq = new int[26];
5        for(int i=0; i<s.length(); i++){
6            freq[s.charAt(i) - 'a']++;
7            freq[t.charAt(i) - 'a']--;
8        }
9        for( int cnt : freq){
10            if(cnt != 0){
11                return false;
12            }
13        }
14        return true;
15        
16    }
17}
18
19
20
21// class Solution {
22//     public boolean isAnagram(String s, String t) {
23//         if(s.length() != t.length()) return false;
24//       HashMap<Character, Integer> map1 = new HashMap<>();   
25//       HashMap<Character, Integer> map2 = new HashMap<>();   
26//       for(char ch : s.toCharArray()){
27//         map1.put(ch, map1.getOrDefault(ch, 0) + 1);
28//       }
29//       for(char ch : t.toCharArray()){
30//         map2.put(ch, map2.getOrDefault(ch, 0) + 1);
31        
32//       }
33//       if(map1.equals(map2)){
34//         return true;
35//       }
36//       return false;
37
38
39//     }
40// }