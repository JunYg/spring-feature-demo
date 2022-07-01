package club.junefory.spring.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author user
 */
@Configuration
public class ConfigurationBean2 {

    @Bean("java")
    public String java() {
        return "java language";
    }

}
