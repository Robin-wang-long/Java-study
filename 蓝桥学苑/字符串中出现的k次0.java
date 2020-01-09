package 蓝桥学苑;

import java.util.Scanner;

public class 字符串中出现的k次0 {
    //用正则表达式来完成
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int k = sc.nextInt();
        System.out.println(sdsadas(a,k));
    }

    private static String sdsadas(String a, int k) {
        String w = "0{"+ k + "}";
        return a.replaceAll(w,"");

    }
}
