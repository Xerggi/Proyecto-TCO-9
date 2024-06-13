/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejecutar;
import Clases.*;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        Ventana miventana = new Ventana("Juego de naves espaciales");
        ArrayList ArregloObjetos = new ArrayList();
        
        PanelFG miPanel = new PanelFG(ArregloObjetos);
        
        miventana.add(miPanel);
        miventana.setSize(500,400);
        miventana.setVisible(true);
        miventana.setLocationRelativeTo(null);
        
        
    }
}
