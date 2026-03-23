1class Solution {
2    public boolean lemonadeChange(int[] bills) {
3        int five =0, ten = 0;
4        for(int i=0; i<bills.length; i++){
5            if(bills[i] == 5){
6                five = five + 1;
7            }
8            else if(bills[i] == 10){
9                if(five > 0){
10                    five -= 1;
11                    ten += 1;
12                }
13                else{
14                    return false;
15                }
16            }
17            else{
18                if(ten > 0 && five > 0){
19                    ten -= 1;
20                    five -= 1;
21                }
22                else if( five >= 3){
23                    five -= 3;
24                }
25                else{
26                    return false;
27                }
28            }
29        }
30        return true;
31    }
32}