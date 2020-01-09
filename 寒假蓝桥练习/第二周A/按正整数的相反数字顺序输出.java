package 寒假蓝桥练习.第二周A;

import java.util.Scanner;

/**
 * @Author Robin wang long
 * @create 2020/1/8 12:09
 */
public class 按正整数的相反数字顺序输出 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        while (n!=0){
            int q = n%10;
            s+=q;
            n = n/10;
        }
        System.out.println(Integer.parseInt(s));
    }
}
