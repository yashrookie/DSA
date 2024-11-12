import java.util.Scanner;
public class matrixaddition {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n =3;
        int m =3;
        int [][]matrix1 = new int[n][m];
        int [][]matrix2 = new int[n][m];
        System.out.print("enter the elements of first matrix");
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                matrix1[i][j] =scn.nextInt();
            }
        }
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix2[i][j]=scn.nextInt();
            }
        }
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                matrix1[i][j] += matrix2[i][j];
            }
        }
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                System.out.print(matrix1[i][j]+ "");
            }
            System.out.println();
        }
    }
    
}
