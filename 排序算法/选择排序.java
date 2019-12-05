package 排序算法;

import java.util.Arrays;

public class 选择排序 {
    public static void main(String[] args) {
        int a[] = {23,3435,635,213,76,18,98};
        int d []= sortlow(a);
        System.out.println(Arrays.toString(d));
        int c[] = sorthigh(a);
        System.out.println(Arrays.toString(c));
    }

    private static int[] sortlow(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int in = i;
            for (int j = i+1; j < a.length; j++) {
                if(a[j]>a[in]){
                    in = j;
                }

            }
            if(in==i){
                continue;
            }
            int t;
            t = a[in];
            a[in] = a[i];
            a[i] = t;
        }
        return a;
    }

    private static int[] sorthigh(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int in = i;
            for (int j = i+1; j < a.length; j++) {
                if(a[j]<a[in]){
                    in = j;
                }

            }
            if(in==i){
                continue;
            }
            int t;
            t = a[in];
            a[in] = a[i];
            a[i] = t;
        }
        return a;
    }
}
