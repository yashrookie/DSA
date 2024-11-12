import java.util.Scanner;
public class LargestElementIn2DArrays {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n =3;
        int m =3;
        int [][]arr = new int[n][m];
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int largest = arr[0][0];
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(arr[i][j]>largest){
                    largest = arr[i][j];

                }
            }
        }
        System.out.println("the largest elements is:" +largest);
    }
    
}
