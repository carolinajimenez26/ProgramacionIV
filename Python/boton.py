import Tkinter

def funcion():
   print "Excelente"

root = Tkinter.Tk()
boton = Tkinter.Button(root, text="Que te parece la guia?", command=funcion)
boton.pack()
root.mainloop()