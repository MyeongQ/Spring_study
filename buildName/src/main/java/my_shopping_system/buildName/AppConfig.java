package my_shopping_system.buildName;

import my_shopping_system.buildName.discount.FixDiscountPolicy;
import my_shopping_system.buildName.member.MemberService;
import my_shopping_system.buildName.member.MemberServiceImp;
import my_shopping_system.buildName.member.MemoryMemberRepository;
import my_shopping_system.buildName.order.OrderService;
import my_shopping_system.buildName.order.OrderServiceImp;

// 어플리케이션 동작에 필요한 구현 객체를 생성 -> 주입
public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImp(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImp(
                new MemoryMemberRepository(),
                new FixDiscountPolicy());
    }
}
