package br.com.mariojp.figureeditor.quadrado;

import br.com.mariojp.figureeditor.Figura;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Quadrado extends Figura {
    public Quadrado(int posX, int posY, int size) {
        super(posX, posY, size);
    }

    @Override
    public void draw(Graphics2D g) {
        Rectangle2D quadrado = new Rectangle2D.Double(posX, posY, size, size);
        g.setColor(new Color(30,144,255));
        g.setStroke(new BasicStroke(1.2f));
        g.fill(quadrado);
        g.draw(quadrado);
    }
}
