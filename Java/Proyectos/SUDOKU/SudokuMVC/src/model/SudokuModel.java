package model;

import model.Cell;

/**
 *
 * @author utp
 */
public class SudokuModel {
    
    private static final int SIZE = 9;
    private Cell[][] cells;
     
    public SudokuModel() {
        cells = new Cell[SIZE][SIZE];
        
        // inicializa celdas
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                cells[i][j] = new Cell(i, j);
         
        // adiciona observadores
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                cells[i][j].addObserver(cells);
    }
 
    public SudokuModel(String puzzle) {
        this();
        setup(puzzle);
    }

    // fija valores conocidos
    public void setup(int[][] puzzle) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (puzzle[i][j] != 0) {
                    cells[i][j].setValue(puzzle[i][j]);
                }
            }
        }
    }
    
    public void setup(String puzzle) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (puzzle.charAt(i * SIZE + j) != '.') {
                    cells[i][j].setValue(puzzle.charAt(i * SIZE + j) - '0');
                }
            }
        }
    }
    
    // Obtener el valor de una celda
    public int getValue(int i, int j) {
        return cells[i][j].getValue();
    }
    
    // Fijar el valor en una celda
    public void setValue(int i, int j, int value) {
        cells[i][j].setValue(value);
    }

    public boolean isValid(int i, int j, int value) {
        return cells[i][j].isValid(value);
    }
    
    public String toString()
    {
        String str = "+---------+---------+---------+\n";
 
       for (int i = 0; i < SIZE; i++) {
            str += "|";
            for (int j = 0; j < SIZE; j++) {
                str += String.format(" %d ", cells[i][j].getValue());
                if ((j+1)%3 == 0) str += "|";
            }
            str += "\n";
            if ((i+1)%3 == 0) str += "+---------+---------+---------+\n";
       }
       return str;
    }    
}
