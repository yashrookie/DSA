import java.util.Scanner;
public class printEncoding {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printEncoding(str,"");
    }
    public static void printEncoding(String ques,String asf){
        if(ques.length()== 0){
            return;
            
        }
        else if(ques.length() == 1){
            char ch = ques.charAt(0);
            if(ch ==0){
                return;
            }
            else {
                int chv = ch -'0';
                char code = (char)('a' +chv -1);
                asf = asf+code;
                System.out.println(asf);
            }
        }
        else {
            char ch = ques.charAt(0);
            String req = ques.substring(1);
            if(ch ==0){
                return;
            }
            else {
                int chv = ch - '0';
                char code = (char)('a'+chv-1);
                printEncoding(roq,asf+code);
            }
            String ch12v = ques.substring(0,2);
            String roq = ques.substring(2);
            int ch12v = Integer.parseInt(ch12);
            if(ch12v<=26){
                char code = (char)('a'+ch12v - 1);
                printEncoding(roq,asf+code);
            }
        }
    }
    
}
