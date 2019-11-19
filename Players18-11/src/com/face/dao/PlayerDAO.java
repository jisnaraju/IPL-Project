package com.face.dao;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.face.bo.PlayerBO;

public class PlayerDAO {
	String skill;

public static final PlayerDAO regdao=new PlayerDAO();
public static void save(Connection connection,PlayerBO plbo) throws SQLException

{
    Statement st=connection.createStatement();
    String query="insert into player(name,country,skill_name,team_name) values('"+plbo.getPlayerName()+"','"+plbo.getCountry()+"','"+plbo.getSkilllns()+"','"+plbo.getTeamlns()+"')";
    int result=st.executeUpdate(query);
    if(result==1) {
    	System.out.println("Data inserted Successfully");
    }
	
  
}
public void display(Connection connection) throws SQLException {
	 Statement st=connection.createStatement();
	 ResultSet rs=st.executeQuery("select * from player");
	 while(rs.next()) {
		 System.out.println(rs.getString("name")+""+rs.getString("country")+""+rs.getString("skill_name")+""+rs.getString("team_name"));
	    	
	    }
}
public void search(Connection connection) throws SQLException {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter skill");
	String skill=sc.next();
	Statement st=connection.createStatement();
	 ResultSet rs=st.executeQuery("select * from player");
	 
	 while(rs.next()) {
		 if(rs.getString("skill_name").equals(skill)) {
		  System.out.println(rs.getString("name")+""+rs.getString("country")+""+rs.getString("skill_name")+""+rs.getString("team_name"));
		
		
		
		 }
//		 else {
//			 System.out.println("Not serched");
//		 }
	    }
	 
	
}

}
