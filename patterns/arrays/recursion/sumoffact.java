import java.util.Scanner;
public class sumoffact {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();int sum =0;
        if(n<0){
            System.out.println("factorail of a number is not defined for negative number");
        }
        for(int i =1;i<=n;i++){
            sum +=fact(i);
        }
        System.out.println("sumoffact from 1 to " +n+ "is" +sum);
    }
    public static int fact(int n){
        if(n ==0 || n==1){
            return 1;
        }
        else {
            return n*fact(n-1);
        }
    }
}
