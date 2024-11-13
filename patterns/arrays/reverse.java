import java.util.Scanner;
import java.util.Arrays;
public class reverse {
    public static void reverse(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int i =0;
        int j =arr.length-1;
        while(i<j){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
        System.out.println("Reversed Arrays" +Arrays.toString(arr));
    }
    
}
