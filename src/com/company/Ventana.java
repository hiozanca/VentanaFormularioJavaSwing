package com.company;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame{

    private JLabel etiqueta;
    private JTextField campo;
    private JLabel etiqueta2;
    private JTextField campo2;
    private JLabel etiqueta3;
    private JTextField campo3;
    private JLabel etiqueta4;
    private JComboBox menu;
    private JLabel etiqueta5;
    private JRadioButton seleccion, seleccion2, seleccion3, seleccion4;
    private  JButton guardar;


    GridBagConstraints gbc = new GridBagConstraints();


    public Ventana() {
        super("Formulario de registro");

        etiqueta = new JLabel("NOMBRE");
        campo = new JTextField(10);
        etiqueta2 = new JLabel("Apellido");
        campo2 = new JTextField(10);
        etiqueta3 = new JLabel("CI");
        campo3 = new JTextField(10);
        etiqueta4 = new JLabel("Emitido en");
        menu = new JComboBox();
        etiqueta5 = new JLabel("Intereses");
        seleccion = new JRadioButton("jugar");
        seleccion2 = new JRadioButton("escuchar musica");
        seleccion3 = new JRadioButton("ver tele");
        seleccion4 = new JRadioButton("dormir");
        guardar = new JButton("Guardar");
        setLayout(new GridBagLayout());

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(etiqueta, gbc);
        gbc.gridx = 3;
        gbc.gridy = 1;
        add(campo, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(etiqueta2, gbc);
        gbc.gridx = 3;
        gbc.gridy = 3;
        add(campo2,gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;
        add(etiqueta3, gbc);
        gbc.gridx = 3;
        gbc.gridy = 4;
        add(campo3, gbc);
        gbc.gridx = 1;
        gbc.gridy = 5;
        add(etiqueta4,gbc);
        gbc.gridx = 3;
        gbc.gridy = 5;
        add(menu, gbc);
        menu.addItem("       ");
        menu.addItem("COCHABAMBA");
        menu.addItem("ORURO");
        menu.addItem("LA PAZ");
        menu.addItem("BENI");
        menu.addItem("SANTA CRUZ");
        menu.addItem("POTOSI");
        menu.addItem("PANDO");
        menu.addItem("TARIJA");
        menu.addItem("CHUQUISACA");
        gbc.gridx = 1;
        gbc.gridy = 6;
        add(etiqueta5, gbc);
        gbc.gridx = 1;
        gbc.gridy = 7;
        add(seleccion, gbc);
        gbc.gridx = 3;
        gbc.gridy = 7;
        add(seleccion2, gbc);
        gbc.gridx = 1;
        gbc.gridy = 8;
        add(seleccion3, gbc);
        gbc.gridx = 3;
        gbc.gridy = 8;
        add(seleccion4, gbc);
        gbc.gridx = 2;
        gbc.gridy = 9;
        add(guardar, gbc);

;    }
}
