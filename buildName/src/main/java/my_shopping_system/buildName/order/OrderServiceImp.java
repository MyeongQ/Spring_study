package my_shopping_system.buildName.order;

import my_shopping_system.buildName.discount.DiscountPolicy;
import my_shopping_system.buildName.discount.FixDiscountPolicy;
import my_shopping_system.buildName.member.Member;
import my_shopping_system.buildName.member.MemberRepository;
import my_shopping_system.buildName.member.MemoryMemberRepository;

public class OrderServiceImp implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
