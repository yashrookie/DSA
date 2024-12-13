import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i =0;i<n;i++){
            System.out.println(tribonacci(i));
        }}
        
        public static int tribonacci(int n){
            if(n<=2){
                return n==2?1:n;            
        }
          return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
    }
}