package com.spring.dog2.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.spring.dog2.common.JDBCUtill;
import com.spring.dog2.service.DogDO;

@Repository("DogDAO")
public class DogDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public void insertDog(DogDO dogdo) {
		System.out.println("-- insertDog() 처리 --");
		
		try {
			//데이터베이스 연결
			conn = JDBCUtill.getConnection();
			
			//sql문 완성
			String sql = "insert into dog2DB values(dog2seq.nextval, ?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dogdo.getName());
			pstmt.setString(2, dogdo.getHost());
			pstmt.setString(3, dogdo.getBreed());
			pstmt.setString(4, dogdo.getSex());
			pstmt.setInt(5, dogdo.getAge());
			
			//sql문 실행
			pstmt.executeUpdate();
			JDBCUtill.close(rs, pstmt, conn);
			
			System.out.println("-- 데이터 베이스 처리 완료(insertDog) -- ");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<DogDO> getDogList(){
		System.out.println("-- getBoardList() 처리 --");
		ArrayList<DogDO> dList = new ArrayList<DogDO>();
		
		try {
			//데이터베이스 연결
			conn = JDBCUtill.getConnection();			
			//sql문 완성
			String sql = "select * from dog2DB"; 
			pstmt = conn.prepareStatement(sql);			
			//sql문 실행
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				DogDO ddo = new DogDO();
//				
				ddo.setNum(rs.getInt(1));
				ddo.setName(rs.getString(2));
				ddo.setHost(rs.getString(3));
				ddo.setBreed(rs.getString(4));
				ddo.setSex(rs.getString(5));
				ddo.setAge(rs.getInt(6));				
				
				dList.add(ddo);				
			}
			
			JDBCUtill.close(rs, pstmt, conn);			
			System.out.println("-- 데이터 베이스 처리 완료(getDogList()) -- ");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return dList;
	}
	

}
