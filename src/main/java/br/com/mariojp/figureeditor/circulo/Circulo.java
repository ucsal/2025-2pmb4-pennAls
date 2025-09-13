package br.com.mariojp.figureeditor.circulo;

import br.com.mariojp.figureeditor.Figura;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Circulo extends Figura {
    public Circulo(int posX, int posY, int size) {
        super(posX, posY, size);
    }

    @Override
    public void draw(Graphics2D g) {
        Ellipse2D circle = new Ellipse2D.Double(posX, posY, size, size);
        g.setColor(new Color(30,144,255));
        g.setStroke(new BasicStroke(1.2f));
        g.fill(circle);
        g.draw(circle);
    }

}
