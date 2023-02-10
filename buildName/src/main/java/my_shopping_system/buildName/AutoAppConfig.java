package my_shopping_system.buildName;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
) // AppConfig나 TestConfig 등 @Configuration이 붙은 설정 정보는 제외
public class AutoAppConfig {


}
