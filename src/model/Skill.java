package model;
/*
1.Create a class called as skill with below attributes, - skillld - Long - skillName - String 
2.Include appropriate getters and setters.
3.Include getter and setter method for all the attributes
 Include constructor with below arguments, public Skill(skillId, skillName).
*/

public class Skill{
	int skillld;
	String skillName;
	
	public int getSkillld() {
		return skillld;
	}
	public void setSkillld(int skillld) {
		this.skillld = skillld;
	}
	
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	
	public Skill(int skillld, String skillName) {
		this.skillld = skillld;
		this.skillName = skillName;
	}
	
}