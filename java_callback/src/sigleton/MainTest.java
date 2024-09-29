package sigleton;

public class MainTest {

    public static void main(String[] args) {
        
        // 싱글톤 객체를 불러 와보자. !!
        SignleTon systemSignleTon1 = SignleTon.getInstance();
        SignleTon systemSignleTon2 = SignleTon.getInstance();

        if(systemSignleTon1 == systemSignleTon2) {
            System.out.println("같은 객체를 바라 보고 있습니다.");
        } else {
            System.out.println("다른 객체를 바라보고 있습니다.");
        }
    } // end of main
} // end of MainTest
