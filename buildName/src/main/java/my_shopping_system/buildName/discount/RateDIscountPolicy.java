package my_shopping_system.buildName.discount;

import my_shopping_system.buildName.member.Grade;
import my_shopping_system.buildName.member.Member;

public class RateDIscountPolicy implements DiscountPolicy{

    private int discountRateAmount = 10;  // 10% 할인

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountRateAmount / 100;
        } else {
            return 0;
        }
    }
}
