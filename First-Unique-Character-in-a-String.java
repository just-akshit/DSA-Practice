1class Solution {
2    public int firstUniqChar(String s) {
3        HashMap<Character, Integer> map = new HashMap<>();
4        for (char ch : s.toCharArray()) {
5            map.put(ch, map.getOrDefault(ch, 0) + 1);
6        }
7        for (int i = 0; i < s.length(); i++) {
8            if (map.get(s.charAt(i)) == 1){
9                return i;
10            }
11        }
12        return -1;
13    }
14}
15
16// class Solution {
17//     public int firstUniqChar(String s) {
18//         int[] freq = new int[26];
19//         for(char ch : s.toCharArray()){
20//             freq[ch - 'a']++;
21//         }
22//         for(int i=0; i<s.length(); i++){
23//             if(freq[s.charAt(i) - 'a'] == 1){
24//                 return i;
25//             }
26//         }
27//         return -1; 
28
29//     }
30// }