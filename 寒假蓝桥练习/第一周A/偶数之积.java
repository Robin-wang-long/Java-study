package 寒假蓝桥练习.第一周A;

public class 偶数之积 {
    public static void main(String[] args) {
        double sum = 1;
        for (int i = 1; i <=10 ; i++) {
            if(i%2==0){
                sum*=i;
            }
        }
        System.out.printf("t=%.6f",sum);
    }
}
