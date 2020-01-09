package 寒假蓝桥练习.第一周A;

import java.util.Scanner;

public class 十数中奇数个数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int n=0;
        for (int i = 0; i < 10; i++) {
            a = sc.nextInt();
            if(a%2!=0){
                n++;
            }
        }
        System.out.println("n="+n);
    }
}
