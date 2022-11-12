package cheese22.shelter.repository;


import java.util.List;
import java.util.Optional;
import cheese22.shelter.domain.Member;


public interface MemberRepository {
  // 메인: save, findById
  // 회원이 저장소에 저장됨
  Member save(Member member);
  //Optional: Java8에 들어가 있는 기능
  Optional<Member> findById(Long id); // 없으면 null 반환
  //Optional<Member> findByName(String name);
  List<Member> findAll(); // 모든 회원 list 반환
}
