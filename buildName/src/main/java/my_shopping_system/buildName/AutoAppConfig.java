package my_shopping_system.buildName;

import my_shopping_system.buildName.member.MemberRepository;
import my_shopping_system.buildName.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "my_shopping_system.buildName", // 컴포넌트 탐색 시작 위치
        basePackageClasses = AutoAppConfig.class, // 컴포넌트 탐색 시작 위치 = 상단 package와 같음
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
) // AppConfig나 TestConfig 등 @Configuration이 붙은 설정 정보는 제외
public class AutoAppConfig {

    /*@Bean(name= "memoryMemberRepository")
    MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
    */
}
