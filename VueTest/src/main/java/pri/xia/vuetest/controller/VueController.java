package pri.xia.vuetest.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pri.xia.vuetest.vo.Student;
import pri.xia.vuetest.vo.Students;

import java.util.ArrayList;

/**
 * @Description TODO
 * @Author XJY
 * @Date 2023/3/2 13:53
 **/
@RestController
@CrossOrigin
public class VueController {


    @GetMapping("/student")
    public Students getStudent() {
        ArrayList<Student> s = new ArrayList<>();
        Student s1 = Student.builder().id(1).name("xia").age("18").build();
        Student s2 = Student.builder().id(2).name("lili").age("11").build();
        Student s3 = Student.builder().id(3).name("lucy").age("16").build();
        Student s4 = Student.builder().id(4).name("kate").age("23").build();
        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);
        Students students = new Students();
        students.setStudents(s);
        return students;
    }
}
