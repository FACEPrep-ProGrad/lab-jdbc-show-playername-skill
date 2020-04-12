package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import model.Skill;
import utility.ConnectionManager;

/*
1.Create a dao-class called as SkillDAO with the below method, - public Skill getSkillBylD(Long id)
- Method used to fetch the skill information from the database based on the skill id.
*/

public class SkillDAO{
	Skill skill;
	Connection con;
	public Skill getSkillBylD(int id) throws Exception {
		con=ConnectionManager.getConnection();
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("SELECT * FROM skill WHERE id="+id);
		while(rs.next()) {
			if(rs.getInt("id")==id) {
				skill=new Skill(rs.getInt("id"),rs.getString("name"));
			}
		}
		return skill;
	}
}