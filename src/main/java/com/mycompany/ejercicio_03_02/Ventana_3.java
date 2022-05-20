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
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


/**
 *
 * @author Dremi7w7
 */
public class Ventana_3 extends JFrame {
        //Creacion de panel 
    public JPanel panel_3; 
    public Ventana_3(){
        //Tamaño ventana
        setSize(500,500);
        //Cerrar ventana y programa
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Titutlo de la ventana
        setTitle("Ventana_3"); 
        //Localizacion de la ventana 
        setLocation(400,30);
        //Iniciar componente
        Componente_3();
    }
    private void Componente_3(){
        //Lamar metodos 
        colocarPaneles_3();
        colocarEtiquetas_3();
        colocarListas_3();
        colocarBotones_3();
    }
    
        private void colocarPaneles_3(){
        panel_3=new JPanel();
        panel_3.setLayout(null);

        //agregar panel a la ventana
        this.getContentPane().add(panel_3); 
    }
    
    private void colocarEtiquetas_3(){
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
        
        
        
        //texto de las etiquetas
        etiqueta_1.setText("Periodo Académico:");
        etiqueta_2.setText("Carrera: *");
        etiqueta_3.setText("Modalidad: *"); 
        etiqueta_4.setText("Sede: *");
        etiqueta_5.setText("Campus: *");
        etiqueta_6.setText("Jornada: *");
        etiqueta_7.setText("Fecha de Registro:");
        etiqueta_8.setText("2022-2022");
        etiqueta_9.setText("29/04/2022:");
        etiqueta_10.setText("DATOS PERSONALES");
        
        //tamaño de las etiquetas
        etiqueta_1.setBounds(10, 50, 150, 20);
        etiqueta_2.setBounds(10, 90, 150, 20);
        etiqueta_3.setBounds(10, 130, 150, 20);
        etiqueta_4.setBounds(10, 170, 150, 20);
        etiqueta_5.setBounds(10, 210, 200, 20);
        etiqueta_6.setBounds(10, 250, 150, 20);
        etiqueta_7.setBounds(10, 290, 150, 20);
        etiqueta_8.setBounds(200, 50, 150, 20);
        etiqueta_9.setBounds(200, 290, 150, 20);
        etiqueta_10.setBounds(5, 5, 475, 30);
        
        //Color de la etiqueta 
        etiqueta_10.setForeground(Color.WHITE);
        etiqueta_10.setOpaque(true);
        etiqueta_10.setBackground(Color.BLUE);
        etiqueta_10.setBorder(BorderFactory.createLineBorder(Color.black));//Borde de la etiqueta 
        
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
        etiqueta_10.setHorizontalAlignment(SwingConstants.CENTER);
        
        //agregar etiqueta al panel
        panel_3.add(etiqueta_1);
        panel_3.add(etiqueta_2);
        panel_3.add(etiqueta_3);
        panel_3.add(etiqueta_4);
        panel_3.add(etiqueta_5);
        panel_3.add(etiqueta_6);
        panel_3.add(etiqueta_7);
        panel_3.add(etiqueta_8);
        panel_3.add(etiqueta_9);
        panel_3.add(etiqueta_10);

    }
    
    
        private void colocarListas_3(){
        //arreglo de objetos string
        String[] CARRERA={"ARQUITECTURA","ELECTRICIDAD","ELECTRONICA","CIVIL","COMPUTACION","PSICOLOGIA"};
        String[] MODALIDAD={"PRESENCIAL","VIRTUAL"};
        String[] SEDE={"MATRIZ CUENCA","MATRIZ QUITO","MATRIZ GUAYAQUIL"};
        String[] CAMPUS={"EL VECINO","SUR","CENTENARIO"};
        String[] JORNADA={"SELECCIONE UNA OPCION","DIURNA","VESERTINA","NOCTURNA"};    
        
        //Creacion listas
        JComboBox lista_1=new JComboBox(CARRERA);
        JComboBox lista_2=new JComboBox(MODALIDAD);
        JComboBox lista_3=new JComboBox(SEDE);
        JComboBox lista_4=new JComboBox(CAMPUS);
        JComboBox lista_5=new JComboBox(JORNADA);
        
        //Tamaños listas
        lista_1.setBounds(200, 90, 250, 20);
        lista_2.setBounds(200, 130, 130, 20);
        lista_3.setBounds(200, 170, 130, 20);
        lista_4.setBounds(200, 210, 130, 20);
        lista_5.setBounds(200, 250, 150, 20);
        
        //Agregar listas al panel
        panel_3.add(lista_1);
        panel_3.add(lista_2);
        panel_3.add(lista_3);
        panel_3.add(lista_4);
        panel_3.add(lista_5);
    
    }
        
    private void colocarBotones_3(){
        JButton boton_1=new JButton(); //Creacion boton
        boton_1.setText("Siguiente"); //texto boton
        boton_1.setEnabled(true);//encendido del boton
        boton_1.setBounds(300, 350, 100, 40); //Localizacion y tamaño del boton
        boton_1.setForeground(Color.WHITE);//color letra del boton
        boton_1.setBackground(Color.BLUE);//color boton
        panel_3.add(boton_1);//agregar boton al panel 
        
    }
    
    
    
    
    
}
