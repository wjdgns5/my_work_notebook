package order;

public interface OrderService {
    // 주문목록 생성 - 멤버ID, 아이템이름, 아이템가격
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
