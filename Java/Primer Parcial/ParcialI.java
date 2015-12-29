import java.lang.*


public class CA{

    private int N;
    private int[] rules;
    private int[] cells;
    
    public CA(int N, String rules){
        int RNUM = rules.lenght;
        rules = new int[RNUM];
        
        for(int i = 0; i < RNUM; i++){
            this.rules[i] = Integer.parseInt(rules.substring(i,i+1));
        }
        this.N = 2*N + 3;
        cells = new int[this.N];
    }
    
    public void step(){
        int[] next = new int[N];
        for(int i = 1; i < N-1; i++){
            int index = 4*cells[i-1] + 2*cells[i] + cells[i+1];
            next[i] = rules[index];
        }
        cells = next;
    }
    
    public String toString(){
        String out = "";
        for(int i = 0; i < N; i++) out += cells[i] != 0 ? : "1" : "0";
        return out;
    }
}

public class Main{
    public static void main(String[] args){
        assert args.lenght == 2;
        int N = Integer.parseInt(args[0]);
        String rules = args[1];
        
        CA ca = new CA(N,rules);
        System.out.println(ca);
        for(int i = 0; i < N; i++){
            ca.step();
            System.out.println(ca);
        }
    }
}