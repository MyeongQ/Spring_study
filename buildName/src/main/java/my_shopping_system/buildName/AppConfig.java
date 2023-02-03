package my_shopping_system.buildName;

import my_shopping_system.buildName.discount.DiscountPolicy;
import my_shopping_system.buildName.discount.FixDiscountPolicy;
import my_shopping_system.buildName.discount.RateDIscountPolicy;
import my_shopping_system.buildName.member.MemberRepository;
import my_shopping_system.buildName.member.MemberService;
import my_shopping_system.buildName.member.MemberServiceImp;
import my_shopping_system.buildName.member.MemoryMemberRepository;
import my_shopping_system.buildName.order.OrderService;
import my_shopping_system.buildName.order.OrderServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 어플리케이션 동작에 필요한 구현 객체를 생성 -> 주입
@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {return new MemberServiceImp(memberRepository());
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImp(
                memberRepository(),
                discountPolicy());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        //return new FixDiscountPolicy();
        return new RateDIscountPolicy();
    }
}
