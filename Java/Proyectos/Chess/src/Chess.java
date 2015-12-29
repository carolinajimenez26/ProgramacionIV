
public class Chess {
    public static void main(String[] args) {
        //no sirve si no empieza con las blancas

        System.out.println("Welcome to play Chess\n");
        Board b = new Board();//crea un tablero
        b.initGame();//comienza el juego
        b.print();//imprime el tablero
        System.out.println("--------------------");
        System.out.println("\n");

        //b.move(0,0,2,0); //fila, columna

        //b.move(6,1,4,1); //caballo(se mueve como quiere) y peon(no se mueve si no es el primer mov los de arriba se mueven ilimitado) no sirven ni el rey(se mueve de a dos o tres hacia adelante)
            //no sirven los turnos
        /*b.move(1,0,2,0);
        b.move(2,0,3,0);
        b.move(3,0,4,0);
        b.move(4,0,5,0);
        b.can_attack();
        b.move(5,0,6,0);
        b.print();*/
    }
    
}
