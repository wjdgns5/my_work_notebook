package com.tenco.demo_v1.Controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ResponseBody
@Controller
// @RestController 가능
@RequestMapping("/Con")
public class GetApiController {

    // 주소설계 : http://localhost:8080/Con/hello
    @GetMapping("/hello")
    public String hello() {
        return "Say, Hello!";
    }

    // 주소설계 : http://localhost:8080/Con/qs1?name=둘리
    @GetMapping("/qs1")
    public String qs1(@RequestParam(name = "name") String name) {
        return "name= " + name;
    }
    
    // 주소설계 : http://localhost:8080/Con/qs2?name=둘리&age=10
    @GetMapping("/qs2")
    public String qs2(@RequestParam(name = "name") String name,
                      @RequestParam(name = "age", required = false, defaultValue = "1") Integer age) {
                      // required = false : 해당 필드가 쿼리스트링에 존재하지 않아도 예외가 발생하지 않는다.
        return "name = " + name + ", age = " + age;
    }

    // 주소설계 : http://localhost:8080/Con/qs3?name=둘리&age=10&groupId=com.tenco
    @GetMapping("/qs3")
    public String qs3(@RequestParam Map<String, String> data) {
        // Map 방식으로 동적으로 데이터 바인딩 하기
        StringBuffer sb = new StringBuffer();
        // entrySet() : 모든 key-Value 쌍의 모음
        data.entrySet().forEach(hanjo -> {
            System.out.println(hanjo.getKey());
            System.out.println(hanjo.getValue());
            System.out.println();
            sb.append(hanjo.getKey() + "=" + hanjo.getValue());
            System.out.println(sb);
        });
        return sb.toString();
    }   

    // 쿼리스트링 방식
    // 주소설계 http://localhost:8080/Con/qs4?name=둘리&age=10&groupId=com.tenco
    @GetMapping("/qs4")
    public String qs4(User user) {
        return user.toString();
    }

    @AllArgsConstructor
    @Getter
    @ToString
    class User {
        private String name;
        private Integer age;
        private String groupId;
    }

}
