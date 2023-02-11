package my_shopping_system.buildName.order;

import my_shopping_system.buildName.AppConfig;
import my_shopping_system.buildName.discount.FixDiscountPolicy;
import my_shopping_system.buildName.member.Grade;
import my_shopping_system.buildName.member.Member;
import my_shopping_system.buildName.member.MemberService;
import my_shopping_system.buildName.member.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class OrderServiceImpTest {

    @Test
    void createOrder() {
        MemoryMemberRepository memberRepository = new MemoryMemberRepository();
        memberRepository.save(new Member(1L,"name",  Grade.VIP));

        OrderServiceImp orderService = new OrderServiceImp(memberRepository, new FixDiscountPolicy());
        Order order = orderService.createOrder(1L, "itemA", 10000);
        assertThat(order.getDiscountPrice()).isEqualTo((1000));
    }
}
