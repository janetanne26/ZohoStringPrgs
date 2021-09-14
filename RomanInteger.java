package zohostrings;

import java.util.Scanner;
    public class RomanInteger {
        public static int val(char a){
            if(a=='I')
                return 1;
            if(a=='V')
                return 5;
            if(a=='X')
                return 10;
            if(a=='L')
                return 50;
            if(a=='C')
                return 100;
            if(a=='D')
                return 500;
            if(a=='M')
                return 1000;
            return -1;
        }
        public static int romanInt(String str){
            int ans=0;
            int st2=0;
            for(int i=0;i<str.length();i++) {
                int st1 = val(str.charAt(i));
                //System.out.println(st1);
                if (i + 1 < str.length()) {
                    st2 = val(str.charAt(i + 1));
                    //System.out.println(st2);

                    if (st1 >= st2) {
                        ans = ans + st1;
                    } else {
                        ans = ans + st2 - st1;
                        i++;
                    }
                }
                else{
                    ans=ans+st1;
                }

            }
            return ans;
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            System.out.println("enter the string");
            String str=sc.next();
            System.out.println(romanInt(str));
        }
    }


