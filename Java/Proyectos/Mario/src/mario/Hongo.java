package mario;

import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Hongo extends Thread{
    private int x,y ;
    private JPanel MiJP;
    private Graphics g;
    private Mario miMario;
    private ImageIcon hongo; 
    
    public Hongo(JPanel MiJP, int x, int y, Mario miMario){
        super();
        this.MiJP = MiJP;
        this.x = x;
        this.y = y;
        g = MiJP.getGraphics();
        this.miMario = miMario;
        hongo = new ImageIcon("build/classes/hongo.png");//carga la imagen del hongo
    }
   
    
    public void run(){//la funcion que se ejecuta cuando el hilo se comienza a ejecutar
        
        while(true){//se mueve infinitamente
            for(int i = 0; i <= MiJP.getWidth()-20; i+=10){ //se mueve entre el ancho del panel
                try {
                    x = i;
                    miMario.DibujarMArio(g, miMario.CoordX(), miMario.CoordY(), miMario.Direccion());//también va dibujando el Mario
                    g.drawImage(hongo.getImage(), x, y, MiJP);//solo se mueve en x, va dibujando el hongo en el panel
                    Hongo.sleep(50);//se vea el movimiento
                    MiJP.update(g);//para que no queden rastros de la imagen
                }
                
                catch (InterruptedException ex) {
                    Logger.getLogger(Hongo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            for(int i = MiJP.getWidth()-20; i >= 0; i-=10){//aquí el muñeco obligatoriamente se encuentra en la esquina derecha, hacemos que se devuelva
                
                try {
                    x = i;
                    miMario.DibujarMArio(g, miMario.CoordX(), miMario.CoordY(), miMario.Direccion());//también va dibujando el Mario
                    g.drawImage(hongo.getImage(), x, y, MiJP);//solo se mueve en x, va dibujando el hongo en el panel
                    Hongo.sleep(50);//se vea el movimiento
                    MiJP.update(g);//para que no queden rastros de la imagen
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hongo.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }        
    }
}
