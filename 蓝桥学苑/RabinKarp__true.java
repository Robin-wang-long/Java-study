package 蓝桥学苑;

/**
 * @Author Robin wang long
 * @create 2020/1/5 20:24
 */
public class RabinKarp__true {
    static long seed = 31;
    public static void main(String[] args) {
        String a = "ABABABA";
        String b = "ABA";
        match(a,b);
    }
    private static void match(String a, String b) {
        long hash = hash(b);
//        int len = b.length();
//        for (int i = 0; i+len <= a.length() ; i++) {
//            long hash1 = hash(a.substring(i,i+len));
//            if(hash==hash1){
//                System.out.println(i);
//            }
//        }
        long []hash_Pa = hash(a,b.length());
        match(hash_Pa,hash);
    }

    private static void match(long[] hash_pa, long hash) {
        for (int i = 0; i < hash_pa.length; i++) {
            if(hash_pa[i]==hash){
                System.out.println(i);
            }
        }
    }

    public static long[] hash(String a,int n){
        long[] res = new long[a.length()-n+1];
        res[0] = hash(a.substring(0,n));
        for (int i = n; i < a.length(); i++) {
            char e = a.charAt(i);
            char w = a.charAt(i-n);
            long v = (long) (((res[i-n])*seed+e-Math.pow(seed,n)*w)%Long.MAX_VALUE);
            res[i-n+1] = v;
        }
        return res;
    }
    public static long hash(String str){
        long hash = 0;
        for (int i = 0; i != str.length(); ++i) {
            hash = seed*hash+str.charAt(i);
        }
        return hash%Long.MAX_VALUE;
    }
}
