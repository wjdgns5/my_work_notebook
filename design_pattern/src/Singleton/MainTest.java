package Singleton;

public class MainTest {

    public static void main(String[] args) {
        // 싱글톤 객체를 불러 와보자. !!
        signleTon systemSingleTon1 = signleTon.getInstance();
        signleTon systemSignleTon2 = signleTon.getInstance();

        System.out.println("singleTon1 : " + systemSingleTon1);
        System.out.println("singleTon2 : " + systemSignleTon2);

        if(systemSingleTon1 == systemSignleTon2) {
            System.out.println("----------------------------");
            System.out.println("같은 객체를 바라보고 있습니다.");
            System.out.println("----------------------------");
        }
    } // end of main
} // end of MainTest
