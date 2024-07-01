
package Clases;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JPanel;


public class PanelFG extends JPanel implements KeyListener{
    
    ArrayList v;
    NaveGrafico nave;
    Coordenadas movimientoLeft = new Coordenadas(-25,0);
    Coordenadas movimientoRight = new Coordenadas(25,0);
    Coordenadas movimientovacio = new Coordenadas(0,0);
    
    public PanelFG(ArrayList vectordeO){
        this.v=vectordeO;
        this.addKeyListener(this);
        setFocusable(true);

    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(Object obj:v){
            if(obj instanceof Dibujar){
                ((Dibujar)obj).dibujar(g);
            }
        }
        
    }

    @Override
    public void keyTyped(KeyEvent e) {      
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        int tecla = e.getKeyCode();
        
        if (tecla == KeyEvent.VK_LEFT) {
            this.nave.pintar(this.getGraphics(), Color.WHITE);
            this.nave.mover(movimientoLeft);
            this.nave.pintar(this.getGraphics(), Color.red);

        } 
        if (tecla == KeyEvent.VK_RIGHT) {
            this.nave.pintar(this.getGraphics(), Color.WHITE);
            this.nave.mover(movimientoRight);
            this.nave.pintar(this.getGraphics(), Color.red);
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {  
        int tecla = e.getKeyCode();
        
        if (tecla == KeyEvent.VK_LEFT) {
            this.nave.mover(movimientovacio);
        } 
        if (tecla == KeyEvent.VK_RIGHT) {
            this.nave.mover(movimientovacio);
        }
        
    }
    
    public void Navereferencia(NaveGrafico n){
        this.nave=n;
    }
    
    
}
