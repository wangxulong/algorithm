/**
 * Created by Administrator on 2015/10/16 0016.
 */
public class CommonDivisor {
    public static void main(String[] args) {
        System.out.println(divisor(10, 15));
    }
    public static int divisor(int one,int two){

        while (true){
            if((one = one%two)==0){
                return two;
            }
            if((two=two%one)==0) return one;
        }
    }
}
