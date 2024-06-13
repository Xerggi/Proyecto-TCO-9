
package Clases;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.JPanel;


public class PanelFG extends JPanel{
    
    ArrayList<Object> v;
    
    public PanelFG(ArrayList<Object> asd){
        
        this.v = asd;
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(Object obj:v){
            if(obj instanceof Dibujar){
                ((Dibujar)obj).dibujar(g);
            }
        }
        
    }
    
    
    
}
