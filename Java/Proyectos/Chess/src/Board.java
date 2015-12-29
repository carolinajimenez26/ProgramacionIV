
import java.util.Vector;


public class Board {
    
    private int turnw = 1, turnb = 0;//turno de los blancos y de los negros, los blancos siempre empiezan
    private Ficha[][] board_;//El tablero contiene fichas
    
    public Board(){ //Llena el tablero de fichas invisibles
        Ficha ficha = new Ficha();
	for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                board_[i][j] = ficha;//pone la ficha en el tablero
            }
        }
    }
    
    public boolean Dimension(int i, int j){//true si no se sale de las dimensiones del tablero
        return ((i>=0)&&(i<8))&&((j>=0)&&(j<8));
    }
    
    public void place(int i, int j, Ficha p){ //pone una ficha en dicha posición
        if(Dimension(i,j)){ //Si no se sale del tablero
            board_[i][j] = p;//ponemos la ficha en esa posición
            if(board_[i][j].getColor() == 'w') turnw++; //incrementamos el turno //la ficha ahora está en esa posición
            else turnb++;			
        }
    }
    
    public void initGame(){ //incia el juego, crea todas las fichas y las pone en el tablero
			
        Ficha qw = new Ficha('w','q'); //creamos a la reina blanca
	place(0,3,qw);//ponemos a la reina en su posicion inicial
	Ficha qb = new Ficha('b','q'); //creamos a la reina negra
	place(7,4,qb);//ponemos a la reina en su posicion inicial
			
	Ficha kw = new Ficha('w','k'); //rey blanco
	place(0,4,kw);
	Ficha kb = new Ficha('b','k'); //rey negro
	place(7,3,kb);
			
	//Torres
	for(int i = 0; i < 8; i = i + 7){
            Ficha tw = new Ficha('w','t');//torre blanca
            Ficha tb = new Ficha('b','t');//torre negra
            place(0,i,tw);
            place(7,i,tb);		
        }
			
	//Peones
	for(int i = 0; i < 8; i++){	
            Ficha pw = new Ficha('w','p'); //peon blanco
            Ficha pb = new Ficha('b','p'); //peon negro
            place(1,i,pw);
            place(6,i,pb);
	}
			
        //Caballos
	for(int i = 1; i < 7; i = i + 5){	
            Ficha cw = new Ficha('w','c');
            Ficha cb = new Ficha('b','c');
            place(0,i,cw);
            place(7,i,cb);
	}
			
	//Alfiles
	for(int i = 2; i < 6; i = i + 3){
            Ficha aw = new Ficha('w','a');
            Ficha ab = new Ficha('b','a');
            place(0,i,aw);
            place(7,i,ab);				
	}
    }
    
    void print(){ //para imprimir el tablero		
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){					
		board_[i][j].print(); //imprimimos ficha en esa posición	
            }
	System.out.println();
        }		
    }
    
    public int abs(int n){//valor absoluto	
	if(n < 0) n = n * -1;
	return n;
    }
    
}
