package com.tenco.demo_v2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "user_test11")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User_test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 번호
    private String name; // 유저 이름
}
