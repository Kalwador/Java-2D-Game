//package actor;
//
//import core.GameStatus;
//import core.LoadEntity;
//
//import gameUtils.Fonts;
//import model.Npc;
//import org.newdawn.slick.Image;
//import org.newdawn.slick.SlickException;
//
//
//public class Dialogs {
//    
//private Image img;
////public static boolean displayDialog=false;
//
//
//     public Dialogs() throws SlickException {
//         
//        img= new Image("graphic/menu/malaKartka.png");
//    }
//
//
//    
//    public void openDialog(GameStatus gs) throws SlickException{
//      
//        for (int i = 0; i < Npc.npc.size(); i++) {
//            
//            if (gs.x == Npc.npc.get(i).getX() && gs.y == Npc.npc.get(i).getY()) { 
//                
//               
//                    
//                    img.draw(30,30);
//                    
//                
//            }        
//        }       
//    }
//
//
//}