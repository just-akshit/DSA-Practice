1class Solution {
2    public int firstUniqChar(String s) {
3        int[] freq = new int[26];
4        for(char ch : s.toCharArray()){
5            freq[ch - 'a']++;
6        }
7        for(int i=0; i<s.length(); i++){
8            if(freq[s.charAt(i) - 'a'] == 1){
9                return i;
10            }
11        }
12        return -1; 
13        
14    }
15}