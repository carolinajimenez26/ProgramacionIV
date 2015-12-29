class Ficha{//son como variables globales dentro de la clase
    
    private char color; //color de la ficha "b" : negra, "w" : blanca, 'n' nada.
    private char type; //tipo de ficha: '+' negro, '*' blanco, ' ' nada.
        
    public Ficha(char color,char type){//constructor que recive color y tipo de la ficha
        this.color = color;
        this.type = type;
    }
    
    public Ficha(){//otro constructor
        this.color = 'n';//ficha invisible
        this.type=' ';
    }
    
    public Ficha(char type){
        setType(type);
    }
    
    public char getColor(){ 
        return this.color;
    }
    public char getType(){ 
        return this.type;
    }
    public void setColor(char color){ 
        this.color = color;
    }
    public void setType(char type){ 
        this.type = type;
    }
    
    public void print(){ 
        if(type == ' '){
            System.out.print(" ");
            return;//hace que lo que sigue después del método no se ejecute
        }
        System.out.print(type); //imprime el tipo
        if(color == 'w') System.out.print("*"); //si el color es blanco *
        else System.out.print("+");//si el color es negro +
    }
   
    	
};
