package 蓝桥学苑;

/**
 * @Author Robin wang long
 * @create 2020/1/5 16:19
 */
public class RabinKarp {
    static long seed = 31;
    public static void main(String[] args) {
        String a = "ABABABA";
        String b = "ABA";
        match(a,b);
    }

    private static void match(String a, String b) {
        long hash = hash(b);
        int len = b.length();
        for (int i = 0; i+len <= a.length() ; i++) {
            long hash1 = hash(a.substring(i,i+len));
            if(hash==hash1){
                System.out.println(i);
            }
        }
    }


    public static long hash(String str){
        long hash = 0;
        for (int i = 0; i != str.length(); ++i) {
            hash = seed*hash+str.charAt(i);
        }
        return hash%Long.MAX_VALUE;
    }
}
