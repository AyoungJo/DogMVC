package com.spring.dog2.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//connection, close() �޼ҵ� ����
public class JDBCUtill {
	//DB ������ ���� �⺻ ���� 
	static String id = "system";
	static String pass = "111111";
	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public static Connection getConnection() {		
		try {
			//����̹� �ε�			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//������ ���̽� ����
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












