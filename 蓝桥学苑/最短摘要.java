package 蓝桥学苑;


import java.util.Arrays;

public class 最短摘要 {
    public static void main(String[] args) {

    }
    public static void slove(String[]w,String[]q){
        int begin = -1;
        int end = -1;
        int p2 = -1;
        int len = Integer.MAX_VALUE;
        int []keyword = new int[q.length];
        for (int i = 0; i < w.length; i++) {
            Arrays.fill(keyword,0);
            //如果i的位置是关键字，求以i开头的包含所有关键字的序列
            String word1 = w[i];
            int id = inOf(q,word1);
            if(id == -1){
                continue;
            }else{
                keyword[id] = 1;
            }
            int j;
            if(p2!=i){
                j = p2;
            }else{
                j = i+1;
            }
            for (; j < w.length; j++) {
                String word2 = w[j];
                int ie = inOf(q,word2);
                if(ie == -1||keyword[j]==1){
                    continue;
                }else{
                    keyword[ie] = 1;
                    if(sum(keyword)==keyword.length){
                        p2 = j;
                        if(j-i+1<len){
                            len = j-1+1;
                            begin = i;
                            end = j;
                        }
                        break;
                    }
                }
            }
        }
        print(w,begin,end);

    }

    private static void print(String[] w, int begin, int end) {
        System.out.println(w);
        System.out.println(begin);
        System.out.println(end);
    }

    private static int sum(int[] keyword) {
        int sum = 0;
        for(int e:keyword){
            sum+=e;
        }
        return sum;
    }

    public static int inOf(String[]a, String word){
        for (int i = 0; i < a.length; i++) {
            if(a.equals(word)){
                return i;
            }
        }
        return -1;
    }

}
