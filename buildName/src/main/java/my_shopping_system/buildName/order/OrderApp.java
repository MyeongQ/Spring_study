package my_shopping_system.buildName.order;

import my_shopping_system.buildName.AppConfig;
import my_shopping_system.buildName.member.Grade;
import my_shopping_system.buildName.member.Member;
import my_shopping_system.buildName.member.MemberService;
import my_shopping_system.buildName.member.MemberServiceImp;

public class OrderApp {

    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        //OrderService orderService = new OrderServiceImp();
        OrderService orderService = appConfig.orderService();
        
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);
        
        Order order = new Order(memberId, "itemA", 10000, 1000);

        System.out.println("order = " + order);
        System.out.println("order.calculatePrice() = " + order.calculatePrice());
    }
}
