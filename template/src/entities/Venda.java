package entities;

public class Venda {
    
    //Construtores
    public Venda(){
    }
    
    public Venda(Integer mesa, Integer metodPag){
        this.mesa = mesa;
        this.metodPag = metodPag;
    }
    
    //Atributos
    private Integer mesa     = 1,
                    metodPag = 1; //1 = Crédito, 2 = Débito, 3 = Dinheiro, 4 = Pix
    
    //Getters / Setters
    public void setMesa(int mesa){
        this.mesa = mesa;
    }
    public int getMesa(){
        return mesa;
    }
    
    public void setMetodPag(int metodPag){
        this.metodPag = metodPag;
    }
    public int getMetodPag(){
        return metodPag;
    }
    
    //Métodos
    public void criar(){ //Create
    }
    
    public void ler(){ //Read
    }
    
    public void atualizar(){ //Update
    }
    
    public void apagar(){ //Delete
    }
}