import java.util.Scanner;
public class TargetSumSubsets {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i =0;i<arr.length;i++){
          arr[i]= scn.nextInt();
        }
        int tar = scn.nextInt();
        printTargetSumSubsets(arr,0,"",0,tar);
      }
      public static void printTargetSumSubsets(int[]arr,int idx,String set,int sos,int tar){
        if( idx == arr.length){
          System.out.println(set +".");
          return;
        }
        printTargetSumSubsets(arr,idx+1,set+arr[idx]+",",sos+arr[idx],tar);
        printTargetSumSubsets(arr,idx+1,set,sos,tar);
      }
    }
}
