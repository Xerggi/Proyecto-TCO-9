/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author xergg
 */
public class BalasGrafico extends Balas implements Dibujar{
    
    Color color;
    
    public BalasGrafico(Coordenadas cor,float radio,Color uncolor){
        super(cor,radio);
        this.color = uncolor;
        
    }

    @Override
    public void dibujar(Graphics dw) {
       dw.setColor(color);
       dw.fillOval((int)(this.getX()-this.GetRadio()), (int)(this.getY()-this.GetRadio()), (int)(2*this.GetRadio()), (int)(2*this.GetRadio()));
    }
    
    public void mover(Coordenadas movimiento){
        this.setX(this.getX() + movimiento.getX());
        this.setY(this.getY() + movimiento.getY());
    }
}
