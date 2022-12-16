package entities;

public class Mesa {
    
    //Construtores
    public Mesa() {
    }
    
    public Mesa(String pedido, Integer numero, Float vlrConta){
        this.pedido = pedido;
        this.numero = numero;
        this.vlrConta = vlrConta;
    }
    
    //Atributos
    private String  pedido   = "Ex: pastel";
    private Integer numero   = 0;
    private Float   vlrConta = 0.00f;
    
    //Getters / Setters
    public void setPedido(String pedido){
        this.pedido = pedido;
    }
    public String getPedido(){
        return pedido;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return numero;
    }
    
    public void setVlrConta(float vlrConta){
        this.vlrConta = vlrConta;
    }
    public float getVlrConta(){
        return vlrConta;
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