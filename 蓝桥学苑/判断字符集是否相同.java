package 蓝桥学苑;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 判断字符集是否相同 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(ha(a,b));
    }

    private static boolean ha(String a, String b) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char w = a.charAt(i);
            if(map.get(w)==null){
                map.put(w,1);
            }

        }
        for (int i = 0; i < b.length(); i++) {
            char w = b.charAt(i);
            if(map.get(w)==null){
                return false;
            }
        }
        return true;
    }
}
