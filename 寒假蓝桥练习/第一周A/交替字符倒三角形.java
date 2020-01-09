package 寒假蓝桥练习.第一周A;


import java.util.Scanner;

public class 交替字符倒三角形 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int a = sc.nextInt();
            sanjiao(a);
        }
    }

    private static void sanjiao(int a) {
        int q=0;
        for (int i = a; i > 0 ; i--) {
            for (int k = 0; k < q; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++) {
                if(j%2==0){
                    System.out.print("S");
                }
                else if(j%2!=0){
                    System.out.print("T");
                }
            }
            q++;
            System.out.println();

        }
    }
}
