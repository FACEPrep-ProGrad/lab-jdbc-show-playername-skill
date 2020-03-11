![Image description](https://i1.faceprep.in/ProGrad/face-logo-resized.png)

# ProGrad Lab | ProGrad Premier League




![sql](https://user-images.githubusercontent.com/58466121/76389844-3c85d400-6392-11ea-875f-8cd9676219b2.JPG)


![1 2](https://user-images.githubusercontent.com/61002120/76416050-5807d380-63c0-11ea-8d52-9e8750e800f9.png)

## Progression 1:

Create `Main.java` with main method Create skill.java domain class with below attributes, 
```
skillld - Long 
skillName - String 
```


## Progression 2:

Include getter and setter method for all the attributes Include constructor with below arguments, public Skill(skillId, skillName) 


## Progression 3:

Create `SkilIDA0` class withe below method, 
`public Skill getSkillBylD(Long id)` - Method used to fetch the skill information from the database based on the skill id. 


## Progression 4:

Create `Player.java` domain class with below attributes, 
```
playerld - Long 
name - String 
country - String 
skill - Skill 
```
Include getter and setter method for all the attributes Include constructor with below arguments, 
`public Player(Long playerld,String name, String country,Skill skill)` 


## Progression 5:

Create `PlayerDAO.java` class with below methods, public List<Player> getAllPlayers() - Method used to fetch all the players and their corresponding skill from the database.


### Note:

Use the below code to retreive the connection details from mysql.properties to establish connection
```
public static Properties loadPropertiesFile() throws Exception {
	Properties prop = new Properties();	
	InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
	prop.load(in);
	in.close(); 
	return prop;
}
```    
