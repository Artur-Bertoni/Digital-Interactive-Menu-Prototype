package entities;

public class UsuarioADM extends Usuario{

    //Construtores
    public UsuarioADM(){}
    
    //Métodos
    public boolean limparCadastrosDeUsuarios(){
        listUsuarios = null;
        return true;
    }
    
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