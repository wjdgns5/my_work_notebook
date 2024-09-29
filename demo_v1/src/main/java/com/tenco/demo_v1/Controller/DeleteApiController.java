package com.tenco.demo_v1.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@Controller
@RequestMapping("/delete")
public class DeleteApiController {

    /**
     * 주소 설계 : http://localhost:8080/delete/100?account=우리은행
     * 
     * DELETE 요청을 처리
     * 주소 설계 : 브라우저에서 직접 요청할 수 없음, 보통 PostMan 등으로 테스트
     * http://localhost:8080/delete/100?account=우리은행
     * DELETE 방식은 본문(HTTP 요청 메세지 Body)가 없다.
     * @PathVariable : 경로 변수 처리
     * @RequestParam : 쿼리 파라미터 처리
     *
     * @param userId 삭제하려는 사용자의 ID (경로 변수)
     * @param account 삭제 작업과 관련된 계좌 정보 (쿼리 파라미터)
     * @return : 삭제 결과를 포함하는 ResponseEntity 
     * 추가 고려 사항
     * 인증 및 권한 검사
     * 응답 처리 : 삭제가 성공여부에 따라 다른 상태 내려야 함
     * ex) 404 not Found, 500 Internet Server Error 등
     */
    @DeleteMapping("/{userId}")
    // ResponseEntity : HTTP 상태 코드와 본문을 모두 제어할 수 있습니다
    public ResponseEntity<?> delete(@PathVariable(name = "userId") String userId,
    @RequestParam(name = "account") String account) {

        System.out.println("userId : " + userId);
        System.out.println("account : " + account);

        return ResponseEntity.status(200).body("정상삭제 되었습니다.");
    }
}
