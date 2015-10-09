/**
 * Created by wxl on 2015/10/7.
 */
public class IntegerPartition {
    /**
     * 所谓整数划分，是指把一个正整数n写成如下形式：
     *  n=m1+m2+...+mi; （其中mi为正整数，并且1 <= mi <= n），则{m1,m2,...,mi}为n的一个划分。
     * 如果{m1,m2,...,mi}中的最大值不超过m，即max(m1,m2,...,mi)<=m，则称它属于n的一个m划分。
     * 这里我们记n的m划分的个数为f(n,m);
     *  例如:当n=4时，他有5个划分，{4},{3,1},{2,2},{2,1,1},{1,1,1,1};
     *   注意4=1+3 和 4=3+1被认为是同一个划分。
     * 根据n和m的关系，考虑以下几种情况：
     * 1.当n=1时，不论m为多少，只有一个划分
     * 2.当m=1时，不论n为多少，只有一个划分
     * 3.当n=m时，根据划分中是否包含n分为两种情况：
     *      a.划分中包含n，只有一个
     *      b.划分中不包含n,这时划分中的最大数字一定比n小，即n的所有（n-1）划分。因此：f(n,n)=1+f(n,n-1)
     * 4.当n<m时，没有
     * 5.当n>m，根据划分中是包含最大值m,分为两种情况：
     *      a.划分中包含m的情况，即{m,{x1,x2,...}}，其中{x1,x2,...}的和为n-m,可能再次出现m，因此是
     *          (n-m)的m划分，为：f(n-m,m)
     *      b.划分中不包含m的情况，则划分中所有值都比 m 小，即 n 的 ( m - 1 ) 划分，个数为 f(n, m - 1);
     *
     *
     *  f(n,m)=1; n=1 or m=1
     *  f(n,m)=f(n,n); n<m
     * f(n,m)=1+ f(n, m - 1);n=m
     *f(n,m)= f(n - m, m) + f(n, m - 1);n>m
     *
     */

    public static long  GetPartitionCount(int n, int max)
    {
        if (n == 1 || max == 1)
            return 1;
        else if (n < max)
            return GetPartitionCount(n, n);
        else if (n == max)
            return 1 + GetPartitionCount(n, max-1);
        else
            return GetPartitionCount(n,max-1) + GetPartitionCount(n-max, max);
    }


    public static void main(String[] args) {
        System.out.println(GetPartitionCount(6,5));
    }
}
