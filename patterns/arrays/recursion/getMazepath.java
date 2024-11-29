package recursion;
import java.util.Scanner;
import java.util.ArrayList;
public class getMazepath {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String>paths = getMazePaths(1,1,n,m);
        System.out.println(paths);
    }
    public static ArrayList<String>getMazePaths(int sc,int sr,int dc,int dr){
        if(sc == dc && sr == dr){
            ArrayList<String>bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String>hpaths = new ArrayList<>(); 
        ArrayList<String>vpaths = new ArrayList<>(); 
        if(sc <dc){
          hpaths=  getMazePaths(sr,sc+1,dc,dr);
        }
        if(sr <dr){
           vpaths= getMazePaths(sr+1,sc,dc,dr);
        }
        ArrayList<String>paths = new ArrayList<>();
        for(String hpath :hpaths){
            paths.add('h'+hpath);
        }
        for(String vpath :vpaths){
            paths.add('v'+vpath);
        }
        return paths;
    }
}
