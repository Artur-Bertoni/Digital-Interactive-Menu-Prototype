package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Estoque {
    
    //Construtores
    public Estoque() {
    }

    public Estoque(String alimento, String fornecedor, Integer tipo, Integer quantidade, Integer validadeM, Integer validadeA, Integer codigo) {
        this.alimento = alimento;
        this.fornecedor = fornecedor;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.validadeM = validadeM;
        this.validadeA = validadeA;
        this.codigo = codigo;
    }
    
    //Atributos
    private String  alimento,
                    fornecedor;
    private Integer tipo, //0 = peressível, 1 = ñ peressível
                    quantidade,
                    validadeM,
                    validadeA,
                    codigo;

    public static List<Estoque> listEstoque  = new ArrayList<>();

    //Getters / Setters
    public void setAlimento(String alimento){
        this.alimento = alimento;
    }
    public String getAlimento(){
        return alimento;
    }
    
    public void setFornecedor(String fornecedor){
        this.fornecedor = fornecedor;
    }
    public String getFornecedor(){
        return fornecedor;
    }
    
    public void setTipo(Integer tipo){
        this.tipo = tipo;
    }
    public int getTipo(){
        return tipo;
    }
    
    public void setQuantidade(Integer quantidade){
        this.quantidade = quantidade;
    }
    public int getQuantidade(){
        return quantidade;
    }
    
    public void setValidadeM(Integer validadeM){
        this.validadeM = validadeM;
    }
    public int getValidadeM(){
        return validadeM;
    }
    
    public void setValidadeA(Integer validadeA){
        this.validadeA = validadeA;
    }
    public int getValidadeA(){
        return validadeA;
    }
    
    public void setCodigo(Integer codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return codigo;
    }
    
    public String getValidadeCompleta(){
        return validadeM + "/" + validadeA;
    }
    
    //Métodos
    public boolean cadastrarProduto(String alimento, String fornecedor, Integer tipo, Integer quantidade, Integer validadeM, Integer validadeA, Integer codigo){
        Estoque e = new Estoque();
        
        e.setAlimento(alimento);
        e.setFornecedor(fornecedor);
        e.setQuantidade(quantidade);
        e.setTipo(tipo);
        e.setValidadeA(validadeA);
        e.setValidadeM(validadeM);
        e.setCodigo(codigo);
        listEstoque.add(e);
        
        return true;
    }
    
    public boolean verificacaoPontual(Integer codigo){
        for (Estoque estoque : listEstoque) {
            if (Objects.equals(estoque.codigo, codigo)) {
                setAlimento(estoque.alimento);
                setFornecedor(estoque.fornecedor);
                setQuantidade(estoque.quantidade);
                setTipo(estoque.tipo);
                setValidadeA(estoque.validadeA);
                setValidadeM(estoque.validadeM);
                setCodigo(estoque.codigo);
                return true;
            }
        }
        return false;
    }
    
    public boolean verificacaoSequencial(Integer i){
        if (i >= 0){
            setAlimento(listEstoque.get(i).alimento);
            setFornecedor(listEstoque.get(i).fornecedor);
            setQuantidade(listEstoque.get(i).quantidade);
            setTipo(listEstoque.get(i).tipo);
            setValidadeA(listEstoque.get(i).validadeA);
            setValidadeM(listEstoque.get(i).validadeM);
            setCodigo(listEstoque.get(i).codigo);
            return true;
        }
        return false;
    }
    
    public boolean editarItem(String alimento, String fornecedor, Integer tipo, Integer quantidade, Integer validadeM, Integer validadeA, Integer codigo){
        for (Estoque estoque : listEstoque) {
            if (Objects.equals(estoque.codigo, codigo)) {
                if (alimento != null) estoque.setAlimento(alimento);
                if (fornecedor != null) estoque.setFornecedor(fornecedor);
                if (quantidade != null) estoque.setQuantidade(quantidade);
                if (tipo != null) estoque.setTipo(tipo);
                if (validadeA != null) estoque.setValidadeA(validadeA);
                if (validadeM != null) estoque.setValidadeM(validadeM);
                return true;
            }
        }
        return false;
    }
    
    public void criar(){ //Create
    }
    
    public void ler(){ //Read
    }
    
    public void atualizar(){ //Update
    }
    
    public void apagar(){ //Delete
    }
}