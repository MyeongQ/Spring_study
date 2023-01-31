package my_shopping_system.buildName.order;

import my_shopping_system.buildName.member.Grade;
import my_shopping_system.buildName.member.Member;
import my_shopping_system.buildName.member.MemberService;
import my_shopping_system.buildName.member.MemberServiceImp;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService = new MemberServiceImp();
    OrderService orderService = new OrderServiceImp();

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
