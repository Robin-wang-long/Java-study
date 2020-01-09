package 寒假蓝桥练习.第一周A;

import java.util.Scanner;

public class 暴力小学3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n =scanner.nextInt();
        int count=0;
        int t;
        int [] aa=new int [100];
        int [] bb=new int [100];
        for (int a1 = 1; a1 <=6; a1++) {
            for (int a2 = 1; a2<=6 ; a2++) {
                for (int a3 = 1; a3 <=6 ; a3++) {
                    for (int b1 = 1; b1 <=6 ; b1++) {
                        for (int b2 = 1; b2 <=6; b2++) {
                            for (int b3 = 1; b3 <=6 ; b3++) {
                                if((a1*100+a2*10+a3-b1*100-b2*10-b3==n)&&a1!=a2&&a1!=a3&&a1!=b1&&a1!=b2&&a1!=b3&&a2!=a3&&a2!=b1&&a2!=b2&&a2!=b3&&a3!=b1&&a3!=b2&&a3!=b3&&b1!=b2&&b1!=b3&&b2!=b3) {
                                    aa[count]=a1*100+a2*10+a3;
                                    bb[count++]=b1*100+b2*10+b3;
                                }
                            }
                        }

                    }

                }

            }

        }
        System.out.println(count);
        for (int i = 0; i < count; i++) {
            System.out.printf("%d-%d\n",aa[i],bb[i]);

        }

    }
}
