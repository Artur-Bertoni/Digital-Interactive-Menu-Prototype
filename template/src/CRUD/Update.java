package CRUD;

import database.DB;
import database.DbException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import panels.EstoqueFrame;
import panels.MesaFrame;
import panels.PedidoFrame;
import panels.UsuarioFrame;
import panels.VendaFrame;

public class Update {

    public boolean updateUsuario(UsuarioFrame uf){
        PreparedStatement st = null;
        
        try{
            Connection conn = DB.getConnection();
            
            st = conn.prepareStatement("UPDATE artur_usuario SET nome = ?, senha = ?, tipo = ? WHERE ID = ?");
                    
            st.setString(1, uf.getTxtNome());
            st.setString(2, uf.getTxtSenha());
            st.setString(3, uf.getTxtTipo());
            st.setInt(4, uf.getTxtId());
            
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
    
    public boolean updateEstoque(EstoqueFrame ef){
        PreparedStatement st = null;
        
        try{
            Connection conn = DB.getConnection();
            
            st = conn.prepareStatement("UPDATE artur_estoque SET alimento = ?, fornecedor = ?, tipo = ?, quantidade = ?, validadeM = ?, validadeA = ?, codigo = ? "
                                      +"WHERE ID = ?",Statement.RETURN_GENERATED_KEYS);

          st.setString(1, ef.getTxtAlimento());
          st.setString(2, ef.getTxtFornecedor());
          st.setString(3, ef.getTxtTipo());
          st.setString(4, ef.getTxtQuantidade());
          st.setString(5, ef.getTxtValidade().substring(0, 2));
          st.setString(6, ef.getTxtValidade().substring(3));
          st.setString(7, ef.getTxtCodigo());
          st.setInt(8, ef.getTxtId());
            
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
    
    public boolean updateMesa(MesaFrame mf){
        PreparedStatement st = null;
        
        try{
            Connection conn = DB.getConnection();
            
            st = conn.prepareStatement("UPDATE artur_mesa SET pedido = ?, numero = ?, vlrConta = ? WHERE ID = ?",Statement.RETURN_GENERATED_KEYS);
                    
            st.setString(1, mf.getTxtPedido());
            st.setString(2, mf.getTxtNumero());
            st.setString(3, mf.getTxtVlrConta());
            st.setInt(4, mf.getTxtId());
            
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
    
    public boolean updatePedido(PedidoFrame pf){
        PreparedStatement st = null;
        
        try{
            Connection conn = DB.getConnection();
            
            st = conn.prepareStatement("UPDATE artur_pedido SET codigo = ?, quantidade = ? WHERE ID = ?",Statement.RETURN_GENERATED_KEYS);
                    
            st.setString(1, pf.getTxtCodigo());
            st.setString(2, pf.getTxtQuantidade());
            st.setInt(3, pf.getTxtId());
            
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
    
    public boolean updateVenda(VendaFrame vf){
        PreparedStatement st = null;
        
        try{
            Connection conn = DB.getConnection();
            
            st = conn.prepareStatement("UPDATE artur_venda SET mesa = ?, metodPag = ? WHERE ID = ?",Statement.RETURN_GENERATED_KEYS);
                    
            st.setString(1, vf.getTxtMesa());
            st.setString(2, vf.getTxtMetodPag());
            st.setInt(3, vf.getTxtId());
            
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