package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// SpringDataJpa가 JpaRepository를 상속받은 인터페이스를 보고 구현체를 자동으로 생성해준다. -> Bean에 자동으로 등록
// JpaRepository는 CRUD 기능을 제공한다.
//
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    //JPQL select m from Member m where m.name = ?
    @Override
    Optional<Member> findByName(String name);  // SpringDataJpa가 자동으로 구현체를 만들어줌
}
