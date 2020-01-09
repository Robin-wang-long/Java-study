package 寒假蓝桥练习.第二周A;

import java.util.Scanner;

/**
 * @Author Robin wang long
 * @create 2020/1/7 10:07
 */
public class 兔子繁殖问题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int before1 = 1;
        int before2 = 0;
        int after = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if(index == 0){
                index++;
                before1+=before2;
                before2 = 0;
                before2+=after;

            }
            if(index == 1){
                index = 0;
                after+=before1;
                before1 = 0;
            }
        }
        System.out.println(before1+before2+after);
    }
}
