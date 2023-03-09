package Date类;

import java.io.PipedReader;
import java.time.LocalDate;
import java.util.Date;

/**
 * @Description  清晰的知道时间类和日历类的区别
 *               Date 1970-01-01 00：00：00 开始的秒数 时间类
 *               LocalDate  日历类表示的时间
 * @Author XJY
 * @Date 2023/2/20 11:57
 **/
public class DateTest {
    public void showDate(){
        //
        System.out.println(new Date());
        //System.out.println(new java.sql.Date());
    }
    public void showLocalDate(){
        //静态工厂方法
        System.out.println(LocalDate.now());
    }
}
