package 算法初学;

import java.util.Scanner;

public class 二分查找 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {1,234,434,567,678,898,990,1000};
        int n = sc.nextInt();
        System.out.println(rank(a,n));
    }

    private static int rank(int[] a, int n) {
        int l = 0;
        int r = a.length-1;
        int mid = a.length/2;
        int e = id(l,r,mid,n,a);
        return e;
    }

    private static int id(int l, int r, int mid, int n, int[] a) {
        if(l>=r){
            return 0;
        }
        else if(a[mid]>n){
            return id(l,mid,(l+mid)>>1,n,a);
        }
        else if(a[mid]<n){
            return id(mid,r,(mid+r+1)>>1,n,a);
        }
        else if(a[mid]==n){
            return a[mid];
        }
        return 0;
    }

}
