package br.com.mariojp.figureeditor.quadrado;

import br.com.mariojp.figureeditor.Figura;
import br.com.mariojp.figureeditor.FigureCreator;

public class QuadradoCreator extends FigureCreator {
    @Override
    public Figura criarFigura(int posX, int posY, int size) {
       return new Quadrado( posX,  posY,  size);
    }
}
