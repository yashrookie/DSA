import java.util.Scanner;
public class printTraingle {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printTriangle(1,1,m,n);
    }
    public static void printTriangle(int cst,int nor,int nst,int n){
        if( nor == n+1)
        return;
        if( cst == nst+1){
            System.out.println();
            printTriangle(1,nor+1,nst,n);
            return;
        }
        System.out.println("*");
        printTriangle(cst+1,nor,nst,n);
    }
}
