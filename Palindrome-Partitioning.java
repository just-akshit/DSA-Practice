1class Solution {
2    public List<List<String>> partition(String s) {
3        List<List<String>> ans = new ArrayList<>();
4        List<String> path = new ArrayList<>();
5        part(0,s,path,ans);
6        return ans;
7
8    }
9    public void part(int idx, String s, List<String> path, List<List<String>> ans){
10        if(idx == s.length()){
11            ans.add(new ArrayList<>(path));
12            return;
13        }
14        for(int i = idx; i< s.length(); i++){
15            if(isPalindrome(s, idx, i)){
16                path.add(s.substring(idx, i+1));
17                part(i+1, s, path, ans);
18                path.remove(path.size() - 1);
19            }
20        }
21    }
22    public boolean isPalindrome(String s, int start, int end){
23        while(start<=end){
24            if(s.charAt(start++) != s.charAt(end--)){
25                return false;
26            }
27        }
28        return true;
29    }
30}