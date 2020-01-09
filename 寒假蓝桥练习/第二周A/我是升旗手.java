package 寒假蓝桥练习.第二周A;


import java.util.Scanner;

/**
 * @Author Robin wang long
 * @create 2020/1/7 9:59
 */
public class 我是升旗手 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
