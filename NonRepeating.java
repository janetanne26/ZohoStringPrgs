package zohostrings;

import java.util.Scanner;

public class NonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.next();
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 97]++;
        }
        /*for(int i=0;i<26;i++){
            System.out.println(i+" "+freq[i]);
        }*/
        int index=0;
        for(int i=25;i>=0;i--){
            if(freq[i]==1){
                index=i;
               // System.out.println(index);
                System.out.println((char)(index+97));
                break;
            }
        }

    }
}
