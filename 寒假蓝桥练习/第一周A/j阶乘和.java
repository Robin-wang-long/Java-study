package 寒假蓝桥练习.第一周A;


import java.util.Scanner;

public class j阶乘和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k,i=0,sum=1,a=1;
        int j;
        long s[][] = new long[2][100];
        while (sc.hasNext()) {
            for (j = 0; j < i - 1; j++) {
                sum = 1;
                a = 1;
                for (k = 2; k <= s[0][j]; k++) {
                    a = (a % 1000000007) * k;
                    sum = sum % 1000000007 + a % 1000000007;
                }
                s[1][j] = sum;
            }
            for (j = 0; j < i - 1; j++)
                System.out.println(s[1][j] % 1000000007);
        }

    }
}
