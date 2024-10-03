package member.service;

import member.Member;
import member.repository.MemberRepository;

public class MemberServiceImpl implements MemberService {

    private MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository repository) {
        this.memberRepository = repository;
    }

    @Override
    public Member findByIdMember(Long memberId) {
        Member member = memberRepository.findById(memberId);
        return member;
    }

    @Override
    public void signUp(Member member) {
        memberRepository.save(member);
    }
}
