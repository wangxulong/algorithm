/**
 * Created by wxl on 2015/10/7.
 * 阶乘函数
 * 每个递归函数都必须有非递归定义的初始值，否则递归函数就无法计算。
 * 递归第二式是用较小自变量的函数来表达较大自变量的函数值的方式来定义n的阶乘。
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
