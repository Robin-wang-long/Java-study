package 寒假蓝桥练习.第一周A;

import java.util.Scanner;

public class 奇偶数平均数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        double av1=0,av2=0;
        int s1 = 0;
        int s2 = 0;
        while(a!=0){
            a = sc.nextInt();
            if(a!=0) {
                if (a % 2 == 0) {
                    av1 += a;
                    s1++;
                } else if (a % 2 == 1) {
                    av2 += a;
                    s2++;
                }
            }
        }
        if(av1!=0){

            av1 = av1 / s1 * 1.0;
        }
        if(av2!=0){
            av2 = av2 / s2 * 1.0;
        }
        System.out.printf("av1=%.2f,av2=%.2f",av1,av2);
    }
}
