package 寒假蓝桥练习.第一周A;

import java.util.Scanner;

public class 那糖果 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()) {
            int n=scanner.nextInt();
            int [] a=new int [n];
            for (int i = 0; i < a.length; i++) {
                a[i]=scanner.nextInt();
            }
            int max=-99999;
            int temp=a[n-1];
            for (int i = n-2; i >=0; i--) {
                if (max<a[i]-temp) {
                    max=a[i]-temp;
                }
                if (temp>a[i]) {
                    temp=a[i];
                }

            }
            System.out.println(max);

        }
    }
}
