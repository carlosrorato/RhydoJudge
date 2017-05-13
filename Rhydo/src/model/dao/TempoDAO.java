
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TempoDAO {
    
    public int getTempoSub(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int tempo=0;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM tempo");
            rs = stmt.executeQuery();
            if(rs.next()){
                tempo = rs.getInt("tempo_sub");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SubmissaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
        }
      
        return tempo;
    }
    
    public void setTempoSub(int a){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("TRUNCATE TABLE tempo");
            stmt.execute();
            
            stmt = con.prepareStatement("INSERT INTO tempo (tempo_sub) VALUES (?)");
            stmt.setInt(1, a);
            stmt.executeUpdate();
             
        } catch (SQLException ex) {
            Logger.getLogger(SubmissaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
