package 蓝桥学苑;

import java.util.Scanner;

public class 旋转词 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(fa(a,b));
    }

    private static boolean fa(String a, String b) {
        if(a.length()!=b.length()){
            //先判断a，b字符串长度是否相等
            return false;
        }
        //b+b
        StringBuilder sb = new StringBuilder(b).append(b);
        //长度相等情况下判断a，字符串是否被包含于b+b
        return sb.toString().contains(a);

    }
}
