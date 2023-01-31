package my_shopping_system.buildName.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();
    // 원래는 동시성 문제가 있어서 ConcurrentHashMap을 써야하지만,
    // 간단하게 구현하기 위해 HashMap을 씀

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
