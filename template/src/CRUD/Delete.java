package CRUD;

import database.DB;
import database.DbException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
    
    public boolean delete(String entitieType, Integer Id){
        PreparedStatement st = null;
        
        try {
            Connection conn = DB.getConnection();
            
            st = conn.prepareStatement("DELETE FROM artur_"+entitieType+" WHERE Id = "+Id);
            
            int rowsAffected = st.executeUpdate();
            
            if (rowsAffected > 0){
                return true;
            } else{
                throw new DbException("Nenhuma linha da tabela foi afetada");
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally{
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}