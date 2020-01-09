package 寒假蓝桥练习.第二周A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @Author Robin wang long
 * @create 2020/1/7 10:29
 */
public class 作品评分 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str[] = sc.nextLine().split(" ");
        float sum = (float) 0.0;
        List<Float> nums = new ArrayList<>();
        for(String l:str){
            nums.add(Float.valueOf(l));
        }
        Collections.sort(nums);
        nums.remove(0);
        nums.remove(nums.size()-1);
        for (float a:nums){
            sum+=a;
        }
        System.out.printf("%.2f",sum/(n-2)*1.0);
    }
}
