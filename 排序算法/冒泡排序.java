package 排序算法;



import java.util.Arrays;

public class 冒泡排序 {
    public static void main(String[] args) {
        int a[] = {23,3435,635,213,76,18,98};
        int b []= sortlow(a);
        System.out.println(Arrays.toString(b));
        int c[] = sorthigj(a);
        System.out.println(Arrays.toString(c));
    }

    private static int[] sorthigj(int[] a) {
        int e;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if(a[i]>a[j]){
                    e = a[i];
                    a[i] = a[j];
                    a[j] = e;
                }
            }
        }
        return a;
    }

    private static int[] sortlow(int[] a) {
        int e;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if(a[i]<a[j]){
                    e = a[i];
                    a[i] = a[j];
                    a[j] = e;
                }
            }
        }
        return a;
    }
}
