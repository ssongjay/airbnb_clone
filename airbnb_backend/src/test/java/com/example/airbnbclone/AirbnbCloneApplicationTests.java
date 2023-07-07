package com.example.airbnbclone;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;
import java.sql.DriverManager;

//@SpringBootTest
//class AirbnbCloneApplicationTests {
//
//	@Test
//	void contextLoads() {
//	}
//
//}
//

@SpringBootTest
public class AirbnbCloneApplicationTests {
	@Test
	public void testConnection() {

		try(Connection connection =
					DriverManager.getConnection(
							"jdbc:mysql://localhost:3306/my_airbnb",
							"root",
							"12312")){            //****에 패스워드 입력
			System.out.println(connection);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}