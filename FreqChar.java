package zohostrings;

import java.util.Arrays;
import java.util.Scanner;

public class FreqChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.next();

        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 97]++;
        }
        int first=0;
        int second=0;
       // Arrays.sort(freq);
        for (int i = 0; i <26; i++) {
            if (freq[i] > freq[first])
            {
                second = first;
                first = freq[i];
            }


            else if (freq[i] > freq[second] &&
                    freq[i] != freq[first]) {
                second = freq[i];

            }

        }
        System.out.println((char)(second+97)+" ");


    }
}
