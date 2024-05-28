package com.raumschiffspiel;

public class Raumschiff {

    private String name;
    private int posY;
    private int posX;
    private Kapitaen kapitaen;

    public Raumschiff(String name, Kapitaen kapitaen, int posX, int posY) {
        this.name = name;
        this.kapitaen = kapitaen;
        this.posX = posX;
        this.posY = posY;
    }

    public String getName() {
        return name;
    }

    public int getPosY() {
        return posY;
    }

    public int getPosX() {
        return posX;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public Kapitaen getKapitaen() {
        return kapitaen;
    }

    public void setKapitaen(Kapitaen kapitaen) {
        this.kapitaen = kapitaen;
    }

    public void fliegen(char richtung) {
        switch (richtung) {
            case 'a':
                this.posX -= 1;
                break;
            case 'd':
                this.posX += 1;
                break;
            case 'w':
                this.posY += 1;
                break;
            case 's':
                this.posY -= 1;
                break;
            default:
                break;
        }
    }

    public String getKoordinaten() {
        return "Die Koordinaten des Raumschiffs " + this.getName() + " sind (" + this.getPosX() + ", " + this.getPosY() + ")";
    }
}