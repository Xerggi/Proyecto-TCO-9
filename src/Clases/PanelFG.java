
package Clases;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.JPanel;


public class PanelFG extends JPanel{
    
    ArrayList<Object> v;
    
    public PanelFG(ArrayList<Object> asd){
        
        this.v = asd;
    }
    
    public void paintComponet(Graphics g){
        Dibujar draw;
        for(int i=0;i<v.size();i++){
            draw = (Dibujar)v.get(i);
            draw.dibujar(g);
        }
        
    }
    
    
    
}
