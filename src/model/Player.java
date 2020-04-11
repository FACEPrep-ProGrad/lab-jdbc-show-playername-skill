package model;

/*
1.Create a class called as Player with below attributes,
 - playerld - Long - name - String - country - String - skill - Skill 
2.Include getter and setter method for all the attributes.
3.Include constructor with below arguments
 - public Player(Long playerld,String name, String country,Skill skill)
*/

public class Player{
	 int playerld;
	 String name;
	 String country;
	 Skill skill;
	 int team_id;
	 
	public int getPlayerld() {
		return playerld;
	}
	public void setPlayerld(int playerld) {
		this.playerld = playerld;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public Skill getSkill() {
		return skill;
	}
	public int getSkillld() {
		return skill.getSkillld();
	}
	public String getSkillName() {
		return skill.getSkillName();
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	
	public int getTeam_id() {
		return team_id;
	}
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}
	
	public Player(int playerld, String name, String country, Skill skill, int team_id) {
		this.playerld = playerld;
		this.name = name;
		this.country = country;
		this.skill = skill;
		this.team_id = team_id;
	}
	 
}