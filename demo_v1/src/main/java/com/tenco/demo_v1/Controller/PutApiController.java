package com.tenco.demo_v1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tenco.demo_v1.dto.UserDTO;

@ResponseBody
@Controller
@RequestMapping("/put")
public class PutApiController {

    /**
     * 주소설계 : http://localhost:8080/put/demo1/100
     * 
     * @param id
     * @param entity
     * @return
     */
    @PutMapping("/demo1/{id}")
    public UserDTO putMethodName(@PathVariable(name = "id") String id,
            @RequestBody UserDTO userDTO) {
        System.out.println("id : " + id);
        System.out.println("UserDTO : " + userDTO.toString());
        // 메세지 컨버터 동작 (UserDTO) --> JSON 반환을 해서 --> 클라이언트에 응답처리 한다.
        return userDTO;
    }

    /**
     * 주소설계 : http://localhost:8080/put/demo2/100
     * @param id
     * @param userDTO
     * @return
     */
    @PutMapping("/demo2/{id}")
    public UserDTO putMethodName2(@PathVariable(name = "id") String id,
            @RequestBody UserDTO userDTO) {
        System.out.println("id : " + id);
        System.out.println("UserDTO : " + userDTO.toString());
        // 메세지 컨버터 동작 (UserDTO) --> JSON 반환을 해서 --> 클라이언트에 응답처리 한다.
        return null;
    }
}
