package order;

import member.repository.MemberRepository;
import member.repository.MemoryMemberRepositoryImpl;

public class OrderServiceTest {

     public static void main(String[] args) {
        
        MemberRepository memberRepository = MemoryMemberRepositoryImpl.getInstance();
    //    Member member = new Member(1L, "홍길동", Grade.VIP);

        // 고정 할인 정책 테스트
        DiscountPolicy fixDiscountPolicy = new FixDiscountPolicyImpl();
        // 퍼센트 할인 정책 테스트
        DiscountPolicy perDiscountPolicy = new PercentDiscountPolicyImpl();

        // 고정 할인 주문
        OrderService orderService = new OrderServiceImpl(memberRepository, perDiscountPolicy);
        Order order = orderService.createOrder(1L, "맥북", 10000);
        System.out.println(order);

        // 퍼센트 할인 주문
        OrderService orderService1 = new OrderServiceImpl(memberRepository, fixDiscountPolicy);
        Order order1 = orderService1.createOrder(2L, "아이패드", 70000);
        System.out.println(order1);
     }
}
