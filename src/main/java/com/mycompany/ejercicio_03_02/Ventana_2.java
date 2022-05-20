/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_03_02;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Dremi7w7
 */
public class Ventana_2 extends JFrame {
    //Creacion de panel 
    public JPanel panel_2; 
    public Ventana_2(){
        //Tamaño ventana
        setSize(600,500);
        //Cerrar ventana y programa
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Titutlo de la ventana
        setTitle("Ventana_2"); 
        //Localizacion de la ventana 
        setLocation(300,30);
        //Iniciar componente
        Componente_2();
    }
    
    private void Componente_2(){
        //Lamar metodos 
        colocarPaneles_2();
        colocarEtiquetas_2();
        colocarTexto_2();
    }
    
    private void colocarPaneles_2(){
        panel_2=new JPanel();
        panel_2.setLayout(null);
        panel_2.setBorder(new EmptyBorder(5, 5, 5, 5));
        panel_2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        //agregar panel a la ventana
        this.getContentPane().add(panel_2); 
    }
    
    private void colocarEtiquetas_2(){
        //Creacion etiquetas
        JLabel etiqueta_1=new JLabel();
        JLabel etiqueta_2=new JLabel();
        JLabel etiqueta_3=new JLabel();
        JLabel etiqueta_4=new JLabel();
        JLabel etiqueta_5=new JLabel();
        JLabel etiqueta_6=new JLabel();
        JLabel etiqueta_7=new JLabel();
        JLabel etiqueta_8=new JLabel();
        JLabel etiqueta_9=new JLabel();
        JLabel etiqueta_10=new JLabel();
        JLabel etiqueta_11=new JLabel();
        JLabel etiqueta_12=new JLabel();
        JLabel etiqueta_13=new JLabel();
        JLabel etiqueta_14=new JLabel();
        JLabel etiqueta_15=new JLabel();
        JLabel etiqueta_16=new JLabel();
        JLabel etiqueta_17=new JLabel();
        JLabel etiqueta_18=new JLabel();
        JLabel etiqueta_19=new JLabel();
        
        
        
        //texto de las etiquetas
        etiqueta_1.setText("Apellidos:");
        etiqueta_2.setText("Nombres:");
        etiqueta_3.setText("Nacionalidad:"); 
        etiqueta_4.setText("Género:");
        etiqueta_5.setText("Correo electrónico personal:");
        etiqueta_6.setText("Fecha Nacimiento:");
        etiqueta_7.setText("Teléfono Domicilio");
        etiqueta_8.setText("Teléfono Celular");
        etiqueta_9.setText("Whatsapp:");
        etiqueta_10.setText("ORTIZ TERREROS");
        etiqueta_11.setText("JOSUE BENIGNO");
        etiqueta_12.setText("ECUATORIANA");
        etiqueta_13.setText("Masculino");
        etiqueta_14.setText("mortizo@yahoo.com");
        etiqueta_15.setText("01-09-1940");
        etiqueta_16.setText("072818314");
        etiqueta_17.setText("0984357604");
        etiqueta_18.setText("PERSONAL");
        etiqueta_19.setText("DATOS PERSONALES");
        
        //tamaño de las etiquetas
        etiqueta_1.setBounds(30, 90, 150, 20);
        etiqueta_2.setBounds(30, 130, 150, 20);
        etiqueta_3.setBounds(30, 170, 150, 20);
        etiqueta_4.setBounds(30, 210, 150, 20);
        etiqueta_5.setBounds(30, 250, 200, 20);
        etiqueta_6.setBounds(30, 290, 150, 20);
        etiqueta_7.setBounds(30, 330, 150, 20);
        etiqueta_8.setBounds(30, 370, 150, 20);
        etiqueta_9.setBounds(30, 410, 150, 20);
        etiqueta_10.setBounds(280, 90, 150, 20);
        etiqueta_11.setBounds(280, 130, 150, 20);
        etiqueta_12.setBounds(280, 170, 150, 20);
        etiqueta_13.setBounds(280, 210, 150, 20);
        etiqueta_14.setBounds(280, 250, 150, 20);
        etiqueta_15.setBounds(280, 290, 150, 20);
        etiqueta_16.setBounds(280, 330, 150, 20);
        etiqueta_17.setBounds(280, 370, 150, 20);
        etiqueta_18.setBounds(10, 50, 100, 30);
        etiqueta_19.setBounds(5, 5, 575, 30);
        
        //Color de la etiqueta 
        etiqueta_18.setForeground(Color.WHITE);
        etiqueta_18.setOpaque(true);
        etiqueta_18.setBackground(Color.BLUE);
        etiqueta_18.setBorder(BorderFactory.createLineBorder(Color.black));//Borde de la etiqueta 
        
        etiqueta_19.setForeground(Color.WHITE);
        etiqueta_19.setOpaque(true);
        etiqueta_19.setBackground(Color.BLUE);
        etiqueta_19.setBorder(BorderFactory.createLineBorder(Color.black));//Borde de la etiqueta 
        
        //Ubicacion del texto
        etiqueta_1.setHorizontalAlignment(SwingConstants.LEFT);
        etiqueta_2.setHorizontalAlignment(SwingConstants.LEFT);
        etiqueta_3.setHorizontalAlignment(SwingConstants.LEFT);
        etiqueta_4.setHorizontalAlignment(SwingConstants.LEFT);
        etiqueta_5.setHorizontalAlignment(SwingConstants.LEFT);
        etiqueta_6.setHorizontalAlignment(SwingConstants.LEFT);
        etiqueta_7.setHorizontalAlignment(SwingConstants.LEFT);
        etiqueta_8.setHorizontalAlignment(SwingConstants.LEFT);
        etiqueta_9.setHorizontalAlignment(SwingConstants.LEFT);
        etiqueta_10.setHorizontalAlignment(SwingConstants.LEFT);
        etiqueta_11.setHorizontalAlignment(SwingConstants.LEFT);
        etiqueta_12.setHorizontalAlignment(SwingConstants.LEFT);
        etiqueta_13.setHorizontalAlignment(SwingConstants.LEFT);
        etiqueta_14.setHorizontalAlignment(SwingConstants.LEFT);
        etiqueta_15.setHorizontalAlignment(SwingConstants.LEFT);
        etiqueta_16.setHorizontalAlignment(SwingConstants.LEFT);
        etiqueta_17.setHorizontalAlignment(SwingConstants.LEFT);
        etiqueta_18.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta_19.setHorizontalAlignment(SwingConstants.CENTER);
        
        //agregar etiqueta al panel
        panel_2.add(etiqueta_1);
        panel_2.add(etiqueta_2);
        panel_2.add(etiqueta_3);
        panel_2.add(etiqueta_4);
        panel_2.add(etiqueta_5);
        panel_2.add(etiqueta_6);
        panel_2.add(etiqueta_7);
        panel_2.add(etiqueta_8);
        panel_2.add(etiqueta_9);
        panel_2.add(etiqueta_10);
        panel_2.add(etiqueta_11);
        panel_2.add(etiqueta_12);
        panel_2.add(etiqueta_13);
        panel_2.add(etiqueta_14);
        panel_2.add(etiqueta_15);
        panel_2.add(etiqueta_16);
        panel_2.add(etiqueta_17);
        panel_2.add(etiqueta_18);
        panel_2.add(etiqueta_19);
    }
    
        private void colocarTexto_2(){
        //creacion caja de texto
        JTextField caja_1=new JTextField();
        
        //Tamaño y ubicaciond de la caja de texto
        caja_1.setBounds(250, 410, 200, 30);
        
        //Agregar caja de texto al panel
        panel_2.add(caja_1);
    
    }
    
    
    
    
    
    
    
    
    
}
