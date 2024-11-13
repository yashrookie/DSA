import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i =0;
        int j = n-1;
        int[]arr = new int[n];
        for(int k =0;k<n;k++){
            arr[k] = scn.nextInt();
        }
        while(i<j){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
        System.out.println("reversed arrays" +Arrays.toString(arr));
    }
    
}