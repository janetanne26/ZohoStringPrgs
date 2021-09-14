package zohostrings;

import java.util.Scanner;

public class ReplaceSubString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        String mainStringArray[]=str.split(" ");

        System.out.println("Enter the substring:");
        String subString=sc.next();

        System.out.println("enter the string to be replaced");
        String newstr=sc.next();
        for(int i=0;i<mainStringArray.length;i++) {
       if(mainStringArray[i].equals(subString)){
           mainStringArray[i]=newstr;
       }


        }
        for(int i=0;i<mainStringArray.length;i++){
            System.out.print(mainStringArray[i]+" ");
        }




    }

    }

