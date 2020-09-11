package model;

public class Skill {
	private Long skillId;
	private String skillName;

	public Long getSkillid() {
		return skillId;
	}

	public void setSkillid(Long skillid) {
		this.skillId = skillid;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public Skill(Long skillId, String skillName) {
		super();
		this.skillId = skillId;
		this.skillName = skillName;
	}

}
