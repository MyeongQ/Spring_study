package my_shopping_system.buildName.member;

public interface MemberRepository {

    // 구현할 기능들을 우선 정의
    void save(Member member);

    Member findById(Long memberId);
}
