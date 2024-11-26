package recursion;
import java.util.Scanner;
public class ReverseArr {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i]= scn.nextInt();
        }
        displayReverseArr(arr,0);
        
    }
    public static void displayReverseArr(int []arr,int idx){
        if(idx == arr.length){
            return;
        }
        displayReverseArr(arr,idx+1);
        System.out.println(arr[idx]);
    }
}
