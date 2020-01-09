package 蓝桥学苑;



public class 子数组最大和 {
    public static void main(String[] args) {
        int a []  ={1,-2434,2,34234,-50,454,6456,-67,5};
        System.out.println(we(a));
    }
    public static int we(int a[]){
        int num = a[0];
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if(num>=0){
                num+=a[i];
            }else{
                num = a[i];
            }
            max = Math.max(max,num);
        }
        return max;
    }
}
