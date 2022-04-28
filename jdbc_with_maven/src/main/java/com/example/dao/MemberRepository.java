package com.example.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.example.entity.Member;
import com.example.ifaces.CrudeRepository;

import java.time.LocalDate;


public class MemberRepository implements CrudeRepository<Member> {
	
	private Connection con;

	public MemberRepository(Connection con) {
		super();
		this.con = con;
	}

	

	
	public int addMember(Member member) {
		
		int rowAdded = 0;
		
		String sql = "insert into amali_member values(?,?,?,?,?,?,?,?)";
		
        try(PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			pstmt.setInt(1, member.getMemberId());
			pstmt.setString(2, member.getMemberName());
			pstmt.setString(3,member.getMemberAddress());
			pstmt.setDate(4,Date.valueOf(member.getAccOpenDate()));
			pstmt.setString(5,member.getMembershipType());
			pstmt.setDouble(6,member.getFeesPaid());
			pstmt.setInt(7,member.getMaxBookAllowed());
			pstmt.setDouble(8,member.getPenaltyAmount());
			
			
			rowAdded= pstmt.executeUpdate();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return rowAdded;
}
	
public List<Member> findAll() {
		
		List<Member> memberList = new ArrayList<Member>();
		
		String sql = "select * from amali_member";
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)) {
			
             ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				int memberId = rs.getInt("member_Id");
				String memberName = rs.getString("member_Name");
				String memberAddress = rs.getString("member_Address");
				Date accOpenDate = rs.getDate("acc_Open_Date");
				LocalDate accDate = accOpenDate.toLocalDate();
				String membershipType = rs.getString("membership_Type");
				double feesPaid = rs.getDouble("fees_Paid");
				int maxBookAllowed = rs.getInt("max_Book_Allowed");
				double penaltyAmount = rs.getDouble("penalty_Allowed");
				
				
				Member memb = new Member(memberId,memberName,memberAddress,accDate,
						             membershipType,feesPaid,maxBookAllowed,penaltyAmount);
				
				memberList.add(memb);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
		return memberList;
	}




@Override
public int add(Member obj) {
	// TODO Auto-generated method stub
	
	return 0;
}




@Override
public int remove(int id) {
	// TODO Auto-generated method stub
	return 0;
}




@Override
public Member findById(int id) {
	// TODO Auto-generated method stub
	return null;
}




@Override
public int update(int Id, Member obj) {
	// TODO Auto-generated method stub
	return 0;
}


		}
		


