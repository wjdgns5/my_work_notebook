package com.tenco.demo_v2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "comment_test11") // 테이블 이름 comment_test11
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order_test {

    @Id // PK 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 코드 --> db 위임
    private Long id;
    private Long orderNumber;
    private String productName;
    private Long orderPrice;

    // 주문 여러번은 한명의 유저가 할 수 있다.
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User_test user;

    // 주문 여러번은 한개의 주소가 될 수 있다.
    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address_test address;
}
