package cheese22.shelter.repository;


import java.util.List;
import java.util.Optional;
import cheese22.shelter.domain.Member;


public interface MemberRepository {
  Member save(Member member);
}
