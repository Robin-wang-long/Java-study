package 寒假蓝桥练习.第一周A;

import java.util.Scanner;

public class 谁做了好事 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = 1;
        char a[] = {'A','B','C','D','E','F'};
        for (int i = 0; i < a.length; i++) {
            if(zhenjia(a[i]!='A')+zhenjia(a[i]=='C')+zhenjia(a[i]=='D')+zhenjia(a[i]!='D')+zhenjia(a[i]=='C'||a[i]=='E')+zhenjia(a[i]!='D'&&a[i]!='E')==n){
                if(w==1){
                    System.out.print(a[i]);
                    w=0;
                } else if(w==0){
                    System.out.print(" or "+a[i]);
                }

            }
        }
        if(w==1){
            System.out.print("Error");
        }
    }
    public static int zhenjia(boolean a){
        if(a){
            return 1;
        }else{
            return 0;
        }
    }
}