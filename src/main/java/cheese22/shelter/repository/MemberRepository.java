package cheese22.shelter.repository;


import java.util.List;
import java.util.Optional;
import cheese22.shelter.domain.Member;


public interface MemberRepository {
  Member save(Member member);
  Optional<Member> findByEmail(String email); // 없으면 null 반환
  List<Member> findAll(); // 모든 회원 list 반환
}
