// 1716. Calculate Money in Leetcode Bank
// Hercy wants to save money for his first car. He puts money in the Leetcode bank every day.

// He starts by putting in $1 on Monday, the first day. Every day from Tuesday to Sunday, he will put in $1 more than the day before. On every subsequent Monday, he will put in $1 more than the previous Monday.
// Given n, return the total amount of money he will have in the Leetcode bank at the end of the nth day.
 
// Example 1:
// Input: n = 4
// Output: 10
// Explanation: After the 4th day, the total is 1 + 2 + 3 + 4 = 10.

class Solution {
    public int totalMoney(int n) {
        int sum=0;
        int q=n/7;
        int r = n%7 ;
        int a = 0;
        for (int i=0;i<q;i++){
         a = a+1;
         sum+= (7*(2*a+6))/2;
        }
        for (int i=0;i<r;i++){
            a++;
            sum+=a;

        }
        return sum;
    }
}