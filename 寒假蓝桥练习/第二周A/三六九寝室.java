package 寒假蓝桥练习.第二周A;

import java.util.Scanner;

/**
 * @Author Robin wang long
 * @create 2020/1/7 11:17
 */
public class 三六九寝室 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        boolean sad = false;
        for(int i = 1; i <= 100; i++) {
            boolean situation1 = false;
            boolean situation2 = false;
            boolean situation3 = false;
            if (i == 100) {
                sad = true;
            }
            if ((x + i) % 10  == 3 || (y + i) % 10  == 3 || (z + i) % 10  == 3) {
                situation1 = true;
            }
            if ((x + i) % 10  == 6 || (y + i) % 10  == 6 || (z + i) % 10  == 6) {
                situation2 = true;
            }
            if ((x + i) % 10  == 9 || (y + i) % 10  == 9 || (z + i) % 10  == 9) {
                situation3 = true;
            }
            if (situation1&&situation2&&situation3) {
                System.out.println(i);
                break;
            }
        }
        if(sad) {
            System.out.println("so sad!");
        }

    }
}
