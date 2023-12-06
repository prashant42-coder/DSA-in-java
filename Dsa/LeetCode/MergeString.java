// Q NO is  1768
// Merge Strings Alternately
// You are given two strings word1 and word2. 
// Merge the strings by adding letters in alternating order, starting with word1.
//  If a string is longer than the other, append the additional letters onto the end of the merged string.
// Return the merged string.
// Example 1:
// Input: word1 = "abc", word2 = "pqr"
// Output: "apbqcr"
// Explanation: The merged string will be merged as so:
// word1:  a   b   c
// word2:    p   q   r
// merged: a p b q c r
class Solution {
    public String mergeAlternately(String word1, String word2) {
        // Intalization the String Builder in Empty String to Store the merged result 
       StringBuilder result = new StringBuilder();
       int i = 0;
       // use  while loop for Solve select alternate value 
       while(i<word1.length() || i< word2.length()){
        //    The if statement checks if the value of i is less than the length of the string word1.
        //  If it is, then the character at the ith position of word1 is appended to the result object. 
        //  The result object is likely a StringBuilder object that is used to build a string by appending characters to it
        if(i<word1.length()){
            result.append(word1.charAt(i));
        }
        if(i<word2.length()){
            result.append(word2.charAt(i));

        }
        i++;
        
        
        }
        return result.toString();
    }
}