import java.util.Scanner;
public class fib {
    public static void main(String[]args){
        int n = 5;
        System.out.println("fibonacci series of 5 number is:");
        for(int i =0;i<n;i++){
            System.out.println(fib(i)+"");
        }
    }
    
        public static int fib(int n){
            if(n ==0)
                return 0;
            
            if(n==1||n==2)
                return 1;
            
            else
                return (fib(n-1)+fib(n-2));
            
        }
    }
    

