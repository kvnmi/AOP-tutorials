package Demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "Demo")
@EnableAspectJAutoProxy // Enables aspect oriented programming
public class BeanConfig {
}
