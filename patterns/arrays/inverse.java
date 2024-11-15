import java.util.Scanner;
public class inverse { 
    public static void main(String[]args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int []arr = new int[n];
    for(int i =0;i<n;i++){
        arr[i]= scn.nextInt();
    }
    int []invArr = inverse(arr);
    System.out.println("Inversed array");
    for(int i =0;i<invArr.length;i++){
        System.out.print(invArr+" ");
    }
}
public static int[]inverse(int[]arr){
    int[]inverse = new int[arr.length];
    for(int i =0;i<arr.length;i++){
        int v = arr[i];
        inverse[v]= i;
    }
    return inverse;
}
}
    

