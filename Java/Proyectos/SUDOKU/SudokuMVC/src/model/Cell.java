package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author utp
 */
public class Cell extends Observable implements Observer {

    private List<Integer> values = new ArrayList<Integer>();
    private boolean isSolved = false;
    private int row;
    private int col;

    // Constructor
    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        for (int n = 1; n <= 9; n++) {
            values.add(n);
        }
    }

    // una celda es solved si solo tiene un valor
    public int getValue() {
        return isSolved ? values.get(0) : 0;
    }

    // adiciona valores conocidos despues de limpiar y notificar
    public void setValue(int value) {
        values.clear();
        values.add(value);
        isSolved = true;

        super.setChanged();
        super.notifyObservers(value);
    }

    // Revisar si es admisible un dato
    public boolean isValid(int value) {
        if (isSolved) return false;
        
        for (int v : values) {
            if (v == value) return true;
        }
        return false;
    }
    
    // adiciona celdas que estan en la misma linea, cuadro como observadores
    public synchronized void addObserver(Cell[][] cells) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                boolean isSame = (i == row) && (j == col);
                boolean isSameLine = (i == row) || (j == col);
                boolean isSecondary = (i / 3 == row / 3) && (j / 3 == col / 3);
                if (!isSame && (isSameLine || isSecondary)) {
                    super.addObserver(cells[i][j]);
                }
            }
        }
    }

    // Observa y remueve el conjunto de entrada en el observable
    @Override
    public void update(Observable o, Object arg) {
        values.remove(arg);
        if (!isSolved && values.size() == 1) {
            int value = values.get(0);
            setValue(value);
        }
    }

    public Iterable<Integer> candidates() {
        return values;
    }
}
