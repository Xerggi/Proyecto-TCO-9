/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejecutar;
import Clases.*;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        Ventana miventana = new Ventana("Juego de naves espaciales");
        ArrayList ArregloObjetos = new ArrayList();
        Coordenadas cor1 = new Coordenadas(250,250);
        Coordenadas cor2 = new Coordenadas(350,350);
        EnemigoGrafico enemy = new EnemigoGrafico(cor1, 60, 40, Color.orange);
        BalasGrafico balas = new BalasGrafico(cor2, 30, Color.green);
        
        ArregloObjetos.add(enemy);
        ArregloObjetos.add(balas);
        PanelFG miPanel = new PanelFG(ArregloObjetos);
        
        miventana.add(miPanel);
        miventana.setSize(800,600);
        miventana.setVisible(true);
        miventana.setLocationRelativeTo(null);
        
        
    }
}
