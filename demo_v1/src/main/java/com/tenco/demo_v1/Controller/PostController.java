package com.tenco.demo_v1.Controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@ResponseBody
@Controller
@RequestMapping("/Con")
public class PostController {

    // 주소 설계 http://localhost:8080/Con/demo1
    //  
    // 테스트 데이터 - {"name" : "둘리", "age" : 11}
    @PostMapping("/demo1")
    public String demo1(@RequestBody Map<String, Object> reqData) {
        // Post --> 리소스 취득, 생성 --> DB 접근기술 --> 영구히 데이터를 저장한다.
        StringBuffer sb = new StringBuffer();
        // entrySet() : 모든 key-Value 쌍의 모음
        reqData.entrySet().forEach( hanjo -> {
            sb.append(hanjo.getKey() + "=" + hanjo.getValue());
            System.out.println(sb.toString());
        });
        return sb.toString();
    }
}
