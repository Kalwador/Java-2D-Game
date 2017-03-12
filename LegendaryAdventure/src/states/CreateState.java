package states;

import core.GameStatus;
import gameUtils.Fonts;
import model.Hero;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class CreateState extends BasicGameState {

    Image background;
    Image background2;
    String mouse;

    static String avatarName = "";

    Image[] avatar = new Image[3];

    int actualImage;

    int licznik = 0;
    int pozycja = 0;

    Color cw = Color.white;
    Color co = Color.orange;

    //Kolory tekstu na przyciskach
    Color ctab[] = {cw, cw, cw};

    private static int copyOfLevelPoints;
    private static int copyOfStrength;
    private static int copyOfAgility;
    private static int copyOfInteligence;

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        background = new Image("graphic/menu/backgroundMainMenu.jpg");
        background2 = new Image("graphic/menu/CreateNewHeroBg.png");
        mouse = "";

        avatar[0] = new Image("graphic/heroSprite/avatar1.png").getSubImage(0, 0, 32, 64);
        avatar[1] = new Image("graphic/heroSprite/avatar2.png").getSubImage(0, 0, 32, 64);
        avatar[2] = new Image("graphic/heroSprite/avatar3.png").getSubImage(0, 0, 32, 64);

        copyOfLevelPoints = GameStatus.hero.levelPoints;
        copyOfStrength = GameStatus.hero.strenght;
        copyOfAgility = GameStatus.hero.agility;
        copyOfInteligence = GameStatus.hero.inteligence;

        actualImage = 0;
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        Input input = gc.getInput();
        int xpos = Mouse.getX();
        int ypos = Mouse.getY();
        mouse = "x= " + xpos + " y=" + ypos;

        for (int j = 0; j < ctab.length; j++) {
            ctab[j] = Color.white;
        }

        //--------------------------------------------------------------------
        //---------------------------CHERO NAME--------------------------------
        if (input.isKeyPressed(Input.KEY_ESCAPE)) {
            sbg.enterState(0);
        }
        if (input.isKeyPressed(Input.KEY_BACK)) {
            if (avatarName.length() > 0) {
                avatarName = avatarName.substring(0, avatarName.length() - 1);
            }
        }
        if (avatarName.length() < 8) {
            if (input.isKeyPressed(Input.KEY_A)) {
                if (input.isKeyDown(Input.KEY_CAPITAL)) {
                    avatarName += "A";
                } else {
                    avatarName += "a";
                }
            }
            if (input.isKeyPressed(Input.KEY_B)) {
                if (input.isKeyDown(Input.KEY_CAPITAL)) {
                    avatarName += "B";
                } else {
                    avatarName += "b";
                }
            }
            if (input.isKeyPressed(Input.KEY_C)) {
                if (input.isKeyDown(Input.KEY_CAPITAL)) {
                    avatarName += "C";
                } else {
                    avatarName += "c";
                }
            }
            if (input.isKeyPressed(Input.KEY_D)) {
                if (input.isKeyDown(Input.KEY_CAPITAL)) {
                    avatarName += "D";
                } else {
                    avatarName += "d";
                }
            }
            if (input.isKeyPressed(Input.KEY_E)) {
                if (input.isKeyDown(Input.KEY_CAPITAL)) {
                    avatarName += "E";
                } else {
                    avatarName += "e";
                }
            }
            if (input.isKeyPressed(Input.KEY_F)) {
                if (input.isKeyDown(Input.KEY_CAPITAL)) {
                    avatarName += "F";
                } else {
                    avatarName += "f";
                }
            }
            if (input.isKeyPressed(Input.KEY_G)) {
                if (input.isKeyDown(Input.KEY_CAPITAL)) {
                    avatarName += "G";
                } else {
                    avatarName += "g";
                }
            }
            if (input.isKeyPressed(Input.KEY_H)) {
                if (input.isKeyDown(Input.KEY_CAPITAL)) {
                    avatarName += "H";
                } else {
                    avatarName += "h";
                }
            }
            if (input.isKeyPressed(Input.KEY_I)) {
                if (input.isKeyDown(Input.KEY_CAPITAL)) {
                    avatarName += "I";
                } else {
                    avatarName += "i";
                }
            }
            if (input.isKeyPressed(Input.KEY_J)) {
                if (input.isKeyDown(Input.KEY_CAPITAL)) {
                    avatarName += "J";
                } else {
                    avatarName += "j";
                }
            }
            if (input.isKeyPressed(Input.KEY_K)) {
                if (input.isKeyDown(Input.KEY_CAPITAL)) {
                    avatarName += "K";
                } else {
                    avatarName += "k";
                }
            }
            if (input.isKeyPressed(Input.KEY_L)) {
                if (input.isKeyDown(Input.KEY_CAPITAL)) {
                    avatarName += "L";
                } else {
                    avatarName += "l";
                }
            }
            if (input.isKeyPressed(Input.KEY_M)) {
                if (input.isKeyDown(Input.KEY_CAPITAL)) {
                    avatarName += "M";
                } else {
                    avatarName += "m";
                }
            }
            if (input.isKeyPressed(Input.KEY_N)) {
                if (input.isKeyDown(Input.KEY_CAPITAL)) {
                    avatarName += "N";
                } else {
                    avatarName += "n";
                }
            }
            if (input.isKeyPressed(Input.KEY_O)) {
                if (input.isKeyDown(Input.KEY_CAPITAL)) {
                    avatarName += "O";
                } else {
                    avatarName += "o";
                }
            }
            if (input.isKeyPressed(Input.KEY_P)) {
                if (input.isKeyDown(Input.KEY_CAPITAL)) {
                    avatarName += "P";
                } else {
                    avatarName += "p";
                }
            }
            if (input.isKeyPressed(Input.KEY_R)) {
                if (input.isKeyDown(Input.KEY_CAPITAL)) {
                    avatarName += "R";
                } else {
                    avatarName += "r";
                }
            }
            if (input.isKeyPressed(Input.KEY_S)) {
                if (input.isKeyDown(Input.KEY_CAPITAL)) {
                    avatarName += "S";
                } else {
                    avatarName += "s";
                }
            }
            if (input.isKeyPressed(Input.KEY_T)) {
                if (input.isKeyDown(Input.KEY_CAPITAL)) {
                    avatarName += "T";
                } else {
                    avatarName += "t";
                }
            }
            if (input.isKeyPressed(Input.KEY_U)) {
                if (input.isKeyDown(Input.KEY_CAPITAL)) {
                    avatarName += "U";
                } else {
                    avatarName += "u";
                }
            }
            if (input.isKeyPressed(Input.KEY_W)) {
                if (input.isKeyDown(Input.KEY_CAPITAL)) {
                    avatarName += "W";
                } else {
                    avatarName += "w";
                }
            }
            if (input.isKeyPressed(Input.KEY_X)) {
                if (input.isKeyDown(Input.KEY_CAPITAL)) {
                    avatarName += "X";
                } else {
                    avatarName += "x";
                }
            }
            if (input.isKeyPressed(Input.KEY_Y)) {
                if (input.isKeyDown(Input.KEY_CAPITAL)) {
                    avatarName += "Y";
                } else {
                    avatarName += "y";
                }
            }
            if (input.isKeyPressed(Input.KEY_Z)) {
                if (input.isKeyDown(Input.KEY_CAPITAL)) {
                    avatarName += "Z";
                } else {
                    avatarName += "z";
                }
            }
        }

        //str - BUTTON
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
        //agi - BUTTON
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
        //int - BUTTON
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
            //str + BUTTON
            if ((xpos > 650 && xpos < 669) && (ypos > 434 && ypos < 454)) {
                if (input.isMousePressed(0)) {
                    //siła +
                    GameStatus.hero.strenght++;
                    GameStatus.hero.levelPoints--;
                    copyOfStrength++;
                    copyOfLevelPoints--;
                }
            }
            //agi + BUTTON
            if ((xpos > 650 && xpos < 669) && (ypos > 382 && ypos < 405)) {
                if (input.isMousePressed(0)) {
                    //zręczność +
                    GameStatus.hero.agility++;
                    GameStatus.hero.levelPoints--;
                    copyOfAgility++;
                    copyOfLevelPoints--;
                }
            }
            //int + BUTTON
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

        //NEXT BUTTON
        if ((xpos > 722 && xpos < 889) && (ypos > 305 && ypos < 342)) {
            ctab[2] = Color.orange;
            if (input.isMousePressed(0)) {
                switch (actualImage) {
                    case 0: {
                        actualImage = 1;
                        break;
                    }
                    case 1: {
                        actualImage = 2;
                        break;
                    }
                    case 2: {
                        actualImage = 0;
                        break;
                    }
                }
            }
        }
        //BACK BUTTON
        if ((xpos > 457 && xpos < 606) && (ypos > 220 && ypos < 263)) {
            ctab[1] = Color.orange;
            if (input.isMousePressed(0)) {
                core.GameStatus.hero = new Hero();
                sbg.enterState(0);

                if (input.isMouseButtonDown(0)) {
                    ctab[1] = Color.gray;
                }
            }
        }
        //START BUTTON
        if ((xpos > 664 && xpos < 813) && (ypos > 220 && ypos < 263)) {
            ctab[0] = Color.orange;
            if (input.isMousePressed(0)) {
                states.PlayState.gs = new core.GameStatus();
                GameStatus.spriteNumber = (actualImage + 1);
                GameStatus.sprite = new core.Sprite();
                GameStatus.hero.heroName = avatarName;
                sbg.enterState(1);
                if (input.isMouseButtonDown(0)) {
                    ctab[0] = Color.gray;
                }
            }
        }
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {

        background.draw(0, 0);
        background2.draw(0, 0);

        avatar[actualImage].draw(773, 215, 2.0f);

        Fonts.print18().drawString(10, 10, "wsp. myszy: " + mouse);

        Fonts.print46().drawString(400, 60, "CREATE CHARACTER");
        Fonts.print28().drawString(430, 140, "NAME:");
        Fonts.print28().drawString(610, 140, avatarName);

        licznik++;
        if (licznik % 70 == 0 || licznik % 70 == 1) {
            switch (avatarName.length()) {
                case 0:
                    pozycja = 600;
                    break;
                case 1:
                    pozycja = 620;
                    break;
                case 2:
                    pozycja = 640;
                    break;
                case 3:
                    pozycja = 660;
                    break;
                case 4:
                    pozycja = 680;
                    break;
                case 5:
                    pozycja = 700;
                    break;
                case 6:
                    pozycja = 720;
                    break;
                case 7:
                    pozycja = 740;
                    break;
                case 8:
                    pozycja = 760;
                    break;
            }
            Fonts.print28().drawString(pozycja, 140, "|");
        }

        if (licznik == 3000) {
            licznik = 0;
        }

        Fonts.print18().drawString(413, 269, "Strenght");
        Fonts.print18().drawString(418, 319, "Agility");
        Fonts.print18().drawString(410, 368, "Inteligence");

        Fonts.print18().drawString(576, 270, String.valueOf(GameStatus.hero.strenght));
        Fonts.print18().drawString(576, 319, String.valueOf(GameStatus.hero.agility));
        Fonts.print18().drawString(576, 367, String.valueOf(GameStatus.hero.inteligence));

        Fonts.print18().drawString(440, 210, "POINTS");
        Fonts.print18().drawString(508, 470, "BACK", ctab[1]);
        Fonts.print18().drawString(709, 470, "START", ctab[0]);
        Fonts.print18().drawString(780, 390, "NEXT", ctab[2]);

        Fonts.print18().drawString(625, 210, String.valueOf(GameStatus.hero.levelPoints));
    }

    public CreateState(int state) {
    }

    @Override
    public int getID() {
        return 14;
    }
}
