
package mario;

import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;


public class Salto extends Thread{
    private int x,y;
    Mario miMario;
    JPanel MiJP;
    Graphics g;
    String direccion;
    
    public Salto(JPanel MiJP, int x, int y, Mario miMario){
        super();
        this.MiJP = MiJP;
        this.miMario = miMario;
        this.x = x;
        this.y = y;
        this.g = MiJP.getGraphics();
        direccion = miMario.Direccion();
    }
    
    public void run(){
        int z = y;
            for(int i = 0; i <= 8; i++){
                try {
                    Salto.sleep(50);
                    y = z+3*i*i-24*i;
                    MiJP.update(g);
                    miMario.DibujarMArio(g, x, y, direccion);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Salto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        
    }
    
}
