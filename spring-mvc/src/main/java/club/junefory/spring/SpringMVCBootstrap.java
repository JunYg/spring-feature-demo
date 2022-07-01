package club.junefory.spring;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

/**
 * Hello world!
 * @author user
 */
public class SpringMVCBootstrap {
    public static void main(String[] args) {
        AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
        webApplicationContext.refresh();
    }
}
