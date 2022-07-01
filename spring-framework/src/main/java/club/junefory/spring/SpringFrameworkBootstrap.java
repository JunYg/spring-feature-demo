package club.junefory.spring;

import club.junefory.spring.beans.ServiceBean;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.MergedAnnotations;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Hello world!
 * @author user
 */
//@ComponentScan("club.junefory.spring")
public class SpringFrameworkBootstrap {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("club.junefory.spring");

        BeanDefinition serviceBean = applicationContext.getBeanDefinition("serviceBean");
        System.out.println("-------------");
        System.out.println(serviceBean);
        System.out.println("*************");
        serviceBean.setParentName("helloWorld");
        System.out.println(serviceBean.getParentName());
        System.out.println("*************");
        System.out.println(serviceBean.getSource());
        AnnotatedBeanDefinition annotatedBeanDefinition = (AnnotatedBeanDefinition) serviceBean;
        System.out.println("*************");
        AnnotationMetadata metadata = annotatedBeanDefinition.getMetadata();
        System.out.println(metadata);
        MergedAnnotations annotations = metadata.getAnnotations();
        System.out.println(annotations);
        System.out.println("*************");
        System.out.println(annotatedBeanDefinition.getFactoryMethodMetadata());
        System.out.println("-------------");
        System.out.println(applicationContext.getBean(ServiceBean.class));
        System.out.println("-------------");
        System.out.println(applicationContext.getBean("helloWorld"));
        System.out.println("-------------");
        System.out.println(applicationContext.getBean("java"));
    }
}
