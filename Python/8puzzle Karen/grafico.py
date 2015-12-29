'''
Created on 14/12/2015

@author: karen
'''
from graphics import *
from board import Board

class grafico(object):
    
    
    def grafica(self,Board):
        
        win = GraphWin("8PUZLE", 200, 300)
        win.setBackground("black")
        largo = 45
        alto = 45
        i=0
        j=0
        k=0
        t=0
        
        while(i<4):
             while(k<4):
                 c= Rectangle(Point(5+j,5+t),Point((i+1)*largo,(k+1)*alto))
                 c.setFill("white")
                 c.draw(win)
                 t=t+45
                 k=k+1                
             i=i+1    
             j=j+45
             t=0
             k=0
        
        i=0
        j=0
        k=0
        t=0        
        
        while(i<4):
             while(k<4):
                 h=Board.tileAt( k, i)
                 if(h !=0):
                     texto=Text(Point(25+j,25+t), str(Board.tileAt( k, i)))
                     texto.setSize(15)
                     texto.draw(win)
                 t=t+45
                 k=k+1                
             i=i+1    
             j=j+45
             t=0
             k=0
        
        
        
        tex=Text(Point(100,220), "HAGA CLICK")
        tex.setSize(14)
        tex.setTextColor("white")     
        
        tex.draw(win)   
         
        win.getMouse()#win.getMouse() # pause for click in window
        win.close()
        return 0
        
    def termino(self):
         win = GraphWin("8PUZLE", 200, 300)
         win.setBackground("black")
         tex=Text(Point(100,150), "ESO ES TODO =)")
         tex.setSize(13)
         tex.setTextColor("white") 
         tex.draw(win)    
         win.getMouse()#win.getMouse() # pause for click in window
         win.close()
    
if __name__ == '__main__':
         
    print("ok")
   
        
    
    
