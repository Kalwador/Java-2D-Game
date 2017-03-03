package states;

import gameUtils.Fonts;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class CreateCharacterState extends BasicGameState {

    Image background;
    String mouse;

    static String avatarName = "";

    Image avatar1;
    Image avatar2;
    Image avatar3;

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        background = new Image("graphic/menu/backgroundMainMenu.jpg");
        mouse = "";

//        avatar1 = new Image("graphic/heroSprite/avatar1.png").getSubImage(0, 0, 32, 64).getScaledCopy(5);
//        avatar2 = new Image("graphic/heroSprite/avatar2.png").getSubImage(0, 0, 32, 64).getScaledCopy(5);
//        avatar3 = new Image("graphic/heroSprite/avatar3.png").getSubImage(0, 0, 32, 64).getScaledCopy(5);
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        Input input = gc.getInput();
        int xpos = Mouse.getX();
        int ypos = Mouse.getY();
        mouse = "x= " + xpos + " y=" + ypos;

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
                avatarName += "R";
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

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        Fonts.print18().drawString(10, 10, "wsp. myszy: " + mouse);

        background.draw(0, 0);
        Fonts.print28().drawString(300, 100, "CREATE CHARACTER");
        Fonts.print28().drawString(300, 200, avatarName);

    }

    public CreateCharacterState(int state) {
    }

    @Override
    public int getID() {
        return 14;
    }
}
