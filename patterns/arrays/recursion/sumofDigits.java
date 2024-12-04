import java.util.Scanner;
public class sumofDigits {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int result = sumofDigits(n);
        int factorialResult =fact(result);
        //for(int i =1;i<=n;i++)
        System.out.println("sumofDigits"+n+ "is" +result);
        System.out.println("the factorial of sumofdigits is" +factorialResult);
    }
    public static int sumofDigits(int n){
        if(n ==0){
            return 0;
        }
        return (n%10 )+sumofDigits(n/10);
    }
    public static int fact(int n){
        if( n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
