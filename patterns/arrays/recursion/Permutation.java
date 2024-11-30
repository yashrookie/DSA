package recursion;
import java.util.Scanner;
public class Permutation {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printPermutation(str, "");
    }
    public static void printPermutation(String ques,String asf){
        if(ques.length() == 0){
            System.out.println(asf);
            return;
        }
        for(int i =0;i<ques.length();i++){
            char ch = ques.charAt(i);
            String qlpart = ques.substring(0,i);
            String qrpart = ques.substring(i+1);
            String roq = qlpart +qrpart;
            printPermutation(roq,asf+ch);
        }
    }
}
