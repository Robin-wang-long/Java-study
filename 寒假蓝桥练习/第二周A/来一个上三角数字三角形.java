package 寒假蓝桥练习.第二周A;

import java.util.Scanner;

/**
 * @Author Robin wang long
 * @create 2020/1/8 11:22
 */
public class 来一个上三角数字三角形 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        hua(n);
    }

    private static void hua(int n) {
        int t = n;
        for (int i = 1; i <= n; i++) {
            System.out.printf("%4d",i);
            int q = i;
            for (int j = 0; j < t-1; j++) {
                q = q+n-j;
                System.out.printf("%4d",q);
            }
            t--;
            System.out.println();
        }
    }
}
