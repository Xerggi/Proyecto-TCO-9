
package Clases;
import Ejecutar.Main;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JPanel;
import javax.swing.Timer;


public class PanelFG extends JPanel implements KeyListener{
    
    ArrayList v;
    NaveGrafico nave;
    ArrayList<BalasGrafico> balaslista = new ArrayList<>();
    Coordenadas movimientoLeft = new Coordenadas(-25,0);
    Coordenadas movimientoRight = new Coordenadas(25,0);
    Coordenadas movimientovacio = new Coordenadas(0,0);
    Coordenadas movimientoUp = new Coordenadas(0,-25);
    Coordenadas movimientoDown = new Coordenadas(0,25);

    
    EnemigoGrafico Asteroide1;
    EnemigoGrafico Asteroide2;
    EnemigoGrafico Asteroide3;
    EnemigoGrafico Asteroide4;
    EnemigoGrafico Asteroide5;
    EnemigoGrafico Asteroide6;
    

    
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
        for(BalasGrafico bala:balaslista)
            bala.dibujar(g);
    }

    @Override
    public void keyTyped(KeyEvent e) {      
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        int tecla = e.getKeyCode();
        
        if (tecla == KeyEvent.VK_LEFT) {
            this.nave.mover(movimientoLeft);
            repaint();
        } 
        if (tecla == KeyEvent.VK_RIGHT) {
            this.nave.mover(movimientoRight);
            repaint();
        }
        if (tecla == KeyEvent.VK_UP) {
            this.nave.mover(movimientoUp);
            repaint();
        }
        if (tecla == KeyEvent.VK_DOWN) {
            this.nave.mover(movimientoDown);
            repaint();
        }
         if (tecla == KeyEvent.VK_SPACE) {
             disparar();
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
    
    public void AsteroideReferencia(EnemigoGrafico a,EnemigoGrafico b,EnemigoGrafico c,EnemigoGrafico d,EnemigoGrafico e,EnemigoGrafico f){
        Asteroide1 = a;
        Asteroide2 = b;
        Asteroide3 = c;
        Asteroide4 = d;
        Asteroide5 = e;
        Asteroide6 = f;  
    }
    
    
    public void disparar(){
        Coordenadas corBala = new Coordenadas(nave.getX(),nave.getY());
        Coordenadas nuevaBala = new BalasGrafico(corBala, 5, Color.GREEN);
        balaslista.add((BalasGrafico) nuevaBala);
    }
    
    public void moverBalas(){
        for (BalasGrafico bala : balaslista) {
            bala.mover(movimientoUp);
                }
            repaint();
        }
    
    public void moverAsteroides() {
        for (Object obj : v) {
            if (obj instanceof EnemigoGrafico) {
                EnemigoGrafico asteroide = (EnemigoGrafico) obj;
                asteroide.ciclo();
                if (asteroide.getY() > this.getHeight()) {
                    int rango = Main.Aleatorio(800, 50);
                    asteroide.setY(0);
                    asteroide.setX(rango);
                }
            }
        }
    }
    
    public void iniciar() {
        Timer timer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moverBalas();
                moverAsteroides();
                repaint();

            }
        });
        timer.start();
    }
    
    }
