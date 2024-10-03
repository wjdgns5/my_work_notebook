package member;
public class Member {

    // 필드값, 멤버변수
    private Long id; // 회원 번호
    private String name; // 회원 이름
    private Grade grade; // Grade 클래스에 있는 등급 (BASIC, VIP)

    // 생성자
    public Member(Long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Getter Setter 사용
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Member [id=" + id + ", name=" + name + ", grade=" + grade + "]";
    }
}
