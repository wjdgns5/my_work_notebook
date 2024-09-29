package strategy;

import java.util.Base64;

 // 인코딩 전략 인터페이스
 interface EncodingStrategy {
    String encode(String text);
}

// 일반 텍스트를 보내는 전략 클래스 생성
class NormalStrategy implements EncodingStrategy {

    @Override
    public String encode(String text) {
        return text;
    }
} // end of NormalStrategy

// Base64 인코딩 전략
class Base64Strategy implements EncodingStrategy {
    // 문자 --> 바이트 배열 --> base64 문자열 변환 --> 텍스트 표현
    @Override
    public String encode(String text) {
        // 이진 데이터를 텍스트 형식으로 인코딩하는 방법
        // text.getBytes() : "문자열"을 "바이트 배열"로 변환
        // encodeToString() : "바이트 배열을 Base64 문자열로 변환하여 텍스트로 표현"
        // getEncoder() : "Base64 클래스에서 인코더 객체를 가져옵니다"
        return Base64.getEncoder().encodeToString(text.getBytes());
    }
} // end of Base64Strategy

// 특정 문자열을 추가하는 인코딩 전략
class AppendStrategy implements EncodingStrategy {

    @Override
    public String encode(String text) {
        return text + " : " + "not base64";
    }
} // end of AppendStrategy

// 핵심 !- 클라이언트 클래스
class Encoder {

    // 1. 추상화 (멤버)
    private EncodingStrategy encodingStrategy; // 인터페이스

    // 2. 전략에 따라 메세지를 인코딩 반환
    public String getMessage(String message) {
        return this.encodingStrategy.encode(message);
    }

    // 3. 전략에 따라서 동적으로 전략을 선택할 수 있는 기능
    public void setEncodingStrategy(EncodingStrategy encodingStrategy) {
        this.encodingStrategy = encodingStrategy;
    }
}

public class StrategyTest {
    public static void main(String[] args) {

    // 클라이언트 측 코드
    String message = "password 1234";

    // 1. 텍스트를 인코딩 하는 클래스를 메모리에 올린다.
    Encoder encoder = new Encoder();

    // 전략 클래스 미리 생성해 보기
    NormalStrategy normalStrategy = new NormalStrategy();
    Base64Strategy base64Strategy = new Base64Strategy();
    AppendStrategy appendStrategy = new AppendStrategy();

    // 전략을 선택해서 설정
    encoder.setEncodingStrategy(base64Strategy);
    // 기능 호출해보기
    String outputMessage1 = encoder.getMessage(message);
    System.out.println(outputMessage1);

    // 전략 변경해 보기
    encoder.setEncodingStrategy(appendStrategy);
    // 두번째 기능 호출해보기
    String outputMessage2 = encoder.getMessage(message);
    System.out.println(outputMessage2);

    // 전략 변경해 보기
    encoder.setEncodingStrategy(normalStrategy);
    // 세번째 기능 호출해보기
    String outputMessage3 = encoder.getMessage(message);
    System.out.println(outputMessage3);

    } // end of main
} //  end of StrategyTest
