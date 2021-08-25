package spring07;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring07Test {
    @Test
    public void test01() {
        String xml = "spring07/applicationContext.xml";
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        //拿主体
        Person person = ac.getBean("person", Person.class);
        person.task();
    }
}
