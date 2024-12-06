package patterns;
import java.util.Scanner;


public class rectangle {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printRectangle(1,1,n,m);
    }
    public static void printRectangle(int cst,int nor, int nst,int n, int m){
        if(nor == n+1)
        return;
        if(cst == nst+1)
        System.out.println();
        printRectangle(1,nor+1,nst,n,m);
        return;
    
    System.out.print("*");
    printRectangle(cst+1,nor,nst,n,m);
}
}
