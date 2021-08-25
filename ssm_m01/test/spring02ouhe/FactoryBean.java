package spring02ouhe;
//工厂类  工厂模式, spring 创建bean的底层
// 使用工厂模式    代码更灵活
//  单例模式 已经讲过 6种  常用2种
//hr问： spring 框架中，使用到了哪些设计模式

public class FactoryBean {
    public static Usb getInstance(String beanName) throws Exception {
        Usb usb =null;
        /*if(beanName.equals("MyTv")){
            usb = new MyTv();
        }else if(beanName.equals("Computer")){
            usb = new Computer();
        }else if (beanName.equals("Mp4")){
            usb = new Mp4();
        }else if (beanName.equals("Mp3")){
            usb = new Mp4();
        }
        return usb;*/

        //结论  大量new 对象是造成 耦合的关键，那么 就需要一个框架 来解决 new对象的耦合
        //什么框架可以解决 这个呢？ spring 为什么是spring 可以解决 new 对象的耦合呢？----->底层的反射！！！！！

        Class<?> aClass = Class.forName(beanName);//反射的优势  1行代码解决所有
        usb = (Usb) aClass.newInstance();
        return usb;

    }
}
