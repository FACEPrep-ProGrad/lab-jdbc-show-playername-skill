package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO {

	public Skill getSkillByID(Long id) throws Exception {

		// create a connection to the database
		Connection connection = ConnectionManager.getConnection();

		// object for the Skill
		Skill skill = null;

		// statement object to execute the sql query
		String sqlString = "select * from skill where id=" + id;
		Statement statement = connection.createStatement();

		// store the result into ResultSet
		ResultSet resultSet = statement.executeQuery(sqlString);

		while (resultSet.next()) {
			if (resultSet.getInt("id") == id) {
				skill = new Skill(resultSet.getLong("id"), resultSet.getString("name"));
			}
		}
		return skill;
	}
}