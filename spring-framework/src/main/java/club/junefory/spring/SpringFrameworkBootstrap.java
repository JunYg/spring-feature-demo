package club.junefory.spring;

import club.junefory.spring.beans.ServiceBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 * @author user
 */
//@ComponentScan("club.junefory.spring")
public class SpringFrameworkBootstrap {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("club.junefory.spring");
        System.out.println(applicationContext.getBean(ServiceBean.class));
        System.out.println(applicationContext.getBean("helloWorld"));
        System.out.println(applicationContext.getBean("java"));
    }
}
