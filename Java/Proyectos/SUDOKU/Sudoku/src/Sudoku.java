public class Sudoku {
    
    private Cell[][] cells;//de tipo Cell
    private int size;//para crear la matriz[size][size]
     
    public Sudoku(int size) {
        cells = new Cell[size][size];
        this.size = size;
        
        // inicializa celdas
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                cells[i][j] = new Cell(i, j);
         
        // adiciona observadores
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                cells[i][j].addObserver(cells);//añade un observador tipo cells a cada celda
    }
 
    // fija valores conocidos
    public void setup(int[][] puzzle) {//recibe el sudoku
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (puzzle[i][j] != 0) {//si ya hay un número para esa celda
                    cells[i][j].setValue(puzzle[i][j]);//lo pone en la celda, quita los otros posibles valores
                }
            }
        }
    }
    
    public void setup(String puzzle) {//lee el sudoku de la forma como se lo mandamos en el archivo
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (puzzle.charAt(i * size + j) != '.') {//matriz aplanada
                    cells[i][j].setValue(puzzle.charAt(i * size + j) - '0');//lo pone en la celda
                }
            }
        }
    }
    
    public int getCellValue(int i, int j) {
        return cells[i][j].getValue();
    }
     
    public String toString(){//cómo debe imprimir
        String str = "+---+---+---+---+---+---+---+---+---+\n";
 
       for (int i = 0; i < size; i++) {
            str += "|";
            for (int j = 0; j < size; j++) {
                str += String.format(" %d |", cells[i][j].getValue());
            }
            str += "\n+---+---+---+---+---+---+---+---+---+\n";
       }
       return str;
    }    
}