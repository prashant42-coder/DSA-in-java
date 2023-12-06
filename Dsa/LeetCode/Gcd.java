//  Q no is 1071
//  * Greatest Common Divisor of Strings * 
//  for two strings s and t, we say "t divides s" if and only if s = t + ... + t 
//  (i.e., t is concatenated with itself one or more times).
// Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
// Example 1:
// Input: str1 = "ABCABC", str2 = "ABC"
// Output: "ABC"
// Example 2:

// Input: str1 = "ABABAB", str2 = "ABAB"
// Output: "AB"
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // if the concatenation of str1 and str2 is equal to the concatenation of str2 and str1. If they are not equal, the function returns an empty string
        if(!(str1+str2).equals(str2+str1)) return "";
        //  Otherwise, it returns a substring of str1 starting from the first character and ending at the index equal to the greatest common divisor (GCD) of the lengths of str1 and str2 1.
        int gcd = getGcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }


//the function gcd takes two integer arguments a and b and returns their GCD. The algorithm works by repeatedly taking the remainder of a divided by b until b becomes zero. At that point, the GCD of a and b is a 1. The code you provided is a recursive implementation of the algorithm. If b is zero, the function returns a
    public int getGcd(int a, int b) {
        if (b==0) return a;
        return getGcd(b,a%b);
    }
}