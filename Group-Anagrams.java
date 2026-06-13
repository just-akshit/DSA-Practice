1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        HashMap<String, List<String>> map = new HashMap<>();
4        for(String s : strs){
5            char[] arr = s.toCharArray();
6            Arrays.sort(arr);
7            String key = new String(arr);
8
9            if(!map.containsKey(key)){
10                map.put(key, new ArrayList<>());
11            }
12            // map.putIfAbsent(key, new ArrayList<>());
13            map.get(key).add(s);
14        }
15    return new ArrayList<>(map.values());
16    }
17}