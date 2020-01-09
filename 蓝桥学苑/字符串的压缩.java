package 蓝桥学苑;

import java.util.Scanner;

public class 字符串的压缩 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(zipstring(a));
    }

    private static String zipstring(String a) {
        char last = 0;
        int count = 0;
        StringBuilder sb  = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            char asd = a.charAt(i);
            if(sb.length()==0){
                sb.append(asd);
                count++;
            }else{
                if(asd==last){
                    count++;
                }else{
                    sb.append(count).append(asd);
                    count = 1;
                }
            }
            last = asd;
        }
        if(count>=1){
            sb.append(count);
        }
        if(sb.length()>=a.length()){
            return a;
        }
        return new String(sb);
    }
}
