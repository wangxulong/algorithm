/**
 * Created by wxl on 2015/10/7.
 * �׳˺���
 * ÿ���ݹ麯���������зǵݹ鶨��ĳ�ʼֵ������ݹ麯�����޷����㡣
 * �ݹ�ڶ�ʽ���ý�С�Ա����ĺ��������ϴ��Ա����ĺ���ֵ�ķ�ʽ������n�Ľ׳ˡ�
 */
public class Factorial {
    public static  int factorial(int n){
        if(n==0) return 1;
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));

    }
}
