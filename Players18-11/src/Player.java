import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;

import com.face.bo.PlayerBO;
//import com.face.bo.SkillBO;
import com.face.dao.PlayerDAO;
import com.face.util.ConnectionManager;
public class Player {
	public Player() throws SQLException, Exception
	{
		PlayerDAO pldao=new PlayerDAO();
		PlayerBO plbo=new PlayerBO();
		//SkillBO skillbo=new SkillBO();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the player name");
    	String playername=sc.nextLine();
    	plbo.setPlayerName(playername);
    	System.out.println("Enter the country name");
    	String countryname=sc.nextLine();
    	plbo.setCountry(countryname);
    	System.out.println("Enter the skill");
    	String skill=sc.nextLine();
    	plbo.setSkilllns(skill);
    	System.out.println("Enter the Teamname");
    	String teamname=sc.nextLine();
    	plbo.setTeamlns(teamname);
    	ConnectionManager conn=new ConnectionManager();
        pldao.save(conn.getConnection(),plbo);
	}
	
//	public Player(String playername,String country,String skill,String team)
//	{
//		
//		
//	}
	
	
}