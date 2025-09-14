package br.com.mariojp.figureeditor.circulo;

import br.com.mariojp.figureeditor.Figura;
import br.com.mariojp.figureeditor.FigureCreator;

import java.awt.*;

public class CirculoCreator extends FigureCreator {
    @Override
    public Figura criarFigura(int posX, int posY, int size, Color color) {
        return new Circulo(posX, posY, size , color);
    }
}