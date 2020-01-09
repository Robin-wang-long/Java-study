package 蓝桥学苑;

public class 回文串 {
    //输出四位十进制的回文串
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i*1000+j*100+j*10+i);
            }
        }

    }
}
