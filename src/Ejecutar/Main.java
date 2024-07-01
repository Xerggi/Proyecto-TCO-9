/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejecutar;
import Clases.*;
import java.awt.Color;
import java.util.ArrayList;


public class Main {
    
    public static int Aleatorio(int Max,int Min){
        return (int)(Math.random()*(Max-Min));
    }
    
    public static void main(String[] args) {
        
        
        Ventana miventana = new Ventana("Juego de naves espaciales");
        ArrayList ArregloObjetos = new ArrayList();
        
        int panelancho = 700;
        int panelaltura=  545;
        
        int naveBasex = panelancho/2;
        int naveBasey = panelaltura-50;
        int navelado = 80;
        
        
        Coordenadas cor1 = new Coordenadas(250,250);
        Coordenadas cor2 = new Coordenadas(350,350);
        
       //parte modificada para que la nave este en el centro
        Coordenadas cor3 = new Coordenadas(naveBasex, naveBasey);
        Coordenadas cor4 = new Coordenadas(naveBasex - navelado / 2, naveBasey + navelado);
        Coordenadas cor5 = new Coordenadas(naveBasex + navelado / 2, naveBasey + navelado);
       
        
        
        //esta parte es la original        
        //Coordenadas cor3 = new Coordenadas(475,500);
        //Coordenadas cor4 = new Coordenadas(425,575);
        //Coordenadas cor5 = new Coordenadas(525,575);
        
        NaveGrafico nave = new NaveGrafico(cor3, cor4, cor5, Color.red);
        EnemigoGrafico enemy = new EnemigoGrafico(cor1, 60, 40, Color.orange);
        BalasGrafico balas = new BalasGrafico(cor2, 30, Color.green);
        
        
        //ArregloObjetos.add(enemy);
        //ArregloObjetos.add(balas);
        
        int rango = Aleatorio(800, 50);
        Coordenadas salida = new Coordenadas(rango,0);
        EnemigoGrafico Asteroide1 = new EnemigoGrafico(salida, 60, 45, Color.ORANGE);
        int rango2 = Aleatorio(800, 50);
        Coordenadas salida2 = new Coordenadas(rango2,0);
        EnemigoGrafico Asteroide2 = new EnemigoGrafico(salida2, 60, 45, Color.orange);
        int rango3 = Aleatorio(800, 50);
        Coordenadas salida3 = new Coordenadas(rango3,0);
        EnemigoGrafico Asteroide3 = new EnemigoGrafico(salida3, 60, 45, Color.orange);
        int rango4 = Aleatorio(800, 50);
        Coordenadas salida4 = new Coordenadas(rango4,0);
        EnemigoGrafico Asteroide4 = new EnemigoGrafico(salida4, 60, 45, Color.orange);
        int rango5 = Aleatorio(800, 50);
        Coordenadas salida5 = new Coordenadas(rango5,0);
        EnemigoGrafico Asteroide5 = new EnemigoGrafico(salida5, 60, 45, Color.orange);
        int rango6 = Aleatorio(800, 50);
        Coordenadas salida6 = new Coordenadas(rango6,0);
        EnemigoGrafico Asteroide6 = new EnemigoGrafico(salida6, 60, 45, Color.orange);
        ArregloObjetos.add(Asteroide1);
        ArregloObjetos.add(Asteroide2);
        ArregloObjetos.add(Asteroide3);
        ArregloObjetos.add(Asteroide4);
        ArregloObjetos.add(Asteroide5);
        ArregloObjetos.add(Asteroide6);
        
        
        
        
        
        
        ArregloObjetos.add(nave);
        
        PanelFG miPanel = new PanelFG(ArregloObjetos);
        
        miPanel.Navereferencia(nave);
        miPanel.AsteroideReferencia(Asteroide1, Asteroide2, Asteroide3, Asteroide4, Asteroide5, Asteroide6);
        
        miventana.add(miPanel);
        miventana.setSize(800,600);
        miventana.setVisible(true);
        miventana.setLocationRelativeTo(null);
        
        miPanel.iniciar();
    }
}
