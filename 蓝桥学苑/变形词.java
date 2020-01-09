package 蓝桥学苑;

import java.util.Arrays;
import java.util.Scanner;

public class 变形词 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(fa(a,b));
        System.out.println(fa1(a,b));
    }

    private static boolean fa1(String a, String b) {
        char []q = a.toCharArray();
        char []w = b.toCharArray();
        if(q.length!=w.length){
            return false;
        }
        int e[] = new int[1000];
        for (int i = 0; i < q.length; i++) {
            e[q[i]]+=1;
        }
        for (int i = 0; i < w.length; i++) {
            e[w[i]]-=1;
            if(e[w[i]]<0){
                return false;
            }
        }
        return true;
    }

    private static boolean fa(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        if(len1!=len2){
            return  false;
        }
        char arr1[] = a.toCharArray();
        char arr2[] = b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
}
