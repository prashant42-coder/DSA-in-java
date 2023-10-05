
// Print all Permutations
// Time complexity - O(n*n!)
public class Backtracking1 {
    // Declaer the parameter 
    public static void printPermutation(String str,String perm,int index){
      if(str.length()==0){
        System.err.println(perm);
        return;
      }
        // triversing the String 
        for(int i=0;i<str.length();i++){
            // Declare the current Characters 
            char currChar=str.charAt(i);
           String  newStr=str.substring(0,i)+str.substring(i+1);
            printPermutation(newStr, perm+currChar, index+1);
        }
    }
    public static void main(String[] args) {
        String str="ABC";
        printPermutation(str, "", 0);
    }
}
// OUTPUT:-
// ABC
// ACB
// BAC
// BCA
// CAB
// CBA