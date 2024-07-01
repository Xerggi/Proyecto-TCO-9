/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author xergg
 */
public class Nave extends Coordenadas{

    public Coordenadas cor1 = new Coordenadas(); 
    public Coordenadas cor2 = new Coordenadas();
    
    public Nave(){
        super();
        
        this.cor1.setX(0);
        this.cor1.setY(0);
        
        this.cor2.setX(0);
        this.cor2.setY(0);
    }
    
    public Nave(Coordenadas a,Coordenadas b,Coordenadas c){
        
        super(a.getX(),a.getY());
        
        this.cor1.setX(b.getX());
        this.cor1.setY(b.getY());
        
        this.cor2.setX(c.getX());
        this.cor2.setY(c.getY());
    }
    
    public Nave(Nave c){
        super(c.getX(),c.getY());
        
        this.cor1.setX(c.getX());
        this.cor1.setY(c.getY());
        
        this.cor2.setX(c.getX());
        this.cor2.setY(c.getY());
    }
    
    public void SetVertice(Coordenadas nva,int lado){
        
        if (lado==1) {
            this.setX(nva.getX());
            this.setY(nva.getY());
        }
         if (lado==2) {
            this.cor1.setX(nva.getX());
            this.cor1.setY(nva.getY());
        }
         if (lado==3) {
            this.cor2.setX(nva.getX());
            this.cor2.setY(nva.getY());
        }
    }
    
    
    public void mover(Coordenadas NvaCor){
        
        SetVertice((this.suma(NvaCor)),1);
        SetVertice((this.cor1.suma(NvaCor)),2);
        SetVertice((this.cor2.suma(NvaCor)),3);
        
    }
    
    
}
