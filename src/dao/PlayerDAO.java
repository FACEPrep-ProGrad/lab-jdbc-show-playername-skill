package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Player;
import model.Skill;
import utility.ConnectionManager;

/*
1.Create a class called as PlayerDAO with below methods, - public List< Player > getAllPlayers()
 - Method used to fetch all the players and their corresponding skill from the database.
*/

public class PlayerDAO{
	List<Player> playerlist=new ArrayList<Player>();
	Player player;
	Connection con;
	int teamid;
	int playerid;
	String name,country;
	Skill skill;
	SkillDAO skillDAO=new SkillDAO();
	
	public List<Player> getAllPlayers() throws Exception{
		con=ConnectionManager.getConnection();
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("SELECT * FROM player");
		while(rs.next()) {
			playerid=rs.getInt("id");
			name=rs.getString("name");
			country=rs.getString("country");
			skill=skillDAO.getSkillBylD(rs.getInt("skill_id"));
			teamid=rs.getInt("team_id");
			playerlist.add(new Player(playerid,name,country,skill,teamid));
		}
		return playerlist;
	}
	
}