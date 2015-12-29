
public class Queen {
    private Ficha q = new Ficha();//todos son de este tipo
    private char color;
    private Board board_ = new Board();
    
    public Queen(){
         q.setType('q');
    }
    public char getColor(){ 
        return this.color;
    }
    
    public boolean move(int x, int y){//la reina se quiere mover en esta posición
        Queen q = new Queen();
        if(q.getColor() == board_[x][y]){//si hay alguien del mismo color, no se lo puede comer
            return false;
        }
        return true;
    }
}
