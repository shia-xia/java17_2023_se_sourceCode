package pri.xia.vuetest.vo;

import lombok.Builder;
import lombok.Data;

/**
 * @Description TODO
 * @Author XJY
 * @Date 2023/3/2 13:55
 **/
@Data
@Builder
public class Student {
    private String name;
    private String age;
    private Integer id;
}
