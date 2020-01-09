package 寒假蓝桥练习.第一周A;

import java.util.Scanner;

public class 输入输出练习 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int [n][2];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
                sum+=a[i][j];
            }
            System.out.println(sum);

        }

    }
}
