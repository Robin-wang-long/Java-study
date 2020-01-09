package 寒假蓝桥练习.第一周A;

import java.util.Scanner;

public class 迭代法求正数的平方根 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double eps = sc.nextDouble();
        int n = 1;
        double t = a/2;
        double q  = (t+(a*1.0)/t)/2;
        while(Math.abs(q-t)>=eps){
            t=q;
            q=(t+(a*1.0)/t)/2;
            n++;

        }
        double sum = (q+t)/2;
        System.out.printf("%.4f %d",sum,n);
    }
}
