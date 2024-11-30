import java.util.ArrayList;
import java.util.Scanner;

public class getMazePath1 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String>paths = getMazePaths(1,1,m,n);
        System.out.println(paths);
    }
    public static ArrayList<String>getMazePaths(int sc,int sr,int dc, int dr){
        if(sc == dc && sr == dr){
            ArrayList<String>bres = new ArrayList<>();
            bres.add("");
            return  bres;
        }
        ArrayList<String> paths = new ArrayList<>();
        //horizontal row
        for(int ms =1;ms<=dc-sc;ms++){
            ArrayList<String>hpaths = getMazePaths(sr,sc+ms,dr,dc);
            for(String hpath :hpaths){
                paths.add("h" +ms+hpath);
            }
        }
        //vertical columns
        for(int ms =1;ms<=dr-sr;ms++){
            ArrayList<String>vpaths = getMazePaths(sr+ms,sc,dr,dc);
            for(String vpath :vpaths){
                paths.add("v" +ms+vpath);
            }
        }
        //diagonal
        for(int ms =1;ms<=dc-sc && ms<=dc-sc;ms++){
            ArrayList<String>dpaths = getMazePaths(sr+ms,sc+ms,dr,dc);
            for(String dpath :dpaths){
                paths.add("d" +ms+dpath);
            }
        }
        return paths;
    }
    
}
