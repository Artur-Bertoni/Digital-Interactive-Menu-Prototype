package entities;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    //Construtores
    public Pedido() {
    }

    public Pedido(int codigo, int quantidade) {
        this.codigo = codigo;
        this.quantidade = quantidade;
    }
    
    //Atributos
    int codigo,
        quantidade;

    List<Pedido> pedidoList = new ArrayList<>();
    
    //Getter / Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public List<Pedido> getPedidoList() {
        return pedidoList;
    }

    public void setPedidoList(List<Pedido> pedidoList) {
        this.pedidoList = pedidoList;
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
