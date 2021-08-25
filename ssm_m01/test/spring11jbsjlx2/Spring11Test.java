package spring11jbsjlx2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring11Test {
    @Test
    public void test01(){
        String xml = "spring11jbsjlx2/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        Teacher2 teacher2 = ac.getBean("teacher2", Teacher2.class);
        System.out.println("teacher2 = " + teacher2);
    }
}
