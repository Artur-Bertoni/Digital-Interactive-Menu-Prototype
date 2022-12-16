package entities;

public class Produto extends Estoque{
    
    //Construtores
    public Produto(){
    }
    
    public Produto(String nome, String descriao, String tipo, String ingredientes, Float preco){
        this.descricao = descriao;
        this.ingredientes = ingredientes;
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
    }
    
    //Atributos
    private String nome         = "Ex: pastel",
                   descricao    = "Assado feito de tal e tal maneira, com tais produtos [...] avisos à alérgicos...",
                   tipo         = "Assado",
                   ingredientes = "x, y, z";
    private Float  preco        = 0.00f;
    
    //Getters / Setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String gettipo(){
        return tipo;
    }
    
    public void setIngredientes(String ingredientes){
        this.ingredientes = ingredientes;
    }
    public String getIngredientes(){
        return ingredientes;
    }
    
    public void setPreco(Float preco){
        this.preco = preco;
    }
    public float getPreco(){
        return preco;
    }
    
    //Métodos
    @Override
    public void criar(){ //Create
    }
    
    @Override
    public void ler(){ //Read
    }
    
    @Override
    public void atualizar(){ //Update
    }
    
    @Override
    public void apagar(){ //Delete
    }
}