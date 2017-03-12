package states;

import core.GameStatus;
import gameUtils.Fonts;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class CharacterState extends BasicGameState {

    String mouse;
    String realMousePosition;
    String actualScr;
    gameUtils.Fonts fonts;
    Image mainFrame;

    Color cw = Color.white;
    Color co = Color.orange;

    //Kolory tekstu na przyciskach
    Color ctab[] = {cw, cw};

    private boolean addPointsEnabled;

    private static int copyOfLevelPoints;
    private static int copyOfStrength;
    private static int copyOfAgility;
    private static int copyOfInteligence;

    //-----------------------------------------
    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        //getCopyOfActualData();
        mainFrame = new Image("graphic/menu/CharInfo.png");
        mouse = "";
        realMousePosition = " ";

        copyOfLevelPoints = GameStatus.hero.levelPoints;
        copyOfStrength = GameStatus.hero.strenght;
        copyOfAgility = GameStatus.hero.agility;
        copyOfInteligence = GameStatus.hero.inteligence;

        //standardowo opcja dodawania ptk zablokowana
        addPointsEnabled = false;
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        Input input = gc.getInput();

        //Mysz w rogu do usunięcia w końcowej fazie
        int xpos = Mouse.getX();
        int ypos = Mouse.getY();
        mouse = "x= " + xpos + " y=" + ypos;
        realMousePosition = "x= " + xpos + " y=" + Math.abs(720 - ypos);

        for (int j = 0; j < ctab.length; j++) {
            ctab[j] = Color.white;
        }

        //powrót do gry
        if ((xpos > 894 && xpos < 916) && (ypos > 564 && ypos < 592)) {
            if (input.isMouseButtonDown(0)) {
                sbg.enterState(1);
            }
        }

        if (input.isKeyPressed(Input.KEY_ESCAPE)) {
            sbg.enterState(1);
        }
        if (addPointsEnabled) {
            //str -
            if (copyOfStrength > 0) {
                if ((xpos > 611 && xpos < 631) && (ypos > 434 && ypos < 454)) {
                    if (input.isMousePressed(0)) {
                        GameStatus.hero.strenght--;
                        GameStatus.hero.levelPoints++;
                        copyOfStrength--;
                        copyOfLevelPoints++;
                    }
                }
            }
            if (copyOfAgility > 0) {
                if ((xpos > 611 && xpos < 631) && (ypos > 382 && ypos < 405)) {
                    if (input.isMousePressed(0)) {
                        //zręczność -
                        GameStatus.hero.agility--;
                        GameStatus.hero.levelPoints++;
                        copyOfAgility--;
                        copyOfLevelPoints++;
                    }
                }
            }
            if (copyOfInteligence > 0) {
                if ((xpos > 611 && xpos < 631) && (ypos > 332 && ypos < 355)) {
                    if (input.isMousePressed(0)) {
                        //obrona -
                        GameStatus.hero.inteligence--;
                        GameStatus.hero.levelPoints++;
                        copyOfInteligence--;
                        copyOfLevelPoints++;
                    }
                }
            }

            if (copyOfLevelPoints > 0) {
                if ((xpos > 650 && xpos < 669) && (ypos > 434 && ypos < 454)) {
                    if (input.isMousePressed(0)) {
                        //siła +
                        GameStatus.hero.strenght++;
                        GameStatus.hero.levelPoints--;
                        copyOfStrength++;
                        copyOfLevelPoints--;
                    }
                }

                if ((xpos > 650 && xpos < 669) && (ypos > 382 && ypos < 405)) {
                    if (input.isMousePressed(0)) {
                        //zręczność +
                        GameStatus.hero.agility++;
                        GameStatus.hero.levelPoints--;
                        copyOfAgility++;
                        copyOfLevelPoints--;
                    }
                }

                if ((xpos > 650 && xpos < 669) && (ypos > 332 && ypos < 355)) {
                    if (input.isMousePressed(0)) {
                        //obrona +
                        GameStatus.hero.inteligence++;
                        GameStatus.hero.levelPoints--;
                        copyOfInteligence++;
                        copyOfLevelPoints--;
                    }
                }
            }
        }
        //SAVE BUTTON
        if ((xpos > 460 && xpos < 600) && (ypos > 277 && ypos < 313)) {
            ctab[0] = Color.orange;
            if (input.isMousePressed(0)) {
                addPointsEnabled = false;
                copyOfStrength = 0;
                copyOfAgility = 0;
                copyOfInteligence = 0;
                if (input.isMouseButtonDown(0)) {
                    ctab[0] = Color.gray;
                }
            }
        }

        //SET POINTS BUTTON 
        if ((xpos > 394 && xpos < 576) && (ypos > 485 && ypos < 520)) {
            ctab[1] = Color.orange;
            if (input.isMousePressed(0)) {
                addPointsEnabled = true;
                if (input.isMouseButtonDown(0)) {
                    ctab[1] = Color.gray;
                }
            }
        }
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {

        //Tło sceny - rozmyty printscreen
        actualScr = screenBlur.ScreenClass.screenNumber();
        Image skrinGB = new Image(actualScr);
        g.drawImage(skrinGB, 0, 0);

        //Okno character info
        g.drawImage(mainFrame, 0, 0);

        Fonts.print18().drawString(100, 10, mouse);
        Fonts.print18().drawString(100, 30, realMousePosition);

        //-------------Wszystkie dane liczbowe--------------
        Fonts.print18().drawString(759, 199, GameStatus.hero.heroName);

        Fonts.print18().drawString(413, 269, "Strenght");
        Fonts.print18().drawString(418, 319, "Agility");
        Fonts.print18().drawString(410, 368, "Inteligence");

        Fonts.print18().drawString(576, 270, String.valueOf(GameStatus.hero.strenght));
        Fonts.print18().drawString(576, 319, String.valueOf(GameStatus.hero.agility));
        Fonts.print18().drawString(576, 367, String.valueOf(GameStatus.hero.inteligence));

        Fonts.print18().drawString(434, 210, "SET POINTS", ctab[1]);
        Fonts.print18().drawString(506, 419, "SAVE", ctab[0]);

        Fonts.print18().drawString(625, 210, String.valueOf(GameStatus.hero.levelPoints));

        Fonts.print18().drawString(422, 468, "  HP:            MP:");
        Fonts.print18().drawString(422, 500, "ATT:         DEFF:");

        Fonts.print18().drawString(472, 468, String.valueOf(GameStatus.hero.maxHeroHealth));
        Fonts.print18().drawString(472, 500, String.valueOf(GameStatus.hero.heroAttack));
        Fonts.print18().drawString(582, 468, String.valueOf(GameStatus.hero.maxHeroMana));
        Fonts.print18().drawString(582, 500, String.valueOf(GameStatus.hero.heroDeffence));

//        Fonts.print18().drawString(790, 519, String.valueOf((float) GameStatus.hero.tempHeroExperience / GameStatus.hero.maxHeroExperience));
    }

    public CharacterState(int character) {
    }

    @Override
    public int getID() {
        return 3;
    }
}
