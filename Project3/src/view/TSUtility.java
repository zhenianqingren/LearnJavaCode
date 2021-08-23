package view;

import java.util.*;

public class TSUtility {
    private static Scanner scanner = new Scanner(System.in);

//    read char selected :1~4
    public static char readMenuSelection() {
        char c;
        for(;;){
            String str=readKeyBoard(1,false);
            c=str.charAt(0);
            if(c!='1'&&c!='2'&&c!='3'&&c!='4'){
                System.out.println("输入错误，请重新输入");
            }
            else
                break;
        }
        return c;
    }

//    prompt and wait until Enter is pressed
    public static void readReturn(){
        System.out.println("按回车继续……");
        readKeyBoard(100,true);
    }

//    read an integer with length less than 2 and return it
    public static int readInt(){
        int n;
        for(;;){
            String str=readKeyBoard(2,false);
            try {
                n=Integer.parseInt(str);
                break;
            }catch (NumberFormatException e){
                System.out.println("数字输入错误，请重新输入");
            }
        }
        return n;
    }
//  read Y or N as return
    public static char readConfirmSelection(){
        char c;
        for(;;){
            String str=readKeyBoard(1,false).toUpperCase();
            c=str.charAt(0);
            if(c=='Y'||c=='N')
                break;
            else
                System.out.println("选择错误，请重新输入");
        }
        return c;
    }

    private static String readKeyBoard(int limit,boolean blankReturn){
        String line="";
        while (scanner.hasNextLine()){
            line=scanner.nextLine();
            if(line.length()==0){
                if (blankReturn)return line;
                else continue;
            }
            if (line.length()<1||line.length()>limit){
                System.out.println("长度不符合规定，请重新输入");
                continue;
            }
            break;
        }
        return line;
    }

}

























