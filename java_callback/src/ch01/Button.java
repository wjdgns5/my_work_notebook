package ch01;

/**
 * 콜백 메서드 만들어 보기
 * 인터페이스 만들기
 * 
 * 버튼 클릭 이벤트 인터페이스 (콜백 메서드 정의)
 */

interface IButtonListener {
    void clickEvent(String event);
 }

 // 버튼 클래스 설계
public class Button {
    String name; // 버튼 이름
    // 중요 !!
     private IButtonListener buttonListener; // 버튼에 연결된 리스트 (콜백메서드 활용)

     
    // 클래스 생성자 만들기
    public Button(String name) {
        this.name = name;
    }

    public void click(String message) {
        if(buttonListener != null) {
            buttonListener.clickEvent(message); // 버튼 클릭 시 이벤트 발생 
        }
    }

    public void addEventListener(IButtonListener ibuttonListener) {
        this.buttonListener = ibuttonListener;
    }
}
