package my_shopping_system.buildName.discount;

import my_shopping_system.buildName.member.Member;

public interface DiscountPolicy{

    /**
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);

}
