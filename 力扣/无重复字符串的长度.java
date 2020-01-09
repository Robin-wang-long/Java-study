package 力扣;

import java.util.Scanner;

public class 无重复字符串的长度 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        char a[] = s.toCharArray();
        int n  = 0;
        int w = 1;
        int b = 0,c = 0;
        for (int i = 0; i <= a.length; i++) {
            if(c==a.length-1){
                return n;
            }
            if(a[c]==a[c+1]){
                b = c+1;
                n = Math.max(n,w);
                w = 1;
                c++;
            }else if(a[b]==a[c]){
                b = c;
                n = Math.max(n,w);
                w = 1;
                c++;
            }else{
                c++;
                w++;
            }
            n = Math.max(n,w);
        }
        return n;
    }
}
