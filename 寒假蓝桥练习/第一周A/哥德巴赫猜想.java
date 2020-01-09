package 寒假蓝桥练习.第一周A;

import java.util.Scanner;

public class 哥德巴赫猜想 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10000];
        int i=0;
        int b=1;
        while(b!=0){
            b = sc.nextInt();
            if(b!=0){
                a[i]=b;
                i++;
            }
        }
        for (int j = 0; j < i; j++) {
           int s = nb(a[j]);
            System.out.println(s);
        }
    }

    private static int nb(int i) {
        int s = 0;
        for (int j = 2; j <= i/2; j++) {
            if(sushu(j)){
                if(sushu(i-j)){
                    s++;
                }
            }
        }
        return s;
    }

    private static boolean sushu(int j) {
        for (int i = 2; i < j; i++) {
            if(j%i==0){
                return false;
            }
        }
        return true;
    }

}
