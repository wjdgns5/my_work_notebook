package singleTonDatabase;

import java.sql.Connection;

public class DatabaseMain {

    public static void main(String[] args) {
        // 싱글톤 인스턴스 가져오기
        DatabaseConnection pool = DatabaseConnection.getInstance();

        // 연결 객체 가져오기
        Connection connection1 = pool.getConnection();
        Connection connection2 = pool.getConnection();

        // 이곳에서 추가 작업 수행 가능
        if (connection1 == connection2) {
            System.out.println("동일한 Connection 객체입니다.");
        } else {
            System.out.println("다른 Connection 객체입니다.");
        }
        
    }   

}
