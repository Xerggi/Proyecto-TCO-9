
package Clases;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.JPanel;


public class PanelFG extends JPanel{
    
    ArrayList v;
    
    public PanelFG(ArrayList asd){
        
        this.v = asd;
    }
    
    public void paint(Graphics g){
        Dibujar draw;
        for(int i=0;i<v.size();i++){
            draw = (Dibujar)v.get(i);
            draw.dibujar(g);
        }
        
    }
    
    
    
}
