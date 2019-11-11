package study;

import java.util.Arrays;

public class 小顶堆堆排序 {
    public static void main(String[] args) {
        int a [] = {23,454,65,768,90,12,99};
        System.out.println(Arrays.toString(a));
        int n = a.length;
        sort(a,n);
        System.out.println(Arrays.toString(a));
    }
    public static void minhead(int []a,int n){

        for (int i = n/2-1; i > 0 ; i--) {
            minheadfixdown(a,i,n);
        }
    }
    public static void minheadfixdown(int []a,int i,int n){
        int left = 2*i+1;
        int right = 2*i+2;
        int min = left;
        int t = 0;
        if(left>=n){
            return;
        }
        if(right>=n){
            min = left;
        }else{
            if(a[right]<a[left]){
              min = right;
            }
        }
        if (a[min]>=a[i]){
            return;
        }
        else{
            t = a[i];
            a[i] = a[min];
            a[min] = t;
        }
        minheadfixdown(a,min,n);
    }
    public static void sort(int a[],int n){
        minhead(a,n);
        int t = 0;
        for (int i = n-1; i >= 0 ; i--) {
            t = a[0];
            a[0] = a[i];
            a[i] = t;
            minheadfixdown(a,0,i);
        }
    }
}
