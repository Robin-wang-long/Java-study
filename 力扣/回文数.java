package 力扣;

import java.util.Scanner;

public class 回文数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(isPalindrome(a));
    }

    private static boolean isPalindrome(int a) {
        if(a<0){
            return false;
        }else if(a==0) return true;
        else{
            int q = 0;
            int t;
            int w = a;
            while(a!=0){
                t = a%10;
                a = a/10;
                q = q*10+t;
            }
            if(q==w){
                return true;
            }else{
                return false;
            }
        }
    }
}
