package recursion;
import java.util.Scanner;
public class MazePath1 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMazePaths(1,1,n,m,"");
    }
    public static void printMazePaths(int sc,int sr,int dc,int dr,String psf){
        if(sc>dc || sr>dr){
            return;
        }
        if(sc == dc || sr == dr){
            System.out.println(psf);
            return;
        }
        printMazePaths(sr,sc+1,dr,dc,psf+"h");
        printMazePaths(sr+1,sc,dr,dc,psf+"v");
    }
    
}
