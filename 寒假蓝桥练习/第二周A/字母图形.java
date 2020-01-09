package 寒假蓝桥练习.第二周A;

import java.util.Scanner;

/**
 * @Author Robin wang long
 * @create 2020/1/8 12:14
 */
public class 字母图形 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            char w = (char)('A'+i);
            int q = i;
            char s = w;
            for (int j = 0; j < m; j++) {
                if(q<=0){
                    w = 'A';
                    w = (char)(w+j-i);
                    q--;
                }else {
                    w = s;
                    w = (char) (w - j);
                    q--;
                }
                System.out.print(w);
            }
            System.out.println();
        }
    }
}
