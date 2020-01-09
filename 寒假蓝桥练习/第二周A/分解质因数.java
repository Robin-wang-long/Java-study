package 寒假蓝桥练习.第二周A;

import java.util.Scanner;

public class 分解质因数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (i >= 3) {
                String m = "";
                int k = 2;
                int j = i;
                while (j != k) {
                    if (j % k == 0) {
                        m = m + k + "*";
                        j = j / k;
                    }
                    else if (j % k != 0) {
                        k++;
                    }
                }
                m = m + k;
                System.out.println(i + "=" + m);
            } else {
                System.out.println(i + "=" + i);
            }
        }
    }
}
