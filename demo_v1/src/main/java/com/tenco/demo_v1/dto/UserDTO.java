package com.tenco.demo_v1.dto;

import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Data
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UserDTO {

    private String name;
    private Integer age;
    private List<CarDTO> carList;

    // 비 정적 (static) 내부 클래스 (x)
    // 스프링 부트 DTO 설계시 내부 클래스는 static 내부 클래스로 만들자
    @Getter
    @ToString
    @JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
    static class CarDTO {
        private String name;
        private String carNumber;
    }
}
