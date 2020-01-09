package 寒假蓝桥练习.第一周A;

import java.util.Scanner;

public class 暴力小学2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        baoli(n);
    }

    private static void baoli(int n) {
        int s=0;
        int sum1 = 0;
        int sum2 = 0;
        int s1[] = new int [1000];
        int s2[] = new int [1000];
        for (int i = 1; i <=6; i++) {
            sum1+=100*i;
            for (int j = 1; j <=6; j++) {
                sum1+=10*j;
                for (int k = 1; k <=6 ; k++) {
                    sum1+=k;
                    for (int l = 1; l <=6 ; l++) {
                        sum2+=100*l;
                        for (int m = 1; m <= 6 ; m++) {
                            sum2+=10*m;
                            for (int o = 1; o <=6 ; o++) {
                                sum2+=o;
                                if(sum1-sum2==n){
                                    s1[s] = sum1;
                                    s2[s] = sum2;
                                    s++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(s);
        for (int i = 0; i < s; i++) {
            System.out.println(s1[i]+"-"+s2[i]);
        }
    }
}
