package spring04iocrongqi;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;
import java.util.Date;

/**
 * 容器的由来：根据刚刚的 工厂模式 得出，一个项目中又打脸的对象
 * 那么 大量的对象需要管理，如果管理更方便  使用容器，把对象  统一处理
 *
 * Spring中的容器  IOC
 * IOC 有个思想：    控制反转  什么叫控制，给对象属性赋值的权利
 * 什么叫反转：   事情本来 由A控制，现在变为B控制
 *
 * 容器是负责控制反转的
* */
public class Spring04Test {
    /**
     * 传统的对象 创建三种方式
     * 传统的对象  没有 容器的统一管理
     */

    @Test
    public void test01(){
        //spring 容器 是管理对象
        //对象的创建  有几种方式呢？
        //传统的创建对象  有3种方式
        //第一种： new 关键字
        Date date = new Date();//1.创建对象方法
        System.out.println("date = " + date);
        System.out.println("======================");
        //第二种：static 静态方法创建  静态工厂创建
        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar = " + calendar);
        System.out.println("===============================");
        //第三种：实例工厂模式
        Date time = calendar.getTime();
        System.out.println("time = " + time);
        System.out.println("以上是传统创建对象的3中方式");


        //传统的创建对象的缺点：
        //1.控制权在哪里？     现在在test01 的方法中
        //2.对象创建的 执行顺序  由谁控制？   test01 的方法中

        //下面 使用 spring 如何 管理对象(创建，销毁，使用)


    }
    /*
    * spring 容器管理对象，看spring如何创建对象
    *
    * */
    //容器  作用域
    @Test
    public void test02(){
        //1.加载 容器的xml
        String xml = "spring04iocrongqi/applicationContext.xml";
        //2.xml 文件一经加载，所有的对象都已经诞生了，这就和传统的test01 创建对象不一样了
        //达到了 对象的 统一管理 也就是对象的创建的控制权 被 spring拿走了
        //以前是 new 出来的，现在是反射  拿到对象 ，这就是控制权的改变，  这就是 控制反转
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        System.out.println("ac = " + ac);
        //如何取得对象
        Date date = ac.getBean("date", Date.class);
        System.out.println("date = " + date);

        //作用域：测试spring 默认创建对象是否是单例模式
        Pc pc1 = ac.getBean("pc", Pc.class);
        Pc pc2 = ac.getBean("pc", Pc.class);
        System.out.println("pc1 = " + pc1);
        System.out.println("pc2 = " + pc2);
        System.out.println(pc1 == pc2);//默认是单例模式， ==为true 即：内存地址一样
        //scope="prototype"     加上 ==为false

        ac.close();//关闭容器
        //如果 生命周期中使用 原型模式看，那么无法调用对象的摧毁方法，所以少用原型模式
    }
}
