from graphics import *
import time

def main():
    win = GraphWin('Moving an image', 500, 500)
    
    #Cargamos las imagenes de los numeros
    uno    = Image(Point(100, 100), "1.png")
    
    dos    = Image(Point((uno.getAnchor().getX()) + 1 + (uno.getWidth()), uno.getAnchor().getY()), "2.png")
    
    tres   = Image(Point((dos.getAnchor().getX()) + 1 + (dos.getWidth()), dos.getAnchor().getY()), "3.png")
                   
    cuatro = Image(Point(uno.getAnchor().getX(), (uno.getAnchor().getY()) + 1 + (uno.getHeight())), "4.png")
    
    cinco  = Image(Point((cuatro.getAnchor().getX()) + 1 + (cuatro.getWidth()), cuatro.getAnchor().getY()),  "5.png")
                   
    seis   = Image(Point((cinco.getAnchor().getX()) + 1 + (cinco.getWidth()), cinco.getAnchor().getY()),  "6.png")
                   
    siete  = Image(Point(cuatro.getAnchor().getX(), (cuatro.getAnchor().getY()) + 1 + (cuatro.getHeight())), "7.png")
                   
    ocho   = Image(Point((siete.getAnchor().getX()) + 1 + (siete.getWidth()), siete.getAnchor().getY()), "8.png")
                   
    nueve  = Image(Point((ocho.getAnchor().getX()) + 1 + (ocho.getWidth()), ocho.getAnchor().getY()), "9.png")
    
    #cero   = Image(Point((nueve.getAnchor().getX()) + 1 + + (nueve.getWidth()), nueve.getAnchor().getY()), "0.png")
    
    #Dibujamos las imagenes en la ventana
    uno.draw(win)
    dos.draw(win)
    tres.draw(win)
    cuatro.draw(win)
    cinco.draw(win)
    seis.draw(win)
    siete.draw(win)
    ocho.draw(win)
    nueve.draw(win)
    #cero.draw(win)
    
    mouse = getMouse().getX()
    
    print mouse
    
    #coordImage = Point((img.getAnchor().getX()),(img.getAnchor().getY()))
    """for i in range(1,10):
        time.sleep(1)
        img.move(10,0)
    """
    win.getMouse()
    win.close()

main()