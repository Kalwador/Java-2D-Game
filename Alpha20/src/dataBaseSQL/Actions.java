package dataBaseSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author maciejpiotrowski
 */
public class Actions {
    public static final String DRIVER = "org.sqlite.JDBC";
    public static final String DB_URL = "jdbc:sqlite:save/slot.db";
 
    private Connection conn;
    private Statement stat;
 
    public Actions() {
        try {
            Class.forName(Actions.DRIVER);
        } catch (ClassNotFoundException e) {
            System.err.println("Brak sterownika JDBC");
            e.printStackTrace();
        }
 
        try {
            conn = DriverManager.getConnection(DB_URL);
            stat = conn.createStatement();
        } catch (SQLException e) {
            System.err.println("Problem z otwarciem polaczenia");
            e.printStackTrace();
        }
 
        createTables();
    }
 
    public boolean createTables()  {
        String createCharacterInformation = "CREATE TABLE IF NOT EXISTS characterinformation"
                + " (id_hero INTEGER PRIMARY KEY AUTOINCREMENT, name varchar(255), x int, y int,"
                + " highlevel int, mediumlevel int, experience int, force int, dexterity int,"
                + " magic int, attack int, mediumattack int, defense int, mediumdefense int, highspeed double)";
        
        String createBag = "CREATE TABLE IF NOT EXISTS bag "
                + "(id_item INTEGER PRIMARY KEY AUTOINCREMENT, item int)";
        
        String createSkills = "CREATE TABLE IF NOT EXISTS skills "
                + "(id_skill INTEGER PRIMARY KEY AUTOINCREMENT, quickskill int, skill boolean)";
        
        String createQuests = "CREATE TABLE IF NOT EXISTS quests "
                + "(id_quest INTEGER PRIMARY KEY AUTOINCREMENT, quest int)";
        
        String createSlot = "CREATE TABLE IF NOT EXISTS slot "
                + "(id_slot INTEGER PRIMARY KEY AUTOINCREMENT, id_hero int, id_item int, id_skill int, id_quest int)";
        try {
            stat.execute(createCharacterInformation);
            stat.execute(createBag);
            stat.execute(createSkills);
            stat.execute(createQuests);
            stat.execute(createSlot);
        } catch (SQLException e) {
            System.err.println("Blad przy tworzeniu tabeli");
            e.printStackTrace();
            return false;
        }
        return true;
    }
 
    public boolean insertCharacterInformation(String name, int x, int y, int highlevel,
        int mediumlevel, int experience, int force, int dexterity, int magic,
        int attack, int mediumattack, int defense, int mediumdefense, double highspeed) {
        try {
            PreparedStatement prepStmt = conn.prepareStatement(
                    "insert into characterinformation values (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
            prepStmt.setString(1, name);
            prepStmt.setInt(2, x);
            prepStmt.setInt(3, y);
            prepStmt.setInt(4, highlevel);
            prepStmt.setInt(5, mediumlevel);
            prepStmt.setInt(6, experience);
            prepStmt.setInt(7, force);
            prepStmt.setInt(8, dexterity);
            prepStmt.setInt(9, magic);
            prepStmt.setInt(10, attack);
            prepStmt.setInt(11, mediumattack);
            prepStmt.setInt(12, defense);
            prepStmt.setInt(13, mediumdefense);
            prepStmt.setDouble(14, highspeed);
            prepStmt.execute();
        } catch (SQLException e) {
            System.err.println("Blad przy tworzeniu statystyk bohtera");
            e.printStackTrace();
            return false;
        }
        return true;
    }
 
    /*public boolean insertKsiazka(String tytul, String autor) {
        try {
            PreparedStatement prepStmt = conn.prepareStatement(
                    "insert into ksiazki values (NULL, ?, ?);");
            prepStmt.setString(1, tytul);
            prepStmt.setString(2, autor);
            prepStmt.execute();
        } catch (SQLException e) {
            System.err.println("Blad przy wypozyczaniu");
            return false;
        }
        return true;
    }*/
 
    public boolean insertSlot(int idHero, int idItem, int idSkill, int idQuest) {
        try {
            PreparedStatement prepStmt = conn.prepareStatement(
                    "insert into slot values (NULL, ?, ?, ?, ?);");
            prepStmt.setInt(1, idHero);
            prepStmt.setInt(2, idItem);
            prepStmt.setInt(3, idSkill);
            prepStmt.setInt(4, idQuest);
            prepStmt.execute();
        } catch (SQLException e) {
            System.err.println("Blad!");
            return false;
        }
        return true;
    }
 
    public List<CharacterInformation> selectCharacterInformation() {
        List<CharacterInformation> characterinformation = new LinkedList<CharacterInformation>();
        try {
            ResultSet result = stat.executeQuery("SELECT * FROM characterinformation");
            int id, x, y, highlevel, mediumlevel, experience, force, dexterity, magic,
                attack, mediumattack, defense, mediumdefense;
            double highspeed;
            String name;
            while(result.next()) {
                id = result.getInt("id_hero");
                name = result.getString("name");
                x =result.getInt("x");
                y = result.getInt("y");
                highlevel = result.getInt("highlevel");
                mediumlevel = result.getInt("mediumlevel");
                experience = result.getInt("experience");
                force = result.getInt("force");
                dexterity = result.getInt("dexterity");
                magic = result.getInt("magic");
                attack = result.getInt("attack");
                mediumattack = result.getInt("mediumattack");
                defense = result.getInt("defense");
                mediumdefense = result.getInt("mediumdefense");
                highspeed = result.getDouble("highspeed");
                characterinformation.add(new CharacterInformation(id, name, x, y, highlevel,
                    mediumlevel, experience, force, dexterity, magic,
                    attack, mediumattack, defense, mediumdefense, highspeed));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return characterinformation;
    }
 
    public List<Bag> selectBag() {
        List<Bag> bag = new LinkedList<Bag>();
        try {
            ResultSet result = stat.executeQuery("SELECT * FROM bag");
            int id , item;
            
            while(result.next()) {
                id = result.getInt("id_item");
                item = result.getInt("item");
                bag.add(new Bag(id, item));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return bag;
    }
    
    public List<Skills> selectSkills() {
        List<Skills> skills = new LinkedList<Skills>();
        try {
            ResultSet result = stat.executeQuery("SELECT * FROM skills");
            int id , quickskill;
            boolean skill;
            
            while(result.next()) {
                id = result.getInt("id_item");
                quickskill = result.getInt("quickskill");
                skill = result.getBoolean("skill");
                skills.add(new Skills(id, quickskill, skill));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return skills;
    }
    
    public List<Quests> selectQuests() {
        List<Quests> quests = new LinkedList<Quests>();
        try {
            ResultSet result = stat.executeQuery("SELECT * FROM skills");
            int id , quest;
            
            while(result.next()) {
                id = result.getInt("id_quest");
                quest = result.getInt("quest");
                quests.add(new Quests(id, quest));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return quests;
    }
 
    public void closeConnection() {
        try {
            conn.close();
        } catch (SQLException e) {
            System.err.println("Problem z zamknieciem polaczenia");
            e.printStackTrace();
        }
    }
}
