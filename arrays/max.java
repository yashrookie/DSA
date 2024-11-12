import java.util.Scanner;

public class max {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the number of elements");
        int n = scn.nextInt();
        int[]arr = new int[n];
        System.out.print("enter the number of elements");
        for(int i =0;i<n;i++){
            arr[i]= scn.nextInt();
        }  
        int max = Integer.MIN_VALUE;
        for(int num:arr){
            max = Math.max(num,max);

        }   
        System.out.println("max elements is" +max);   
        
    }
    
}
