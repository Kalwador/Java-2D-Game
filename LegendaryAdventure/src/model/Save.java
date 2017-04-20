/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Kalvador
 */
public class Save {
     //klasa lokalna na potrzeby wyświetlania savów w złotej tabelce

    int nr; //numer 1-3
    String mapLocation; //nazwa miejsca
    String saveDate; //Data zapisu
    String miniaturePath; //Ścieżka miniatury

    public Save() {
        this.nr = 0;
        this.mapLocation = "";
        this.miniaturePath = "brak";
        this.saveDate = "";
    }

    public Save(int nr, String mapLocation, String saveDate, String miniaturePath) {
        this.nr = nr;
        this.mapLocation = mapLocation;
        this.saveDate = saveDate;
        this.miniaturePath = miniaturePath;
    }

    public int getNr() {
        return nr;
    }

    public String getMapLocation() {
        return mapLocation;
    }

    public String getSaveDate() {
        return saveDate;
    }

    public String getMiniaturePath() {
        return miniaturePath;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public void setMapLocation(String mapLocation) {
        this.mapLocation = mapLocation;
    }

    public void setSaveDate(String saveDate) {
        this.saveDate = saveDate;
    }

    public void setMiniaturePath(String miniaturePath) {
        this.miniaturePath = miniaturePath;
    }

    @Override
    public String toString() {
        return "SaveToDisplay{" + "nr=" + nr + ", mapLocation=" + mapLocation + ", saveDate=" + saveDate + ", miniaturePath=" + miniaturePath + '}';
    }

}
