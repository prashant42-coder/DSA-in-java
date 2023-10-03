//Print all the sunset of set of first n natural numbers 

import java.util.*;

public class Recursion4 {
    // code for print all the subset
    public static void printSubset(ArrayList<Integer>subset){
        for(int i=-0;i<subset.size();i++){
             System.out.println(subset.get(i)+"");
        }
       System.out.println();
    }// code for find all the subset in here 
    public static void findSubset(int n,ArrayList<Integer>subset){
        if(n==0){
            printSubset(subset);
            return;
        }
        // every element have own choice to go in suset or in array list 
        // add hoga 
        subset.add(n);
        findSubset(n-1, subset); 
        // add nahi hoga
        subset.remove(subset.size()-1);
        findSubset(n-1, subset);
    } 
    // this is the main function 
    public static void main(String[] args) {
        int n=3;
        // we Store subset of element in the array list
         ArrayList<Integer>suset=new ArrayList<>();
     findSubset(n, suset);


    }
}
