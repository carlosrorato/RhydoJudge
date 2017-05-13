
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SubmissaoDAO {
    
    public boolean getHabilitado(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check=true;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM submissao");
            rs = stmt.executeQuery();
            if(rs.next()){
                if(rs.getInt("habilitado")==0) check = false;
                else check = true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SubmissaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
        }
      
        return check;
    }
    
    public void setHabilitado(boolean a){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        int param;
        
        if(a==true) param = 1;
        else param = 0;
        try {
            stmt = con.prepareStatement("TRUNCATE TABLE submissao");
            stmt.execute();
            
            stmt = con.prepareStatement("INSERT INTO submissao (habilitado) VALUES (?)");
            stmt.setInt(1, param);
            stmt.executeUpdate();
             
        } catch (SQLException ex) {
            Logger.getLogger(SubmissaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
