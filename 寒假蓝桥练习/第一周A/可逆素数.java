package 寒假蓝桥练习.第一周A;

public class 可逆素数 {
    public static void main(String[] args) {
        for (int i = 1001; i < 9967; i+=2) {
            if(sushu(i)){
                int a = diandao(i);
                if(sushu(a)){
                    System.out.print(i+" ");
                }
        }
        }
        int a = 9967;
        System.out.print(a);
    }

    private static int diandao(int i) {
        int n;
        int s = 0;
        int w = 1000;
        while (i != 0) {
            n = i % 10;
            s+=n*w;
            i /= 10;
            w/=10;
        }

        return s;
    }

    private static boolean sushu(int i) {
        for (int j = 2; j <=Math.sqrt(i); j++) {
            if(i%j==0) {
                return false;
            }
        }
        return true;
    }
}
