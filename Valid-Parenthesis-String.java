1class Solution {
2    public boolean checkValidString(String s) {
3       int min = 0, max = 0;
4       int n = s.length();
5       for(int i=0; i<n; i++){
6        
7        if(s.charAt(i) == '('){
8            min++;
9            max++;
10        }
11        else if(s.charAt(i) == ')'){
12            min--;
13            max--;
14        }
15        else{
16            min--;
17            max++;
18        }
19        if(min < 0) min = 0;
20        if(max < 0) return false;
21       }
22       return min == 0; 
23    }
24}