package model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author utp
 */
public class SudokuParser {
    
    private String filename;
    private int size;
    private List<String> stringsList;
    
    public SudokuParser(String filename) {
        this.filename = filename;
        File fin = new File(filename);
        stringsList = new ArrayList<String>();
        
        try {
            Scanner scanner = new Scanner(fin);
            if (scanner.hasNextInt()) {
                size = scanner.nextInt();
            }
            if (scanner.hasNextLine()) {
                String emptyLine = scanner.nextLine();
            }
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                stringsList.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public int getSize() {
        return size;
    }
    
    public List<String> getStringsList() {
        return stringsList;
    }    
}
