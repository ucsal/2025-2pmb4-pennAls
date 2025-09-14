package br.com.mariojp.figureeditor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ignored) {}
            JFrame frame = new JFrame( "Figure Editor — Clique para inserir figuras");
            DrawingPanel panel = new DrawingPanel();
            JPanel buttonPanel = new JPanel();
            JButton colorButton = new JButton("Color Picker - Escolha uma cor para as figuras");

            colorButton.addActionListener(
                 new ActionListener() {
                     public void actionPerformed(ActionEvent e)
                     {
                        Color selectedColor = JColorChooser.showDialog(null, "Selecione uma Cor",panel.getCurrentColor());
                         if (selectedColor != null) {
                             panel.setCurrentColor(selectedColor);
                         }
                     }

                 }
            );

            buttonPanel.add(colorButton);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            frame.setLayout(new BorderLayout());
            frame.add(panel, BorderLayout.CENTER);
            frame.add(buttonPanel, BorderLayout.NORTH);

            frame.setSize(900, 600);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
