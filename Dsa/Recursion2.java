//Place title of size 1xm in floor of size n x m 
// n=4 and m = 2
public class Recursion2 {
public static int placeTitle(int n,int m){
    // base case like 
    if(n==m){
        return 2;
    }
    if(n<m){
        return 1;
    }

    // Vertically place title

    int verticalPlacement=placeTitle(n-m, m);

    // Horizontally place title 
   int Horizontally=placeTitle(n-1,m);
   // return the value of titles
   return verticalPlacement+Horizontally;
}

 public static void main(String[] args) {
    // place the value of n&m
    int n=2 , m=2;
    // print the value 
    System.out.println(placeTitle(n, m));
 }

}
// if n=2 & m=2 
//output is 2 
