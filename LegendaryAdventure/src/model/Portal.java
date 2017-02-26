package model;
public class Portal {
    
    //x rozpoczecia portalu
    public int xStart;
    
    //x zakończenia portalu
    public int xEnd;
    
    //y rozpoczecia portalu
    public int yStart;
    
    //y zakończenia portalu
    public int yEnd;
    
    //level na którą zostaniemy przeniesieni
    public int levelID;
    
    //x pozycja w którym znajdzie się postać po rzejściu na nowej mapie
    public int xNew;
    
    //y pozycja w którym znajdzie się postać po rzejściu na nowej mapie
    public int yNew;

    public Portal() {
    }

    public Portal(int xStart, int xEnd, int yStart, int yEnd, int levelID, int xN, int yN) {
        this.xStart = xStart;
        this.xEnd = xEnd;
        this.yStart = yStart;
        this.yEnd = yEnd;
        this.levelID = levelID;
        this.xNew = xN;
        this.yNew = yN;
    }

    @Override
    public String toString() {
        return "Portal{" + "xStart=" + xStart + ", xEnd=" + xEnd + ", yStart=" + yStart + ", yEnd=" + yEnd + ", levelID=" + levelID + ", xN=" + xNew + ", yN=" + yNew + '}';
    }

    public void setxStart(int xStart) {
        this.xStart = xStart;
    }

    public void setxEnd(int xEnd) {
        this.xEnd = xEnd;
    }

    public void setyStart(int yStart) {
        this.yStart = yStart;
    }

    public void setyEnd(int yEnd) {
        this.yEnd = yEnd;
    }

    public void setLevelID(int levelID) {
        this.levelID = levelID;
    }

    public void setxNew(int xN) {
        this.xNew = xN;
    }

    public void setyNew(int yN) {
        this.yNew = yN;
    }

    
    
}
