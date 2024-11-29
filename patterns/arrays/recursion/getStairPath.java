package recursion;
import java.util.Scanner;
import java.util.ArrayList;
public class getStairPath {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String>paths = getStairPaths(n);
        System.out.println(paths);
    }
    public static ArrayList<String> getStairPaths(int n){
        if(n==0){
            ArrayList<String>bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        else if(n<0){
            ArrayList<String>bres = new ArrayList<>();
            return bres;
        }
        ArrayList<String> paths1 = getStairPaths(n-1);
        ArrayList<String> paths2 = getStairPaths(n-2);
        ArrayList<String> paths3 = getStairPaths(n-3);
        ArrayList<String> paths = new ArrayList<>();
        for(String path1 : paths1){
            paths.add(1+path1);
        }
        for(String path2 : paths2){
            paths.add(2+path2);
        }
        for(String path3 : paths3){
            paths.add(3+path3);
        }
        return paths;
    }
}
