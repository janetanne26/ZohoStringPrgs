package zohostrings;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.next();
        char[] newArr=new char[26];
        int k=0;

        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 97]++;
        }

        /*for(int i=0;i<26;i++){
            System.out.println(freq[i]);
        }*/
        for(int i=0;i<26;i++){
            if(freq[i]>=1){
                newArr[k++]=(char)(i+97);
            }
        }
        //printing
        for(int i=0;i<k;i++){
            System.out.print(newArr[i]);
        }
    }
}
