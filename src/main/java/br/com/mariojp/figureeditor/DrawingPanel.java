
package br.com.mariojp.figureeditor;

import br.com.mariojp.figureeditor.circulo.CirculoCreator;
import br.com.mariojp.figureeditor.quadrado.QuadradoCreator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

class DrawingPanel extends JPanel {

    private Color currentColor = Color.black;
    private static final long serialVersionUID = 1L;
    private static final int DEFAULT_SIZE = 60;
    private final List<Figura> shapes = new ArrayList<>();
    private Point startDrag = null;

    DrawingPanel() {
        setBackground(Color.WHITE);
        setOpaque(true);
        setDoubleBuffered(true);

        var mouse = new MouseAdapter() {
            @Override public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1 && startDrag == null) {
                    int posX = e.getPoint().x;
                    int posY = e.getPoint().y;
                    int size = DEFAULT_SIZE;
                    FigureCreator figureCreator = new QuadradoCreator();
                    Figura novaFigura = figureCreator.criarFigura(posX, posY, size, currentColor);
                    shapes.add(novaFigura);
                    repaint();
                }
            }
        };
        addMouseListener(mouse);        
        addMouseMotionListener(mouse);

    }

    void clear() {
        shapes.clear();
        repaint();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        for (Figura figura : shapes) {
            figura.draw(g2);
        }

        g2.dispose();
    }
    protected void setCurrentColor(Color newColor) {
        this.currentColor = newColor;
    }
    public Color getCurrentColor() {
        return this.currentColor;
    }

}
