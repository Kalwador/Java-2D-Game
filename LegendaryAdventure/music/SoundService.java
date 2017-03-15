/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Sound;

/**
 *
 * @author Jarek
 */
public class SoundService {

    public static Music music;
    public static Sound sound;
    
    public static void playMusic(String localization){
        if (core.GameStatus.musicOn) {
            if (music != null && music.playing()) {
                music.stop();
            }
            try {
                music = new Music(localization);
            } catch (SlickException ex) {
            }
            music.setVolume(1);
            music.loop(1.0F, 0.1F);
        }
    }
    
    public static void playClick(){
        try {
            sound = new Sound("music/unit_select.ogg");
        } catch (SlickException ex) {
        }
        sound.play(1.0F,0.2F);
    }
    
    public static void playSwitch(){
        try {
            sound = new Sound("music/change_menu.ogg");
        } catch (SlickException ex) {
        }
        sound.play(1.0F,0.2F);
    }
    
    public static void playHover(boolean once){
        try {
            sound = new Sound("music/onmouseover.ogg");
        } catch (SlickException ex) {
        }
        if (once) {
            sound.play(1.0F, 1.0F);
        }
    }
}
