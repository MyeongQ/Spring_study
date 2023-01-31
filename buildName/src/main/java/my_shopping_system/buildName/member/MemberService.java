package my_shopping_system.buildName.member;

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}
