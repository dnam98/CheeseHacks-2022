package cheese22.shelter.repository;

import cheese22.shelter.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, String>, MemberRepository {
    @Override
    Optional<Member> findByEmail(String email);
}
