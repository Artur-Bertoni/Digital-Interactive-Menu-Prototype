package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
    
    private static Connection conn = null;
    private static Statement st = null;
    
    public static Connection getConnection(){
            try {
                if (conn == null){
                    String driverName = "com.mysql.jdbc.Driver";
                    Class.forName(driverName);

                    //Configurando a nossa conexão com um banco de dados
                    String serverName = "193.123.108.138";      //caminho do servidor do BD
                    String mydatabase = "prob2022_2";           //nome do seu banco de dados
                    String url = "jdbc:mysql://"+serverName+"/"+mydatabase+"?useUnicode=true&characterEncoding=UTF8";
                    String username = "prob2022_2";             //nome de um usuário de seu BD      
                    String password = "prob2022_2";             //sua senha de acesso

                    conn = DriverManager.getConnection(url, username, password);
                } else if (conn.isClosed()){
                    String driverName = "com.mysql.jdbc.Driver";
                    Class.forName(driverName);

                    //Configurando a nossa conexão com um banco de dados
                    String serverName = "193.123.108.138";      //caminho do servidor do BD
                    String mydatabase = "prob2022_2";           //nome do seu banco de dados
                    String url = "jdbc:mysql://"+serverName+"/"+mydatabase+"?useUnicode=true&characterEncoding=UTF8";
                    String username = "prob2022_2";             //nome de um usuário de seu BD      
                    String password = "prob2022_2";             //sua senha de acesso

                    conn = DriverManager.getConnection(url, username, password);
                }
            } catch (SQLException | ClassNotFoundException e) {
                throw new DbException(e.getMessage());
            }
        return conn;
    }
    
    public static void closeConnection(){
        if (conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }
    
    public static void closeStatement(Statement st){
        if (st != null){
            try{
                st.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }
    
    public static void closeResultSet(ResultSet rs){
        if (rs != null){
            try{
                rs.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }
}
