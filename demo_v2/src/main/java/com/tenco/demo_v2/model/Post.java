package com.tenco.demo_v2.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 게시글 테이블 

@Entity(name = "tb_post") // 테이블 이름 TB_POST로 변경
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    @Id  // PK 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 코드 --> DB 위임
    private Long id; // 아이디
    private String title; // 제목
    private String content; // 내용

    // 하나의 게시글에는 여러개의 댓글을 작성할 수 있다.
    // 댓글은 여러개 이므로 list로 받아온다.
    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<Comment> comments;

    // mappedBy : post - 연관 관계의 주인이 Comment 엔티티(Entity)에 Post(속성) 필드 임을 나타낸다.
    // 객체 필드 기준으로 생각해야 합니다.
    // mappedBy 영어 단어 : 매핑기준
    
    // CasecadeType 영어 단어 : 종속
    // CascadeType.ALL : 제약을 설정하게 되면 Post 엔티티(Entity)에 대한 모든 상태 변경 (저장, 삭제)
    // 관련된 Comment 엔티티(Entity)에 전파 된다.



}
