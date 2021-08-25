package Spring08digzq;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring08DiTest {
    //06是set注入   现在讲的是构造器注入
    @Test
    public void test01(){
        String xml = "spring08digzq/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        People people = ac.getBean("people", People.class);
        people.play();

    }
}
