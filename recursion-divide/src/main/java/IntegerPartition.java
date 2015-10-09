/**
 * Created by wxl on 2015/10/7.
 */
public class IntegerPartition {
    /**
     * ��ν�������֣���ָ��һ��������nд��������ʽ��
     *  n=m1+m2+...+mi; ������miΪ������������1 <= mi <= n������{m1,m2,...,mi}Ϊn��һ�����֡�
     * ���{m1,m2,...,mi}�е����ֵ������m����max(m1,m2,...,mi)<=m�����������n��һ��m���֡�
     * �������Ǽ�n��m���ֵĸ���Ϊf(n,m);
     *  ����:��n=4ʱ������5�����֣�{4},{3,1},{2,2},{2,1,1},{1,1,1,1};
     *   ע��4=1+3 �� 4=3+1����Ϊ��ͬһ�����֡�
     * ����n��m�Ĺ�ϵ���������¼��������
     * 1.��n=1ʱ������mΪ���٣�ֻ��һ������
     * 2.��m=1ʱ������nΪ���٣�ֻ��һ������
     * 3.��n=mʱ�����ݻ������Ƿ����n��Ϊ���������
     *      a.�����а���n��ֻ��һ��
     *      b.�����в�����n,��ʱ�����е��������һ����nС����n�����У�n-1�����֡���ˣ�f(n,n)=1+f(n,n-1)
     * 4.��n<mʱ��û��
     * 5.��n>m�����ݻ������ǰ������ֵm,��Ϊ���������
     *      a.�����а���m���������{m,{x1,x2,...}}������{x1,x2,...}�ĺ�Ϊn-m,�����ٴγ���m�������
     *          (n-m)��m���֣�Ϊ��f(n-m,m)
     *      b.�����в�����m��������򻮷�������ֵ���� m С���� n �� ( m - 1 ) ���֣�����Ϊ f(n, m - 1);
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
