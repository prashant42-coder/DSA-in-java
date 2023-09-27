//Question:- Print all Permutation of a string "abc"
// Permutation means All possible Combination of letters
public class Recursion {
    public static void printPer( String str,String permutation){
        // all caharcters are set there position 
   if(str.length()==0){
    System.out.println(permutation);
    return;
   }
    for(int i=0;i<str.length();i++){
        // choose the character witch we selected 
        char CurrChar = str.charAt(i);
        // "abc"--> "bc"
        // we make new string two part are prsesent
        String newStr= str.substring(0,i)+str.substring(i+1);
         printPer(newStr,permutation+CurrChar);
    }
}
    public static void main(String[] args) {
       String str="abc";
       printPer(str,"");
    }
}
