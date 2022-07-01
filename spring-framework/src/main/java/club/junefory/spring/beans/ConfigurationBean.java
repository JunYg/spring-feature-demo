package club.junefory.spring.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author user
 */
@Configuration
@Import(ConfigurationBean2.class)
public class ConfigurationBean {

    @Bean("helloWorld")
    public String helloWorld() {
        return "hello world";
    }

}
