/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

/**
 *
 * @author xergg
 */
public class NaveGrafico extends Nave implements Dibujar{
    
    Color color;
    
    public NaveGrafico(Coordenadas a,Coordenadas b,Coordenadas c,Color uncolor){
        super(a, b, c);
        this.color = uncolor;
    }
    
    @Override
    public void dibujar(Graphics dw) {
       
        dw.setColor(color);
        int x[] = {(int)this.getX(),(int)this.cor1.getX(),(int)this.cor2.getX()};
        int y[] = {(int)this.getY(),(int)this.cor1.getY(),(int)this.cor2.getY()};
        
        Polygon p = new Polygon(x, y, 3);
        dw.fillPolygon(p);
        
        
    }
    
    public void pintar(Graphics dw,Color uncolor) {
       
        dw.setColor(uncolor);
        int x[] = {(int)this.getX(),(int)this.cor1.getX(),(int)this.cor2.getX()};
        int y[] = {(int)this.getY(),(int)this.cor1.getY(),(int)this.cor2.getY()};
        
        Polygon p = new Polygon(x, y, 3);
        dw.fillPolygon(p);
    
    }
    
}
