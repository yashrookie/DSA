package recursion;

public class fact {
    public static void main(String[]args){
        int n = 5;
        //System.out.println("factorial of a number is:");
        //for(int i =0;i<n;i++){
            System.out.println("fact of" +n+ "is" +fact(n));
        //}
    }
    
        public static int fact(int n){
            
            if(n==0||n==1)
                return 1;
            
            else
                return n*fact(n-1);
            
        }
    }

    

