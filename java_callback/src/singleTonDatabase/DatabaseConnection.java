package singleTonDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static DatabaseConnection instance;
    private Connection connection;

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jam?serverTimezone=Asia/Seoul";
        String user = "root";
        String password = "1234";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("데이터베이스에 성공적으로 연결되었습니다.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("데이터베이스 연결에 실패했습니다.");
        }
    }

   // 싱글톤 인스턴스 반환
   public static synchronized DatabaseConnection getInstance() {
    if (instance == null) {
        instance = new DatabaseConnection();
        System.out.println("싱글톤 인스턴스 생성");
    } else {
        System.out.println("기존 인스턴스를 반환");
    }
    return instance;
}

     // 연결 객체 반환
     public Connection getConnection() {
        return connection;
    }

    
}
