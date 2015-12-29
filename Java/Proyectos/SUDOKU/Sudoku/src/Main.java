
import java.util.Iterator;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SudokuParser parser = new SudokuParser("sudoku1.txt");//lee el archivo
        
        for (String str : parser.getStringsList()) {//cada sudoku
            Sudoku s = new Sudoku(parser.getSize());//construye el sudoku
            s.setup(str);//lee el sudoku como string, actualiza celdas, y en general, lo resuelve
            System.out.print(s);//imprime el sudoku resuelto
        }

    }
}

/*int[][] puzzle = {
            {1,0,0,  0,0,7,  0,9,0},
            {0,3,0,  0,2,0,  0,0,8},
            {0,0,9,  6,0,0,  5,0,0},
 
            {0,0,5,  3,0,0,  9,0,0},
            {0,1,0,  0,8,0,  0,0,2},
            {6,0,0,  0,0,4,  0,0,0},
             
            {3,0,0,  0,0,0,  0,1,0},
            {0,4,0,  0,0,0,  0,0,7},
            {0,0,7,  0,0,0,  3,0,0}
        };*/