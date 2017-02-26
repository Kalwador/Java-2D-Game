package dataBase;

//package dataBaseSQL;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class SQLconnection {
//
//    public final String DRIVER = "org.sqlite.JDBC";
//    public final String DB_URL = "jdbc:sqlite:save/save.db";
//    public static Connection conn;
//    public static Statement stat;
//
//    public SQLconnection() {
//        openConnection();
//    }
//
//    public void openConnection() {
//        try {
//            Class.forName(DRIVER);
//        } catch (ClassNotFoundException e) {
//            System.err.println("Brak sterownika JDBC");
//            e.printStackTrace();
//        }
//        try {
//            conn = DriverManager.getConnection(DB_URL);
//            stat = conn.createStatement();
//        } catch (SQLException e) {
//            System.err.println("Problem z otwarciem polaczenia");
//            e.printStackTrace();
//        }
//    }
//
//    public boolean executeStatment(String statment) {
//        try {
//            stat.execute(statment);
//        } catch (SQLException e) {
//            System.err.println("E R R O R - " + statment);
//            System.out.println(e.getMessage());
//            return false;
//        }
//        return true;
//    }
//
//    public ResultSet getResoult(String statment) {
//        ResultSet rs;
//        try {
//            rs = stat.executeQuery(statment);
//        } catch (SQLException e) {
//            System.err.println("E R R O R - " + statment);
//            System.out.println(e.getMessage());
//            return null;
//        }
//        return rs;
//    }
//
//    public void closeConnection() {
//        try {
//            conn.close();
//        } catch (SQLException e) {
//            System.err.println("Problem z zamknieciem polaczenia");
//            e.printStackTrace();
//        }
//    }
//
//    public void createTables() {
//
//        String info = "CREATE TABLE info("
//                + "nr int,"
//                + "pusty int,"
//                + "place int,"
//                + "x int,"
//                + "y int,"
//                + "date VARCHAR(255),"
//                + "gold int"
//                + ");";
//
//        String character = "CREATE TABLE character("
//                + "nr int,"
//                + "name VARCHAR(255),"
//                + "points int,"
//                + "level int,"
//                + "tempExp int,"
//                + "maxExp int,"
//                + "tempHealth int,"
//                + "maxHealth int,"
//                + "tempMana int,"
//                + "maxMana int,"
//                + "attack float,"
//                + "deffence float,"
//                + "movementSpeed float,"
//                + "attackSpeed float,"
//                + "strenght int,"
//                + "agility int,"
//                + "inteligence int"
//                + ");";
//        String items = "CREATE TABLE items("
//                + "nr int,"
//                + "s00 VARCHAR(15),"
//                + "s01 VARCHAR(15),"
//                + "s02 VARCHAR(15),"
//                + "s03 VARCHAR(15),"
//                + "s04 VARCHAR(15),"
//                + "s05 VARCHAR(15),"
//                + "s06 VARCHAR(15),"
//                + "s07 VARCHAR(15),"
//                + "s08 VARCHAR(15),"
//                + "s09 VARCHAR(15),"
//                + "s10 VARCHAR(15),"
//                + "s11 VARCHAR(15),"
//                + "s12 VARCHAR(15),"
//                + "s13 VARCHAR(15),"
//                + "s14 VARCHAR(15),"
//                + "s15 VARCHAR(15),"
//                + "s16 VARCHAR(15),"
//                + "s17 VARCHAR(15),"
//                + "s18 VARCHAR(15),"
//                + "s19 VARCHAR(15),"
//                + "s20 VARCHAR(15),"
//                + "s21 VARCHAR(15),"
//                + "s22 VARCHAR(15),"
//                + "s23 VARCHAR(15),"
//                + "s24 VARCHAR(15),"
//                + "s25 VARCHAR(15),"
//                + "s26 VARCHAR(15),"
//                + "s27 VARCHAR(15),"
//                + "s28 VARCHAR(15),"
//                + "s29 VARCHAR(15),"
//                + "s30 VARCHAR(15),"
//                + "s31 VARCHAR(15),"
//                + "s32 VARCHAR(15),"
//                + "s33 VARCHAR(15),"
//                + "s34 VARCHAR(15),"
//                + "s35 VARCHAR(15),"
//                + "s36 VARCHAR(15),"
//                + "s37 VARCHAR(15),"
//                + "s38 VARCHAR(15),"
//                + "s39 VARCHAR(15),"
//                + "s40 VARCHAR(15),"
//                + "s41 VARCHAR(15),"
//                + "s42 VARCHAR(15),"
//                + "s43 VARCHAR(15),"
//                + "s44 VARCHAR(15),"
//                + "s45 VARCHAR(15),"
//                + "s46 VARCHAR(15),"
//                + "s47 VARCHAR(15)"
//                + ");";
//        String amountItems = "CREATE TABLE amountItems("
//                + "nr int,"
//                + "s00 VARCHAR(15),"
//                + "s01 VARCHAR(15),"
//                + "s02 VARCHAR(15),"
//                + "s03 VARCHAR(15),"
//                + "s04 VARCHAR(15),"
//                + "s05 VARCHAR(15),"
//                + "s06 VARCHAR(15),"
//                + "s07 VARCHAR(15),"
//                + "s08 VARCHAR(15),"
//                + "s09 VARCHAR(15),"
//                + "s10 VARCHAR(15),"
//                + "s11 VARCHAR(15),"
//                + "s12 VARCHAR(15),"
//                + "s13 VARCHAR(15),"
//                + "s14 VARCHAR(15),"
//                + "s15 VARCHAR(15),"
//                + "s16 VARCHAR(15),"
//                + "s17 VARCHAR(15),"
//                + "s18 VARCHAR(15),"
//                + "s19 VARCHAR(15),"
//                + "s20 VARCHAR(15),"
//                + "s21 VARCHAR(15),"
//                + "s22 VARCHAR(15),"
//                + "s23 VARCHAR(15),"
//                + "s24 VARCHAR(15),"
//                + "s25 VARCHAR(15),"
//                + "s26 VARCHAR(15),"
//                + "s27 VARCHAR(15),"
//                + "s28 VARCHAR(15),"
//                + "s29 VARCHAR(15),"
//                + "s30 VARCHAR(15),"
//                + "s31 VARCHAR(15),"
//                + "s32 VARCHAR(15),"
//                + "s33 VARCHAR(15),"
//                + "s34 VARCHAR(15),"
//                + "s35 VARCHAR(15),"
//                + "s36 VARCHAR(15),"
//                + "s37 VARCHAR(15),"
//                + "s38 VARCHAR(15),"
//                + "s39 VARCHAR(15),"
//                + "s40 VARCHAR(15),"
//                + "s41 VARCHAR(15),"
//                + "s42 VARCHAR(15),"
//                + "s43 VARCHAR(15),"
//                + "s44 VARCHAR(15),"
//                + "s45 VARCHAR(15),"
//                + "s46 VARCHAR(15),"
//                + "s47 VARCHAR(15)"
//                + ");";
//        String equip = "CREATE TABLE equip("
//                + "nr int,"
//                + "s00 VARCHAR(15),"
//                + "s01 VARCHAR(15),"
//                + "s02 VARCHAR(15),"
//                + "s03 VARCHAR(15),"
//                + "s04 VARCHAR(15),"
//                + "s05 VARCHAR(15),"
//                + "s06 VARCHAR(15),"
//                + "s07 VARCHAR(15),"
//                + "s08 VARCHAR(15),"
//                + "s09 VARCHAR(15),"
//                + "s10 VARCHAR(15),"
//                + "s11 VARCHAR(15),"
//                + "s12 VARCHAR(15),"
//                + "s13 VARCHAR(15),"
//                + "s14 VARCHAR(15),"
//                + "s15 VARCHAR(15),"
//                + "s16 VARCHAR(15),"
//                + "s17 VARCHAR(15),"
//                + "s18 VARCHAR(15),"
//                + "s19 VARCHAR(15),"
//                + "s20 VARCHAR(15),"
//                + "s21 VARCHAR(15),"
//                + "s22 VARCHAR(15),"
//                + "s23 VARCHAR(15),"
//                + "s24 VARCHAR(15),"
//                + "s25 VARCHAR(15),"
//                + "s26 VARCHAR(15),"
//                + "s27 VARCHAR(15),"
//                + "s28 VARCHAR(15),"
//                + "s29 VARCHAR(15),"
//                + "s30 VARCHAR(15),"
//                + "s31 VARCHAR(15),"
//                + "s32 VARCHAR(15),"
//                + "s33 VARCHAR(15),"
//                + "s34 VARCHAR(15),"
//                + "s35 VARCHAR(15),"
//                + "s36 VARCHAR(15),"
//                + "s37 VARCHAR(15),"
//                + "s38 VARCHAR(15),"
//                + "s39 VARCHAR(15),"
//                + "s40 VARCHAR(15),"
//                + "s41 VARCHAR(15),"
//                + "s42 VARCHAR(15),"
//                + "s43 VARCHAR(15),"
//                + "s44 VARCHAR(15),"
//                + "s45 VARCHAR(15),"
//                + "s46 VARCHAR(15),"
//                + "s47 VARCHAR(15)"
//                + ");";
//        String amountEquip = "CREATE TABLE amountEquip("
//                + "nr int,"
//                + "s00 VARCHAR(15),"
//                + "s01 VARCHAR(15),"
//                + "s02 VARCHAR(15),"
//                + "s03 VARCHAR(15),"
//                + "s04 VARCHAR(15),"
//                + "s05 VARCHAR(15),"
//                + "s06 VARCHAR(15),"
//                + "s07 VARCHAR(15),"
//                + "s08 VARCHAR(15),"
//                + "s09 VARCHAR(15),"
//                + "s10 VARCHAR(15),"
//                + "s11 VARCHAR(15),"
//                + "s12 VARCHAR(15),"
//                + "s13 VARCHAR(15),"
//                + "s14 VARCHAR(15),"
//                + "s15 VARCHAR(15),"
//                + "s16 VARCHAR(15),"
//                + "s17 VARCHAR(15),"
//                + "s18 VARCHAR(15),"
//                + "s19 VARCHAR(15),"
//                + "s20 VARCHAR(15),"
//                + "s21 VARCHAR(15),"
//                + "s22 VARCHAR(15),"
//                + "s23 VARCHAR(15),"
//                + "s24 VARCHAR(15),"
//                + "s25 VARCHAR(15),"
//                + "s26 VARCHAR(15),"
//                + "s27 VARCHAR(15),"
//                + "s28 VARCHAR(15),"
//                + "s29 VARCHAR(15),"
//                + "s30 VARCHAR(15),"
//                + "s31 VARCHAR(15),"
//                + "s32 VARCHAR(15),"
//                + "s33 VARCHAR(15),"
//                + "s34 VARCHAR(15),"
//                + "s35 VARCHAR(15),"
//                + "s36 VARCHAR(15),"
//                + "s37 VARCHAR(15),"
//                + "s38 VARCHAR(15),"
//                + "s39 VARCHAR(15),"
//                + "s40 VARCHAR(15),"
//                + "s41 VARCHAR(15),"
//                + "s42 VARCHAR(15),"
//                + "s43 VARCHAR(15),"
//                + "s44 VARCHAR(15),"
//                + "s45 VARCHAR(15),"
//                + "s46 VARCHAR(15),"
//                + "s47 VARCHAR(15)"
//                + ");";
//        String skill = "CREATE TABLE slot ("
//                + ""
//                + ");";
//        openConnection();
//        executeStatment(info);
//        executeStatment(character);
//        executeStatment(items);
//        executeStatment(amountItems);
//        executeStatment(equip);
//        executeStatment(amountEquip);
//        closeConnection();
//    }
//}
