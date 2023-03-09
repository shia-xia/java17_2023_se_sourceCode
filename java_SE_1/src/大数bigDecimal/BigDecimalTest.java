package 大数bigDecimal;
import java.math.BigDecimal;
/**
 * @Description TODO
 * @Author XJY
 * @Date 2023/2/18 15:47
 **/
public class BigDecimalTest {

    public static void main(String[] args){
        //main方法中调用同类中的方法，需要先实例化对象
        BigDecimalTest scanTest = new BigDecimalTest();
        scanTest.getIntNumber(100);
    }

    public void getIntNumber(Integer i){
        BigDecimal a = new BigDecimal("123123123");
        BigDecimal bigDecimal = new BigDecimal(i);
        BigDecimal b = bigDecimal.add(a);
        System.out.println(b);
    }

    public void test1(){
        //同类中非main方法中调用同类中的方法，不需要实例化对象
        getIntNumber(100);
    }
}
