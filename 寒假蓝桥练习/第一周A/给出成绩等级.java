package 寒假蓝桥练习.第一周A;

import java.util.Scanner;

public class 给出成绩等级 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = 1000;
        while (n>100){
            n = sc.nextDouble();
            if(n<=100){
                panding(n);
            }
        }
    }

    private static void panding(double n) {
        if(n>=90&&n<=100){
            System.out.printf("score="+n+",grade=A");
        }else if(n>=80&&n<=89){
            System.out.print("score="+n+",grade=B");
        }else if(n>=70&&n<=79){
            System.out.print("score="+n+",grade=C");
        }else if(n>=60&&n>=69){
            System.out.print("score="+n+",grade=D");
        }else if(n<60&&n>=0){
            System.out.print("score="+n+",grade=E");
        }
    }
}
