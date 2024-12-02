import java.util.Scanner;
public class factorial1 {
    public class Main{
        public static void main(String[]args){
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            for(int i =1;i<=n;i++){
                System.out.println("fact of" +i+"is:" +fact(i));
            }
        }
        public static int fact(int n){
            if( n==0 || n==1){
                return 1;
            }
            else {
                return n*fact(n-1);
            }
        }
}
