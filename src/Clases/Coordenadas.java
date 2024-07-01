/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author xergg
 */
public class Coordenadas {
    
    private float x;
    private float y;
    
    public Coordenadas(){
        this.x=0;
        this.y=0;
    }

    public Coordenadas(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    public Coordenadas(Coordenadas nva){
        this.x=nva.x;
        this.y=nva.y;
    }
    
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    
    public Coordenadas suma(Coordenadas S){
        
        float sumx = this.x + S.getX();
        float sumy = this.y + S.getY();
        
        Coordenadas cor = new Coordenadas(sumx,sumy);
        
        return cor;
        
    }
}
