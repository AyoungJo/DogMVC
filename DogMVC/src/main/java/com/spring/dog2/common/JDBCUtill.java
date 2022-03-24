package com.spring.dog2.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//connection, close() 메소드 설정
public class JDBCUtill {
	//DB 접속을 위한 기본 정보 
	static String id = "system";
	static String pass = "111111";
	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public static Connection getConnection() {		
		try {
			//드라이버 로딩			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//데이터 베이스 연결
			return DriverManager.getConnection(url, id, pass);		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void close(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		if(conn != null) {
			try {
				if(!conn.isClosed()) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}		
		}
		if(pstmt != null) {
			try {
				if(!pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			} 		
		}
		if(rs != null) {
			try {
				if(!rs.isClosed()) {
					rs.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}
	}
}












