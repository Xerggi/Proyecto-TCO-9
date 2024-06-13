
package Clases;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author xergg
 */
public class EnemigoGrafico extends Enemigo implements Dibujar{
    
    Color color;
    
    public EnemigoGrafico(Coordenadas cor,float x,float y,Color uncolor){
        
        super(cor,x,y);
        this.color = uncolor;
    }
    
    
    
    
    
    @Override
    public void dibujar(Graphics dw) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
