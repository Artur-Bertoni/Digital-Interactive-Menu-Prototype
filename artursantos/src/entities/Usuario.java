package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Usuario {
    
    //Construtores
    public Usuario(){
    }

    public Usuario(String usuario, String senha, String nome, Integer tipo, Integer ID){
        this.ID = ID;
        this.nome = nome;
        this.senha = senha;
        this.tipo = tipo;
        this.usuario = usuario;
    }
    
    //Atributos
    private String  usuario,
                    senha,
                    senhaConfirm,
                    nome;
    private Integer tipo, //0 - Administrador, 1 - Padrão
                    ID;

    public static List<Usuario> listUsuarios = new ArrayList<>();

    //Getters / Setters
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    public String getUsuario(){
        return usuario;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    public String getSenha(){
        return senha;
    }
    
    public void setSenhaConfirm(String senhaConfirm){
        this.senhaConfirm = senhaConfirm;
    }
    public String getSenhaConfirm(){
        return senhaConfirm;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setTipo(int tipo){
        this.tipo = tipo;
    }
    public int getTipo(){
        return tipo;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }
    
    //Métodos
    public boolean login(String usuario, String senha){
        for (Usuario listUsuario : listUsuarios) {
            if (listUsuario.usuario != null && listUsuario.senha != null) {
                if (listUsuario.usuario.equals(usuario) && listUsuario.senha.equals(senha)) {
                    setNome(listUsuario.nome);
                    setTipo(listUsuario.tipo);
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean cadastrarUduario(String nome, String usuario, String senha, Integer tipo, Integer ID){
        Usuario u = new Usuario();
        
        u.setNome(nome);
        u.setUsuario(usuario);
        u.setSenha(senha);
        u.setTipo(tipo);
        u.setID(ID);
        listUsuarios.add(u);
        return true;
    }
    
    public boolean editarUsuario(String nome, String usuario, String senha, Integer ID){
        for (Usuario listUsuario : listUsuarios) {
            if (Objects.equals(listUsuario.ID, ID)) {
                if (nome != null) listUsuario.setNome(nome);
                if (usuario != null) listUsuario.setUsuario(usuario);
                if (senha != null) listUsuario.setSenha(senha);
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