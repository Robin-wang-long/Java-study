package 寒假蓝桥练习.第二周A;

import java.util.Scanner;

/**
 * @Author Robin wang long
 * @create 2020/1/8 11:05
 */
public class 画菱形 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        huanlingixng(n);
    }

    private static void huanlingixng(int n) {
        int t = 1;
        for (int i = n; i > 0 ; i--) {
            for (int j = i-1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*t-1; j++) {
                System.out.print("*");
            }
            System.out.println();
            t++;
        }
        t = 1;
        for (int i = n-1; i > 0 ; i--) {
            for (int j = t; j > 0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 2*i-1; j > 0 ; j--) {
                System.out.print("*");
            }
            t++;
            System.out.println();
        }
    }
}
