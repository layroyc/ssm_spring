package spring09autowire;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//自动装配，省去很多代码
public class Spring09AutowireTest {
    @Test
    public void test01(){
        String xml = "spring09autowire/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        Student student = ac.getBean("student", Student.class);
        student.play();
        System.out.println("student = " + student);

    }
}
