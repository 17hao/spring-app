package xyz.shiqihao.example_02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 记录一个一波三折写出来的AOP demo.
 *
 * 先记录一个坑, spring的xml文件中, 如果https开头的xsd链接可能会无法访问, 可以换成http.
 *
 * 理一下AOP(aspect oriented programming)相关的一些概念.
 * ① AOP中最核心的概念是aspect(切面), 切面(aspect)是对连接点(joinpoing)以及相应处理逻辑(advice)进行封装的实体.
 * ② Joinpoint是要进行增强操作的执行点.
 * ③ Pointcut是用特定规则筛选出来的一组指定的joinpoint. joinpoint就像菜单, pointcut是你从菜单上挑的菜.
 * ④ Advice是要织入到joinput的横切逻辑
 *
 * Spring中的AOP和AspectJ是一种互补关系.
 * Spring 2.0之后引入了对AspectJ的支持, 可以用AspectJ中的注解. 比之前要通过代码声明方便很多.
 * 先说说注解风格, @Aspect注解指明类成为Aspect, 要使这个注解生效还得做一些额外的工作, 第一种是在xml文件
 * 中加入<aop:aspectj-autoproxy/>, 另一种是加上注解@EnableAspectJAutoProxy. 总之目的是为了让spring
 * 自动生成代理类, 在spring 2.0之前的aop中, 要通过ProxyFactory手动生成代理类.
 * 在打上@Ascpect注解的POJO中用@Pointcut注解可以声明一组切入点. 形如void method(), method就是这个pointcut的名字
 * 用@Before/@After/@Around等注解可以声明advice, 关联上pointcut的名字.
 *
 * 可以看到@Aspect注解使POJO变成了aspect, POJO就是普通的java对象, 有一些属性和方法, 没有条条框框限制.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("example-02.xml");
        ITask task = (ITask) container.getBean("myTask");
        task.execute();
    }
}
