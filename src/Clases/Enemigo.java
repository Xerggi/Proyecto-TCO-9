/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author xergg
 */
public class Enemigo extends Coordenadas{
    
    private float lado1;
    private float lado2;
    
    public Enemigo() {
        super();
        this.lado1 = 0;
        this.lado2 = 0;
    }
    
    public Enemigo(Coordenadas cor,float x, float y) {
        super(cor);
        this.lado1 = x;
        this.lado2 = y;
    }
    
    public Enemigo (Enemigo nvo){
        super(nvo.getX(),nvo.getY());
        this.lado1 = nvo.lado1;
        this.lado2 = nvo.lado2;
    }
    
    public float Getlado(int lado){
        if (lado==1){
            return this.lado1;
        }
        if (lado==2) {
            return this.lado2;
        }
        if (lado != 1 && lado != 2) {
            return 0;
        }
        return 0;
    }
    
    
}
