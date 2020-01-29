package xyz.shiqihao.example_01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * BeanFactory作为IoC容器.
 * <p>
 * BeanFactory是最基础的IoC容器, 它本身只提供了获取容器中bean信息的方法.
 * bean的定义在BeanDefinition中, bean的名称和bean的定义构成的映射关系存储在BeanDefinitionRegistry.
 * 在这个例子中我们使用了DefaultListableBeanFactory, 它实现了BeanFactory和BeanDefinitionRegistry这2个
 * 接口, 所以bindObjects()方法return语句可以强转类型.
 * 工作流程:
 * 在main()中创建了DefaultListableBeanFactory实例, 它既有注册表的能力, 也有bean工厂的能力.
 * 在bindObjects()方法中进行具体的对象注册和依赖管理.
 *   创建BeanDefinition, 本例中用RootBeanDefinition做为实现类.
 *   将BeanDefinition注册到BeanDefinitionRegistry
 *   使用构造方法注入的方式进行依赖管理, 将FXNewsProvider类所需的依赖注入
 *
 * 依赖注入是一种技术, IoC容器是一种可选的框架, 它降低了使用依赖注入的成本.
 * 如果不使用IoC容器, 一般会在程序入口进行对象的组装, 如果对象数目较大, 成本会很高.
 * 只要将事先定义好的类和描述它们之间依赖关系的元数据(相当于图纸)告诉IoC容器, 它就能完成类的实例化.
 * 这样做的好处: 每个对象无需关心自己依赖的对象的构造方式. 大大降低了组件之间的耦合度.
 */
public class Main_1 {
    public static void main(String[] args) {
        DefaultListableBeanFactory beanRegistry = new DefaultListableBeanFactory();
        BeanFactory container = bindObjects(beanRegistry);
        FXNewsProvider provider = (FXNewsProvider) container.getBean("provider");
        provider.getAndPersistNews();
    }

    private static BeanFactory bindObjects(BeanDefinitionRegistry registry) {
        AbstractBeanDefinition newProvider = new RootBeanDefinition(FXNewsProvider.class);
        AbstractBeanDefinition newListener = new RootBeanDefinition(DowJonesNewsListener.class);
        AbstractBeanDefinition newPersistener = new RootBeanDefinition(DowJonesNewsPersistener.class);
        registry.registerBeanDefinition("provider", newProvider);
        registry.registerBeanDefinition("listener", newListener);
        registry.registerBeanDefinition("persistener", newPersistener);
        // 通过构造方法注入, 也可以用setter方法注入
        ConstructorArgumentValues argValues = new ConstructorArgumentValues();
        argValues.addIndexedArgumentValue(0, newListener);
        argValues.addIndexedArgumentValue(1, newPersistener);
        newProvider.setConstructorArgumentValues(argValues);
        return (BeanFactory) registry;
    }
}
