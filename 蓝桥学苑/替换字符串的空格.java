package 蓝桥学苑;

import java.util.Scanner;


public class 替换字符串的空格 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(fa(a));
    }

    private static String fa(String a) {
        return a.replaceAll("\\s","%20");
    }
}
