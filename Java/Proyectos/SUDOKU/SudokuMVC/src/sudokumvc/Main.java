
import controller.Sudoku;


public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        /*
        SudokuParser parser = new SudokuParser("hard.txt");
        
        for (String str : parser.getStringsList()) {
            SudokuModel s = new SudokuModel(parser.getSize());
            s.setup(str);
            System.out.print(s);
        }
        */
        new Sudoku().setVisible(true);
    }
}