package br.com.mariojp.figureeditor;

import java.awt.*;

public abstract class Figura {

   protected int size;
    protected int posY;
    protected int posX;

    public Figura(int posX, int posY, int size) {
        this.posX = posX;
        this.posY = posY;
        this.size = size;
    }

    public abstract void draw(Graphics2D g);
}
