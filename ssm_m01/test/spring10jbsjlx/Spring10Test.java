package spring10jbsjlx;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
* 1.string，
* 2.int
* 3.集合  list,set,map,properties
*
* 注入方式1：
* xml  方式注入
*
* spring的el表达式${}
* */
public class Spring10Test {
    @Test
    public void test01(){
        String xml = "spring10jbsjlx/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        Teacher teacher = ac.getBean("teacher", Teacher.class);
        System.out.println("teacher = " + teacher);


    }
}
