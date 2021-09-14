package zohostrings;

import java.util.Scanner;

public class SwapCorner {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        int len=str.length();
        String first="";
        String last="";
        String middle="";
        //for storing first ele
        int i=0;
        for(i=0;i<len;++i){
            if(str.charAt(i)==' '){
                break;
            }
            last=last+str.charAt(i);
        }
        // for storing last ele
        int j=0;
        for( j=len-1;j>=0;--j){
            if(str.charAt(j)==' '){
                break;
            }
            first=str.charAt(j)+first;
        }
        //middle ele
        for(int k=j-1;k>i;--k){
            if(str.charAt(k)==' '){
                middle=middle+" ";
            }
            else{
                middle=middle+str.charAt(k);
            }
        }
        System.out.print(first+" "+middle+" "+last);
    }

}









