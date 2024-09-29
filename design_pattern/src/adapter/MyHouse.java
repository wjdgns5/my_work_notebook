package adapter;

 // 스펙 : 220v 가전기기 인터페이스
 interface IElectronic220v {
    void connect();
}

// 스펙 : 110v 가전기기 인터페이스
interface IElectronic110v {
    void connect();
}

// 에어컨 클래스
class AirConditioner implements IElectronic220v {

    @Override
    public void connect() {
        System.out.println("에어컨 연결 220v On");
    }
} // end of AirConditioner

// 헤어드라이기 클래스
class HairDryer implements IElectronic110v {

    @Override
    public void connect() {
        System.out.println("헤어드라이기 연결 110v On");
    } 
} // end of HairDryer

public class MyHouse {

    // 정적 메서드 (기능)
    // 집에 220v 전기 콘센트를 연결 하는 메서드
    public static void homeConnect(IElectronic220v electronic220v) {
        // 청소기, 드라이어기, 냉장고, 티비
        electronic220v.connect();
    }

    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        homeConnect(airConditioner);

        HairDryer dryer = new HairDryer();
        // homeConnect(dryer); <-- 드라이기는 110v 인데 homeConnect는 220v 라서 오류발생

        // 어댑터 클래스 연결 110v 드라이기 를 220v에 사용할 수 있도록 설정
        ElectronicAdapter 헤어드라이기연결어댑터;
        헤어드라이기연결어댑터 = new ElectronicAdapter(dryer);
        homeConnect(헤어드라이기연결어댑터);

    } // end of main
  
} // end of MyHouse
