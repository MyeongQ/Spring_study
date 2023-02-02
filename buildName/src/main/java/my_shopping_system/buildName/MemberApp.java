package my_shopping_system.buildName;

import my_shopping_system.buildName.member.Grade;
import my_shopping_system.buildName.member.Member;
import my_shopping_system.buildName.member.MemberService;
import my_shopping_system.buildName.member.MemberServiceImp;

public class MemberApp {

    // psvm = public static void main
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);
        
        Member findMember = memberService.findMember(1L);
        System.out.println("findMember = " + member.getName());
        System.out.println("findMember = " + findMember.getName());
    }
}
