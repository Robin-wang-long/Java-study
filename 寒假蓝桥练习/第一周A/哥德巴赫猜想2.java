package 寒假蓝桥练习.第一周A;

import java.util.Scanner;

public class 哥德巴赫猜想2 {
    static int maxn = 40000;
    static boolean is_prime[] = new boolean[maxn];

    public static void main(String[] args) {
        Init();
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10000];
        int i=0;
        int b=1;
        while(b!=0){
            b = sc.nextInt();
            if(b!=0){
                a[i]=b;
                i++;
            }
        }
        for (int j = 0; j < i; j++) {
            int s = nb(a[j]);
            System.out.println(s);
        }
    }

    private static int nb(int n) {
        int s = 0;
        for(int i=2;i<=n/2;i++)
        {
            if(is_prime[i]&&is_prime[n-i])
            {
                s++;
            }
        }
        return s;
    }

    public static void Init()
    {
        int i,j;
        for(i=0;i<maxn;i++)
        {
            is_prime[i]=true;
        }
        is_prime[0]=is_prime[1]=false;
        for(i=0;i<maxn;i++)
        {
            if(is_prime[i])
            {
                for(j=2*i;j<maxn;j+=i)
                {
                    is_prime[j]=false;
                }
            }
        }
    }

}
