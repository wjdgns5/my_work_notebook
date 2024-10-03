package order;

import member.Grade;
import member.Member;

public class FixDiscountPolicyImpl implements DiscountPolicy {

    // 고정 할인금액 1500
    private int DiscountFixAmount = 1500;

    @Override
    public int discount(Member member, int price) {
        // 만약 등급이 VIP 라면 1500 할인을 받는다.
        if(member.getGrade() == Grade.VIP) {
            return DiscountFixAmount;
        }
        // 아니라면 0원 
        return 0;
    }
}
