package my_shopping_system.buildName.member;

public class MemberServiceImp implements MemberService{

    private final MemberRepository memberRepository;

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
}
