package CRUD;

import database.DB;
import database.DbException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import panels.EstoqueFrame;
import panels.MesaFrame;
import panels.PedidoFrame;
import panels.UsuarioFrame;
import panels.VendaFrame;

public class Insert {
    
    public boolean insertUsuario(UsuarioFrame uf){
        PreparedStatement st = null;
        
        try{
            Connection conn = DB.getConnection();
            
            st = conn.prepareStatement("INSERT INTO artur_usuario(nome,senha,tipo) VALUES (?,?,?)");

            st.setString(1, uf.getTxtNome());
            st.setString(2, uf.getTxtSenha());
            st.setString(3, uf.getTxtTipo());
            
            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0){
                return true;
            } else{
                throw new DbException("Nenhuma linha da tabela foi afetada");
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeConnection();
            DB.closeStatement(st);
        }
    }
    
    public boolean insertEstoque(EstoqueFrame ef){
        PreparedStatement st = null;
        
        try{
            Connection conn = DB.getConnection();
            
            st = conn.prepareStatement("INSERT INTO artur_estoque (alimento,fornecedor,tipo,quantidade,validadeM,validadeA,codigo) VALUES (?,?,?,?,?,?,?)");
                    
            st.setString(1, ef.getTxtAlimento());
            st.setString(2, ef.getTxtFornecedor());
            st.setString(3, ef.getTxtTipo());
            st.setString(4, ef.getTxtQuantidade());
            st.setString(5, ef.getTxtValidade().substring(0, 2));
            st.setString(6, ef.getTxtValidade().substring(3));
            st.setString(7, ef.getTxtCodigo());
            
            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0){
                return true;
            } else{
                throw new DbException("Nenhuma linha da tabela foi afetada");
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeConnection();
            DB.closeStatement(st);
        }
    }
    
    public boolean insertMesa(MesaFrame mf){
        PreparedStatement st = null;
        
        try{
            Connection conn = DB.getConnection();
            
            st = conn.prepareStatement("INSERT INTO artur_mesa(pedido,numero,vlrConta) VALUES (?,?,?)");

            st.setString(1, mf.getTxtPedido());
            st.setString(2, mf.getTxtNumero());
            st.setString(3, mf.getTxtVlrConta());
            
            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0){
                return true;
            } else{
                throw new DbException("Nenhuma linha da tabela foi afetada");
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeConnection();
            DB.closeStatement(st);
        }
    }
    
    public boolean insertPedido(PedidoFrame pf){
        PreparedStatement st = null;
        
        try{
            Connection conn = DB.getConnection();
            
            st = conn.prepareStatement("INSERT INTO artur_pedido(codigo,quantidade) VALUES (?,?)");
                    
            st.setString(1, pf.getTxtCodigo());
            st.setString(2, pf.getTxtQuantidade());
            
            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0){
                return true;
            } else{
                throw new DbException("Nenhuma linha da tabela foi afetada");
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeConnection();
            DB.closeStatement(st);
        }
    }
    
    public boolean insertVenda(VendaFrame vf){
        PreparedStatement st = null;
        
        try{
            Connection conn = DB.getConnection();
            
            st = conn.prepareStatement("INSERT INTO artur_venda(mesa,metodPag) VALUES (?,?)");
                    
            st.setString(1, vf.getTxtMesa());
            st.setString(2, vf.getTxtMetodPag());
            
            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0){
                return true;
            } else{
                throw new DbException("Nenhuma linha da tabela foi afetada");
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeConnection();
            DB.closeStatement(st);
        }
    }
}