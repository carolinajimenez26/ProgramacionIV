from graphics import *
import time

def MoveRight(img):
    for i in range(1,10):
        time.sleep(1)
        img.move(-10,0)

def main():
    win = GraphWin('Moving an image', 500, 500)

    img = Image(Point((win.getHeight())/2, (win.getWidth())/2), "cat.png")
    img.draw(win)
   
    MoveRight(img)
    
    win.getMouse()
    win.close()

main()