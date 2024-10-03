package order;

import member.Member;
import member.repository.MemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    
    // 생성자 의존 주입
    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        // 멤버 아이디를 통해서 멤버의 정보를 가져옵니다.
        Member member = memberRepository.findById(memberId);
        // 멤버의 정보에서 등급을 알아내고, 아이템가격을 할인율을 등급을 통해 비교합니다.
        int discountPrice = discountPolicy.discount(member, itemPrice);
        // 주문을 통해 멤버ID, 아이템이름, 아이템가격, 할인된가격 을 통해 알 수 있습니다.
        Order order = new Order(memberId, itemName, itemPrice, discountPrice);
        // order 로 반환합니다.
        return order;
    }
}
