package CRUD;

import database.DB;
import database.DbException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {

    public ResultSet select(String entitieType, Integer Id){
        PreparedStatement st = null;
        ResultSet rs = null;
        
        try {
            Connection conn = DB.getConnection();
            
            st = conn.prepareStatement("SELECT * FROM artur_"+entitieType+" WHERE artur_"+entitieType+".Id = "+Id);
            rs = st.executeQuery();
            
            if (!rs.wasNull()){
                return rs;
            }
            return null;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally{
            //DB.closeStatement(st);
            //DB.closeResultSet(rs);
            //DB.closeConnection();
        }
    }
}
