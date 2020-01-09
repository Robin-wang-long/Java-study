package 寒假蓝桥练习.第一周B;

import java.util.Scanner;

public class 子集和的问题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean q = false;
        int a[] = new int[n];
        int s = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(a[i]==s){
                System.out.println(a[i]+" ");
                q = true;
                break;
            }else if(a[i]>s){
                continue;
            }else {
                for (int j = i+1; j < n; j++) {
                    if (a[i] + a[j] == s) {
                        System.out.println(a[i] + " " + a[j]+" ");
                        q = true;
                        break;
                    } else if (a[i] + a[j] > s) {
                        continue;
                    } else {
                        for (int k = j+1; k < n; k++) {
                            if (a[i] + a[j] + a[k] == s) {
                                System.out.println(a[i] + " " + a[j] + " " + a[k]+" ");
                                q = true;
                                break;
                            }
                        }
                        if (q == true) {
                            break;
                        }
                    }
                }
            }
            if(q==true){
                break;
            }
        }
        if(q==false){
            System.out.println("No Solution!");
        }
    }
}
