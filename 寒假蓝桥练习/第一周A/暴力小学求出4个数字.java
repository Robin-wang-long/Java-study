package 寒假蓝桥练习.第一周A;

import java.util.Scanner;

public class 暴力小学求出4个数字 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,a,b,c,d,k=0,j,m,t;
        int i[] = new int[100];
        n = sc.nextInt();
        for(a=0;a<10;a++)
            for(b=0;b<10;b++)
                for(c=0;c<10;c++)
                    for(d=0;d<10;d++)
                        if((4*a+3*10*b+2*100*c+1000*d==n)&&a!=b&&a!=c&&a!=d&&b!=c&&b!=d&&c!=d)
                            i[k++]=1000*d+100*c+10*b+a;
        for(j=0;j<k-1;j++){
            for(m=j;m<k;m++)
                if(i[j]>i[m]){
                    t=i[j];
                    i[j]=i[m];
                    i[m]=t;
                }
        }
        System.out.println(k);
        for(m=0;m<k;m++){
            System.out.print(i[m]/1000);
            System.out.print((i[m]%1000)/100);
            System.out.print((i[m]%100)/10);
            System.out.println(i[m]%10);
        }
    }

}