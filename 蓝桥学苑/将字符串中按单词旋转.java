package 蓝桥学苑;

import java.util.Scanner;

public class 将字符串中按单词旋转 {
    //先将整个字符串反转，再去找每个单词，将单词反转
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(revers(a));
    }

    private static String revers(String a) {
        String s = stringreverse(a);
        //切割单词
        String [] word = s.split("\\s");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length; i++) {
            //反转每个单词
            sb.append(stringreverse(word[i])+" ");
        }
        return sb.deleteCharAt(sb.length()-1).toString();
    }

    private static String stringreverse(String a) {
        StringBuilder sb = new StringBuilder(a);
        return sb.reverse().toString();
    }
}
