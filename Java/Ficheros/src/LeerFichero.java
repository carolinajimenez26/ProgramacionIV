import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
public class LeerFichero {
    
    public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        char[][] matriz = new char[20][20];
        int l = 0;
            String cadena;
            FileReader f = new FileReader("build/classes/laberinto.txt");
            BufferedReader b = new BufferedReader(f);
            while((cadena = b.readLine())!=null) {//fila
                for(int k = 0; k < 20; k++){//columna
                    matriz[l][k] = cadena.charAt(k);
                }
                l++;
            }
            b.close();
            
        
        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 20; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
 
    public static void main(String[] args) throws IOException {
        muestraContenido("build/classes/laberinto.txt");
    }
   
}