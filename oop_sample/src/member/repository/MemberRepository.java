package member.repository;

import member.Member;

public interface MemberRepository {

    // 사용자를 저장하는 기능
    void save(Member member);
    
    // 사용자ID를 통해 사용자를 찾는다.
    Member findById(Long memberId);
}
