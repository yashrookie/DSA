import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int []arr = new int[n];
    for(int i =0;i<arr.length;i++){
      arr[i]= scn.nextInt();
    }
    int x= scn.nextInt();
    int[]iarr = allIndices(arr,x,0,0);
    for(int index:iarr){
    System.out.println(index);
  }
}
  public static int[]allIndices(int[]arr,int x,int idx,int fsf){
    if(idx == arr.length){
      return new int[fsf];
    }
    if(arr[idx] == x){
      int[]iarr =allIndices(arr,x,idx+1,fsf+1);
      iarr[fsf]= idx;
      return iarr;
    }
    else{
      return allIndices(arr,x,idx+1,fsf);
    }
  }
}