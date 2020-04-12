package controller;

import java.util.List;

import dao.PlayerDAO;
import model.Player;

/*
1.Create a controller called as Main inside the controller package.
2.Create appropriate objects for the classes - Player, PlayerDAO, Skill and SkillDAO.
3.Refer sample output given below for output format.
*/

public class Main {
	public static void main(String[] args) throws Exception {
		PlayerDAO playerDAO=new PlayerDAO();
		List<Player> list=playerDAO.getAllPlayers();
		System.out.println("List of all player and their skill");
		System.out.println();
		System.out.println("Id   Name       Country     Skill");
		for(int i=0;i<list.size();i++) {
			System.out.println();
			System.out.print(list.get(i).getSkill().getSkillld()+"    ");
			System.out.print(list.get(i).getName()+"    ");
			System.out.print(list.get(i).getCountry()+"    ");
			System.out.print(list.get(i).getSkill().getSkillName());
			System.out.println();
		}
	}
}
