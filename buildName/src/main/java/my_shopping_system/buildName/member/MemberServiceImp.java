package my_shopping_system.buildName.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImp implements MemberService{

    private final MemberRepository memberRepository;

    @Autowired // ac.getBean(MemberRepository.class)와 같음
    public MemberServiceImp(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    // MemberServiceImp는 memberRepository라는 인터페이스에만 의존

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    // Test를 위한 코드
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
