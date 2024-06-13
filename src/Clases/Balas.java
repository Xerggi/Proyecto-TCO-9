/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author xergg
 */
public class Balas extends Coordenadas{
    
    private float radio;
    
    public Balas(){
        super();
        this.radio = 0;
        
    }
    
    public Balas(Coordenadas nvo,float r){
        super(nvo);
        this.radio = r;
    }
    
    public Balas(Balas bl){
        super(bl);
        this.radio=bl.radio;
    }
    
    public float GetRadio(){
        return this.radio;
    }
    
    public void SetRadio(float r){
        this.radio=r;
    }
    
    public Coordenadas getCentro(){
       Coordenadas nva = new Coordenadas(this.getX(),this.getY());
       return nva;
    }
    
}
