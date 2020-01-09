package 寒假蓝桥练习.第一周A;

import java.util.Scanner;

public class 逆序输出各位数字 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = "";
        while(a!=0){
            s+=a%10;
            a/=10;
        }
        a = Integer.parseInt(s);
        System.out.println(a);
    }
}
