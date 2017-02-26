package dataBase;

//package dataBaseSQL;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import core.GameStatus;
//import model.Item;
//import org.newdawn.slick.state.StateBasedGame;
//
//public class SQLsave {
//
//    DataBaseConnection db = new DataBaseConnection();
//
//    public void deleteSave(int index) {
//        executeStatment("UPDATE info SET pusty='0' WHERE nr='" + index + "';");
//    }
//
//    public model.SaveToDisplay loadInfo(int index) {
//        model.SaveToDisplay newElem = new model.SaveToDisplay();
//        try {
//            newElem.setNr(index + 1);
//            if (index == 0) {
//                newElem.setMiniaturePath("save/save1.png");
//            }
//            if (index == 1) {
//                newElem.setMiniaturePath("save/save2.png");
//            }
//            if (index == 2) {
//                newElem.setMiniaturePath("save/save3.png");
//            }
//            ResultSet resultSet = db.getResoult("SELECT * FROM info WHERE nr='" + index + "';");
//            if (resultSet.getInt("pusty") == 0) {
//                return new model.SaveToDisplay();
//            } else {
//                newElem.setMapLocation(LocationName.getLokalization(resultSet.getInt("place")));
//                newElem.setSaveDate(resultSet.getString("date"));
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(SQLsave.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return newElem;
//    }
//
//    public void loadGame(int index, StateBasedGame sbg) {
//        try {
//            ResultSet rsInfo = db.getResoult("SELECT * FROM info WHERE nr='" + index + "';");
//            GameStatus.levelID = rsInfo.getInt("place");
//            GameStatus.x = rsInfo.getInt("x");
//            GameStatus.y = rsInfo.getInt("y");
//            //ewentualnie potem info o wybranym sprite
//            GameStatus.money = rsInfo.getInt("gold");
//
//            ResultSet rsChar = db.getResoult("SELECT * FROM character WHERE nr='" + index + "';");
//            GameStatus.hero.heroName = rsChar.getString("name");
//            GameStatus.hero.levelPoints = rsChar.getInt("points");
//            GameStatus.hero.heroLevel = rsChar.getInt("level");
//            GameStatus.hero.tempHeroExperience = rsChar.getInt("tempExp");
//            GameStatus.hero.maxHeroExperience = rsChar.getInt("maxExp");
//            GameStatus.hero.tempHeroHealth = rsChar.getInt("tempHealth");
//            GameStatus.hero.maxHeroHealth = rsChar.getInt("maxHealth");
//            GameStatus.hero.tempHeroMana = rsChar.getInt("tempMana");
//            GameStatus.hero.maxHeroMana = rsChar.getInt("maxMana");
//            GameStatus.hero.heroAttack = rsChar.getFloat("attack");
//            GameStatus.hero.heroDeffence = rsChar.getFloat("deffence");
//            GameStatus.hero.movementSpeed = rsChar.getFloat("movementSpeed");
//            GameStatus.hero.attackSpeed = rsChar.getFloat("attackSpeed");
//            GameStatus.hero.strenght = rsChar.getInt("strenght");
//            GameStatus.hero.agility = rsChar.getInt("agility");
//            GameStatus.hero.inteligence = rsChar.getInt("inteligence");
//
//            ResultSet rsItems = db.getResoult("SELECT * FROM items WHERE nr='" + index + "';");
//            ResultSet rsItemsAmount = db.getResoult("SELECT * FROM amountItems WHERE nr='" + index + "';");
//            for (int i = 0; i < 10; i++) {
//                int id = rsItems.getInt("s0" + i);
//                if (id != 0) {
//                    Item newItem = GameStatus.itemsInGame.get(id);
//                    newItem.setAmount(rsItemsAmount.getInt("s0" + i));
//                    GameStatus.itemsInBag.put(id, newItem);
//                } else {
//                    break;
//                }
//            }
//            for (int i = 10; i < 48; i++) {
//                int id = rsItems.getInt("s" + i);
//                if (id != 0) {
//                    Item newItem = GameStatus.itemsInGame.get(id);
//                    newItem.setAmount(rsItemsAmount.getInt("s" + i));
//                    GameStatus.itemsInBag.put(id, newItem);
//                } else {
//                    break;
//                }
//            }
//
//            ResultSet rsEquip = db.getResoult("SELECT * FROM equip WHERE nr='" + index + "';");
//            ResultSet rsEquipAmount = db.getResoult("SELECT * FROM amountEquip WHERE nr='" + index + "';");
//            for (int i = 0; i < 10; i++) {
//                int id = rsEquip.getInt("s0" + i);
//                if (id != 0) {
//                    model.Equip newEquip = GameStatus.equipInGame.get(id);
//                    newEquip.setAmount(rsEquipAmount.getInt("s0" + i));
//                    GameStatus.equipInBag.put(id, newEquip);
//                } else {
//                    break;
//                }
//            }
//            for (int i = 10; i < 48; i++) {
//                int id = rsEquip.getInt("s" + i);
//                if (id != 0) {
//                    model.Equip newEquip = GameStatus.equipInGame.get(id);
//                    newEquip.setAmount(rsEquipAmount.getInt("s" + i));
//                    GameStatus.equipInBag.put(id, newEquip);
//                } else {
//                    break;
//                }
//            }
//            
//            //dodać wczytywanie skili
//
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//        states.PlayState.needToUpdate = true;
//        sbg.enterState(1);
//    }
//
//    public void executeStatment(String statment) {
//        db.executeStatment(statment);
//    }
//}
