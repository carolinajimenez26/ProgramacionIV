import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.util.*;


class Spelling {

	private final HashMap<String, Integer> nWords = new HashMap<String, Integer>();

	public Spelling(String file) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(file));//lee el archivo
		Pattern p = Pattern.compile("[\\wñáéíóúü:;.,]+");//  expresion regular a utilizar
		for(String temp = ""; temp != null; temp = in.readLine()){
			Matcher m = p.matcher(temp.toLowerCase());//pasa a minuscula
                        
                        //mientras la palabra haga parte del patron al hashmap agregue el numero de coincidencias. 
			while(m.find()) nWords.put((temp = m.group()), nWords.containsKey(temp) ? nWords.get(temp) + 1 : 1);
 		}
		in.close();//cierra el archivo
	}

	private final ArrayList<String> edits(String word) {
		ArrayList<String> result = new ArrayList<String>();
		for(int i=0; i < word.length(); ++i) result.add(word.substring(0, i) + word.substring(i+1));
		for(int i=0; i < word.length()-1; ++i) result.add(word.substring(0, i) + word.substring(i+1, i+2) + word.substring(i, i+1) + word.substring(i+2));
		for(int i=0; i < word.length(); ++i) for(char c='a'; c <= 'z'| c <='á' | c <='é' | c <='í' | c <='ó' | c <='ú'|c <= 'ü' ; ++c) result.add(word.substring(0, i) + String.valueOf(c) + word.substring(i+1));
		for(int i=0; i <= word.length(); ++i) for(char c='a'; c <= 'z'| c <='á' | c <='é' | c <='í' | c <='ó' | c <='ú'|c <= 'ü' ; ++c) result.add(word.substring(0, i) + String.valueOf(c) + word.substring(i));
		return result;
	}

	public final String correct(String word) {
		if(nWords.containsKey(word)) return word;//si la palabra se encuentra bien (es decir forma parte del big.txt) se devuelve la palabra
		ArrayList<String> list = edits(word); //se crea una lista con las palabras editadas a su correccion 
		HashMap<Integer, String> candidates = new HashMap<Integer, String>();
		for(String s : list) if(nWords.containsKey(s)) candidates.put(nWords.get(s),s);
		if(candidates.size() > 0) return candidates.get(Collections.max(candidates.keySet()));
		for(String s : list) for(String w : edits(s)) if(nWords.containsKey(w)) candidates.put(nWords.get(w),w);
		return candidates.size() > 0 ? candidates.get(Collections.max(candidates.keySet())) : word;
	}

	public static void main(String args[]) throws java.io.IOException {//IOException,
                BufferedReader in = new BufferedReader(new FileReader("corregir.txt"));
                 BufferedWriter out=new BufferedWriter(new FileWriter("correccion.txt"));
                for(String temp = ""; temp != null; temp = in.readLine()){
                    StringTokenizer palabra = new StringTokenizer(temp);
                    // bucle por todas las palabras
                    while(palabra.hasMoreTokens()){
                        out.write((new Spelling("big.txt")).correct(palabra.nextToken()));
                        out.write(" ");
                        out.flush();
                    }
                    out.newLine();
                    out.flush();
                }
                
                out.close();

	}
}