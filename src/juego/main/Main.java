/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego.main;

import javax.swing.JFrame;

public class Main extends JFrame{
    
    public Main(){
        init();
    }
    
    private void init(){
        setTitle("Automatas en el espacio");
        setSize(1366,768);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public static void main(String[] args) {
        
        Main principal = new Main();
        principal.setVisible(true);
    }
    
}

