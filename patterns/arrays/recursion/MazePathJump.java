import java.util.Scanner;
public class MazePathJump {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMazePath(1,1,m,n,"");
    }
    public static void printMazePath(int sc,int sr,int dc,int dr,String psf){
        if(sc ==dc || sr == dr){
            System.out.println(psf);
            return;
        }
        for(int ms =1;ms<=dc-sc;ms++){
            printMazePath(sr,sc+1,dc,dr,psf+"h" +ms);
        }
        for(int ms =1;ms<=dr-sr;ms++){
            printMazePath(sr+1,sc,dc,dr,psf+"v" +ms);
        }
        for(int ms =1;ms<=dc-sc && ms<= dr - sr;ms++){
            printMazePath(sr+ms,sc+ms,dc,dr,psf+"d" +ms);
        }
    }
}
