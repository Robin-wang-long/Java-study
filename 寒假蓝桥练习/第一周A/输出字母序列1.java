package 寒假蓝桥练习.第一周A;

import java.util.Scanner;

public class 输出字母序列1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b = sc.nextInt();
        char e = a.charAt(0);
        for (int i = 0; i < b; i++) {
            System.out.print(e);
            e = (char) (e-1);

        }

    }
}
