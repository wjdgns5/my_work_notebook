package member.service;

import member.Member;

public interface MemberService {

    // 로그인 서비스
    void signUp(Member member);

    // 회원아이디찾기 서비스
    Member findByIdMember(Long memberId);
}
