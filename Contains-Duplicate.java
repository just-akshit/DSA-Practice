1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        HashSet<Integer> set = new HashSet<>();
4        for ( int i : nums){
5            if(set.contains(i)){
6                return true;
7            }
8            set.add(i);
9        }
10        return false;
11    }
12}
13
14
15
16// class Solution {
17//     public boolean containsDuplicate(int[] nums) {
18//         HashMap<Integer, Integer> map = new HashMap<>();
19//         for(int i : nums){
20//             int freq = map.getOrDefault(i, 0) + 1;
21//             if( freq >= 2){
22//                 return true;
23//             }
24//             map.put(i, freq);
25//         }
26//         return false;
27//     }
28// }