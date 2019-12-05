package 排序算法;

import java.util.Arrays;

public class 大顶堆堆排序 {
    public static void main(String[] args) {
        int a [] = {23,454,65,768,90,12,99};
        System.out.println(Arrays.toString(a));
        int n = a.length;
        sor(a,n);
        System.out.println(Arrays.toString(a));
    }
    public static void maxhead(int []a,int n){
        for (int i = n/2-1; i >= 0 ; i--) {
            maxheadfixdown(a,i,n);
        }
    }
    public static void maxheadfixdown(int []a,int i,int n){
        int left = 2*i+1;
        int right = 2*i+2;
        int max = left;
        int t ;
        if(left>=n){
            return;
        }
        if(right>=n){
            max = left;
        }else{
            if(a[left]<a[right]){
                max = right;
            }
        }
        if(a[max]<=a[i]){
            return;
        }
        t = a[i];
        a[i] = a[max];
        a[max] = t;
        maxheadfixdown(a,max,n);
    }
    public static void sor(int []a,int n){
        maxhead(a,n);
        int t;
        for (int i = n-1; i >= 0 ; i--) {
            t = a[i];
            a[i] = a[0];
            a[0] = t;
            maxheadfixdown(a,0,i);
        }
    }
}
