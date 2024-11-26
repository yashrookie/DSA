import java.util.Scanner;
public class powerlogarithmetic {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        int xn = power(x,n/2);
        System.out.println(xn);
    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int xpnb2 = power(x,n/2);
        int xn = xpnb2*xpnb2;
        if(n%2==1){
            xn = xn*x;
        }
        return xn;
    }
}
    

