
package Clases;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;


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
        dw.setColor(color);
        dw.fillRect((int)this.getX(),(int) this.getY(),(int) this.Getlado(1),(int) this.Getlado(2));
    }
    
    public void mover(Coordenadas movimiento) {
        this.setX(this.getX() + movimiento.getX());
        this.setY(this.getY() + movimiento.getY());
    }

    public void ciclo() {
        Coordenadas movimientoAsteroide = new Coordenadas(0, 5);
        this.mover(movimientoAsteroide);
    }
    
    //public void ciclo(){
      //  float x = this.getY();
        //this.setY( x += 20);
    //}
    
}
