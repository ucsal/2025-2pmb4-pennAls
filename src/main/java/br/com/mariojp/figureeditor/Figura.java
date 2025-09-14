package br.com.mariojp.figureeditor;

import java.awt.*;

public abstract class Figura {

    protected Color color;
    protected int size;
    protected int posY;
    protected int posX;

    public Figura(int posX, int posY, int size, Color color) {
        this.posX = posX;
        this.posY = posY;
        this.size = size;
        this.color = color;
    }

    public abstract void draw(Graphics2D g);
}
