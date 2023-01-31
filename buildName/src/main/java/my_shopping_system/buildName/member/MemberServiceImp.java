package my_shopping_system.buildName.member;

public class MemberServiceImp implements MemberService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    // Repository로 사용할 구현체 결정 -> 일단 MemoryMemberRepository 사용

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
