import java.sql.SQLException;
import java.util.*;

import com.face.bo.PlayerBO;
import com.face.dao.PlayerDAO;
import com.face.util.ConnectionManager;
public class Main {

	public static void main(String[] args) throws SQLException, Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("1.List of all players");
		System.out.println("2.Add new players");
		System.out.println("3.Sesrch player");
		int option=sc.nextInt();
		
	    switch (option)
	    {
	    case 1:
	    {
	    	System.out.println("Players details:");
	    	PlayerDAO pldao=new PlayerDAO();
	    	//Player player=new Player();
   	        ConnectionManager conn=new ConnectionManager();
	    	pldao.display(conn.getConnection());
	    	break;
	    }
	    case 2:
	    {
	    	Player player=new Player();
	    	break;
	    	
	    }
	    case 3:
	    {
	    	
	    	PlayerDAO pldao=new PlayerDAO();
	    	ConnectionManager conn=new ConnectionManager();
	    	pldao.search(conn.getConnection());
	    	
	    }
	    	
	    }
	}

}
