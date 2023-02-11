package my_shopping_system.buildName.discount;

import my_shopping_system.buildName.member.Grade;
import my_shopping_system.buildName.member.Member;
import org.springframework.stereotype.Component;

@Component
public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount = 1000;  // 1,000원 할인


    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
