package xyz.shiqihao.example_03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * JdbcTemplate的基本用法示例
 *
 * ①: 基于dao的开发方式屏蔽了底层使用不同持久化工具的差异, 但是也带来了对于异常处理的麻烦.
 * 以最常见的jdbc来说, SQLException是个设计欠佳的异常类. 首先它是受检查异常, 这意味着使用jdbc连接
 * 的代码或者是调用它的客户端代码必须处理这个异常, 如果是在使用连接处处理, 那么如果出错了客户端如何知道发什么了
 * 什么? 如果由客户端处理, 大多数情况下这个异常由系统异常引发, 客户端也无能为力. 更麻烦的是, 各个数据库厂商
 * 对于SQLException中定义错误的格式还不同, 这就让异常处理变得异常困难.
 * 所以我们需要的是一套基于不受检查异常的统一异常处理, 这就是spring提供统一数据访问的核心点.
 * ②: jdbc对于统一java平台对关系型数据库的访问是成功的, 但是它的使用让人头疼.
 * 获取连接, 创建Statement或PreparedStatement对象, 执行sql获取结果进行处理.
 * 如果用jdbc项目中会充斥着大量模板代码. 所以spring基于模板模式提供了JdbcTemplate类.
 * 这是spring提供的jdbc最佳实践.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("jdbc-template.xml");
        JdbcTemplate template = (JdbcTemplate) container.getBean("jdbcTemplate");
        template.query("SELECT name FROM public.user WHERE id = 1;", rs -> {
            System.out.println("id: 1, name: " + rs.getString(1));
        });
    }
}
