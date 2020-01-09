package 力扣;

import java.util.Scanner;

public class 整数反转{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(reverse(a));
    }
    public static int reverse(int x) {
        long a = x;
        long res = 0;
        while (a!=0){
            long t  = a%10;
            a = a/10;
            res = res*10+t;
        }
        if(res>Integer.MAX_VALUE||res<Integer.MIN_VALUE){
            return 0;
        }
        return (int)res;
    }
}
