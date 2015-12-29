from graphics import *
import time

def makeRect(corner, width, height):  # Incorrect!
    '''Return a new Rectangle given one corner Point and the dimensions.'''
    corner2 = corner.clone()
    corner2.move(width, height)
    return Rectangle(corner, corner2)

def main():
    win = GraphWin('Draw a Rectangle (NOT!)', 500, 500)
    #win.yUp() 

    rect = makeRect(Point(20, 50), 250, 200)
    rect.draw(win)
    #win.getMouse()
    for i in range(1,10):
        time.sleep(1)
        rect.move(10*i,10*i)
    
    #win.promptClose(win.getWidth()/2, 20)
    win.getMouse()
    win.close()

main()