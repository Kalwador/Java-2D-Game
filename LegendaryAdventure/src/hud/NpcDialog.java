/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hud;

import core.GameStatus;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Npc;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class NpcDialog {

    public static boolean displayDialog;

    /**
     * Card with npc greeting
     */
    private Image card;
    public static model.Npc npc;

    public NpcDialog() {
        npc = new Npc();
        try {
            displayDialog = false;
            card = new Image("graphic/menu/malaKartka.png");
        } catch (SlickException ex) {
            System.out.println("ERROR - NpcDIALOG - malaKarteczka - NOT FOUND");
        }
    }

    /**
     * Metoda wywoła się po wkroczeniu na obszar npc
     *
     * @param gs
     * @throws SlickException
     */
    public void openDialog(GameStatus gs) throws SlickException {
        card.draw(30, 30);
        int i = 30;
        for (String quote : npc.quotes) {
            gameUtils.Fonts.print18().drawString(30, i, quote);
            i += 30;
        }
    }
}
