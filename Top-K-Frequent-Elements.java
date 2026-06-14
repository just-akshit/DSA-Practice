1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        for(int i : nums){
5            map.put(i, map.getOrDefault(i,0) + 1);
6        }
7        List<Integer> lst = new ArrayList<>(map.keySet());
8
9        lst.sort((a,b) -> map.get(b) - map.get(a));
10
11        int[] ans = new int[k];
12        for(int i=0; i<k; i++){
13            ans[i] = lst.get(i);
14        }
15        return ans;
16
17    }
18}