package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Player;
import model.Skill;
import utility.ConnectionManager;

public class PlayerDAO {
	public List<Player> getAllPlayers() throws Exception {
		List<Player> players = new ArrayList<Player>();

		// connection to the database
		Connection connection = ConnectionManager.getConnection();

		// statement to execute the sql query
		String sqlString = "select * from player order by name";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sqlString);

		// null Skill object
		Skill skill = null;
		SkillDAO skillDAO = new SkillDAO();
		while (resultSet.next()) {
			long playerId = resultSet.getLong(1);
			String playerName = resultSet.getString(2);
			String playerCountry = resultSet.getString(3);
			skill = skillDAO.getSkillByID(resultSet.getLong(4));
			Player player = new Player(playerId, playerName, playerCountry, skill);
			players.add(player);
		}
		return players;
	}
}
