package zohostrings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PatternMatch {

    public static boolean pattern(String pat,String str){
        Map<Character,String> map=new HashMap<>();
        String[] words=str.split(" ");
        if(pat.length()!= words.length){
              return false;
        }
        for(int i=0;i<pat.length();i++) {
            char ch = pat.charAt(i);
            String word=map.get(ch);
            if (word== null) {
                if (map.containsValue(words[i])) {
                    return false;
                }

                map.put(ch, words[i]);
            }
        else if (!word.equals(words[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the pattern");
        String pat = sc.next();
        System.out.println("enter the string ");
        sc.nextLine();
        String str=sc.nextLine();
        System.out.println(pattern(pat,str));
    }
}
