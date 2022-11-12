package cheese22.shelter.repository;

import cheese22.shelter.domain.Member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class MemoryMemberRepository implements MemberRepository{
    private static Map<String, Member> store = new HashMap<>();

    @Override
    public Member save(Member member) {
        return new Member();
    }

    @Override
    public Optional<Member> findById(String id) {
        return Optional.empty();
    }

    @Override
    public List<Member> findAll() {
        return null;
    }
}
