package my_shopping_system.buildName.order;

import lombok.RequiredArgsConstructor;
import my_shopping_system.buildName.discount.DiscountPolicy;
import my_shopping_system.buildName.discount.FixDiscountPolicy;
import my_shopping_system.buildName.member.Member;
import my_shopping_system.buildName.member.MemberRepository;
import my_shopping_system.buildName.member.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@RequiredArgsConstructor
public class OrderServiceImp implements OrderService{

    private final MemberRepository memberRepository; // final의 의미 = 값이 꼭 있어야 함
    private final DiscountPolicy discountPolicy;

    @Autowired
    public OrderServiceImp(MemberRepository memberRepository, @Qualifier("mainDiscountPolicy") DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

    // Test를 위한 코드
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
