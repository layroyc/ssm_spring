package spring06di;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring06DI {
    //刚刚是以set的方法注入的  这叫做 set注入
    @Test
    public void test01(){
        String xml = "spring06DI/applicationContext.xml";
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        //拿主体
        Person person = ac.getBean("person", Person.class);
        person.play();


        //思考题：现在  2个类之间的关系
        //人......手机，电脑，PSP

        //思考题：如何提高  依赖效率？
        //使用接口  同时 也 解耦了代码，让依赖关系 有实体类依赖  变成 抽象类的依赖
        //同理：也解释java 3层架构中，为什么要用到 接口....
    }
    //作业1：spring思维导图
    //作业2：新建一个 主题人类，在建立一个 接口 叫做吃的，实现类有3个 方便面，火腿肠，螺蛳粉
    //测试他们之间的依赖
}
