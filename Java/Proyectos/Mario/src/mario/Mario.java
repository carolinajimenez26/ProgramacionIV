
package mario;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Mario {
    private int x;
    private int y;
    JPanel MiJP;
    String direccion;
    
    public Mario(JPanel MiJP){
        x = 0;
        y = 0;
        this.MiJP = MiJP;
    }
    
    public void DibujarMArio(Graphics g, int x, int y, String direccion){
        this.x = x;
        this.y = y;
        MiJP.update(g);
        this.direccion = direccion;
        ImageIcon MiImagen = new ImageIcon(direccion);//lee la imagen
        g.drawImage(MiImagen.getImage(), x, y, MiJP);//ubica la imagen dentro del lienzo
    }
    
    public int CoordX(){
        return x;
    }
    
    public int CoordY(){
        return y;
    }
    
    public String Direccion(){
        return direccion;
    }
    
    public void GuardaDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public void GuardaCoordX(int x){
        this.x = x;
    }
    
    public void GuardaCoordY(int y){
        this.y = y;
    }
    
}
