package zohostrings;

import java.util.Scanner;

public class UpperLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        //String strArr[]=str.split(" ");
        char[] newArr=new char[50];
        int k=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=97&&str.charAt(i)<=122){
                newArr[k++]=(char)(str.charAt(i)-32);
            }
            else if(str.charAt(i)>=65&&str.charAt(i)<=90){
               newArr[k++]= (char)(str.charAt(i)+32);

            }
            else if(str.charAt(i)==' '){
                newArr[k++]=' ';
            }
        }


        for(int i=0;i<k;i++) {
            System.out.print(newArr[i]);

        }

    }
}
