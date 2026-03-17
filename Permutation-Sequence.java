1class Solution {
2    public String getPermutation(int n, int k) {
3        int fact = 1;
4        List<Integer> lst = new ArrayList<>();
5        for(int i=1; i<n; i++){
6            fact = fact * i;
7            lst.add(i);
8        }
9        lst.add(n);
10        String ans = "";
11        k = k - 1;
12        while(true){
13            ans = ans + lst.get(k/fact);
14            lst.remove(k/fact);
15            if(lst.size()==0){
16                break;
17            }
18            k = k % fact;
19            fact = fact / lst.size();
20        }
21        return ans;
22        
23        
24
25    }
26}