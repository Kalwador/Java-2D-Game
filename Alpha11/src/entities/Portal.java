package entities;
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
    public int xN;
    
    //y pozycja w którym znajdzie się postać po rzejściu na nowej mapie
    public int yN;

    public Portal() {
    }

    public Portal(int xStart, int xEnd, int yStart, int yEnd, int levelID, int xN, int yN) {
        this.xStart = xStart;
        this.xEnd = xEnd;
        this.yStart = yStart;
        this.yEnd = yEnd;
        this.levelID = levelID;
        this.xN = xN;
        this.yN = yN;
    }

    @Override
    public String toString() {
        return "Portal{" + "xStart=" + xStart + ", xEnd=" + xEnd + ", yStart=" + yStart + ", yEnd=" + yEnd + ", levelID=" + levelID + ", xN=" + xN + ", yN=" + yN + '}';
    }

    
    
}
