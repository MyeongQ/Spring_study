package my_shopping_system.buildName.scan;

import my_shopping_system.buildName.AutoAppConfig;
import my_shopping_system.buildName.member.MemberRepository;
import my_shopping_system.buildName.member.MemberService;
import my_shopping_system.buildName.order.OrderServiceImp;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.*;

public class AutoAppConfigTest {

    @Test
    void basicScan() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);

        MemberService memberService = ac.getBean(MemberService.class);
        assertThat(memberService).isInstanceOf(MemberService.class);

        OrderServiceImp bean = ac.getBean(OrderServiceImp.class);
        MemberRepository memberRepository = bean.getMemberRepository();
        System.out.println("memberRepository = " + memberRepository);

    }
}
