/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_03_02;


import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Dremi7w7
 */
public class Ventana_1 extends JFrame {
    //Creacion de panel 
    public JPanel panel_1; 
    public Ventana_1(){
        //Tamaño ventana
        setSize(500,250);
        //Cerrar ventana y programa
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Titutlo de la ventana
        setTitle("Ventana_1"); 
        //Localizacion de la ventana 
        setLocation(200,30);
        //Iniciar componente
        Componente_1();
    }
    
    private void Componente_1(){
        //Lamar metodos 
        colocarPaneles();
        colocarEtiquetas();
        colocarBotones();
        colocarListas();
        colocarTexto();
    }
    
    private void colocarPaneles(){
        panel_1=new JPanel();
        panel_1.setLayout(null);
        //agregar panel a la ventana
        this.getContentPane().add(panel_1); 
    }
    
    private void colocarEtiquetas(){
        //Creacion etiquetas
        JLabel etiqueta_1=new JLabel();
        JLabel etiqueta_2=new JLabel();
        JLabel etiqueta_3=new JLabel();
        JLabel etiqueta_4=new JLabel();
        
        //texto de las etiquetas
        etiqueta_1.setText("Seleccione una sede: *");
        etiqueta_2.setText("Tipo Documento:");
        etiqueta_3.setText("Ingrese su identificación: *"); 
        etiqueta_4.setText("INSCRÍBETE");
        
        //tamaño de las etiquetas
        etiqueta_1.setBounds(10, 50, 150, 20);
        etiqueta_2.setBounds(10, 90, 150, 20);
        etiqueta_3.setBounds(10, 130, 150, 20);
        etiqueta_4.setBounds(5, 5, 475, 30);
        
        
        //Color de la etiqueta 
        etiqueta_4.setForeground(Color.WHITE);
        etiqueta_4.setOpaque(true);
        etiqueta_4.setBackground(Color.BLUE);
        etiqueta_4.setBorder(BorderFactory.createLineBorder(Color.black));//Borde de la etiqueta 
        
        //Ubicacion del texto
        etiqueta_1.setHorizontalAlignment(SwingConstants.LEFT);
        etiqueta_2.setHorizontalAlignment(SwingConstants.LEFT);
        etiqueta_3.setHorizontalAlignment(SwingConstants.LEFT);
        etiqueta_4.setHorizontalAlignment(SwingConstants.CENTER);
        
        
        //agregar etiqueta al panel
        panel_1.add(etiqueta_1);
        panel_1.add(etiqueta_2);
        panel_1.add(etiqueta_3);
        panel_1.add(etiqueta_4);


    }
    
        private void colocarBotones(){
        JButton boton_1=new JButton(); //Creacion boton
        boton_1.setText("Ingresar"); //texto boton
        boton_1.setEnabled(true);//encendido del boton
        boton_1.setBounds(200, 175, 100, 30); //Localizacion y tamaño del boton
        panel_1.add(boton_1);//agregar boton al panel 
    }
    
    private void colocarListas(){
        //arreglo de objetos string
        String[] MATRIZ={"MATRIZ CUENCA","MATRIZ QUITO","MATRIZ GUAYAQUIL"};
        String[] IDENTIFICACION={"CÉDULA","RUC","PASAPORTE"};
        
        //Creacion listas
        JComboBox lista_1=new JComboBox(MATRIZ);
        JComboBox lista_2=new JComboBox(IDENTIFICACION);
        
        //Tamaños listas
        lista_1.setBounds(200, 50, 150, 20);
        lista_2.setBounds(200, 90, 100, 20);
        
        //Agregar listas al panel
        panel_1.add(lista_1);
        panel_1.add(lista_2);
    
    }
    
    private void colocarTexto(){
        //creacion caja de texto
        JTextField caja_1=new JTextField();
        
        //Tamaño y ubicaciond de la caja de texto
        caja_1.setBounds(200, 130, 250, 30);
        
        //Agregar caja de texto al panel
        panel_1.add(caja_1);
    
    }

}
