package model;

public class Npc {

    public String name;
    public String[] quotes;

    //wspolrzedne
    public int x;
    public int y;

    //nr mapy
    public int levelID;

    public Npc() {
        this.name = "";
        this.quotes = new String[]{" ", " "};
        this.x = 0;
        this.y = 0;
        this.levelID = 0;
    }

    public Npc(int levelID, int x, int y, String name, String[] quotes) {
        this.name = name;
        this.quotes = quotes;
        this.x = x;
        this.y = y;
        this.levelID = levelID;
    }

    public String getName() {
        return name;
    }

    public String[] getQuotes() {

        return quotes;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getLevelID() {
        return levelID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuotes(String[] quotes) {
        this.quotes = quotes;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setLevelID(int levelID) {
        this.levelID = levelID;
    }

    @Override
    public String toString() {
        return "Npc{" + "name=" + name + ", quotes=" + quotes + ", x=" + x + ", y=" + y + ", levelID=" + levelID + '}';
    }

}
