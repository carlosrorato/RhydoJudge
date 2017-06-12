package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TempoDAO {

    public int getTempoSub() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Timestamp tempo;
        int segundos;
        Calendar cal = Calendar.getInstance();

        try {
            stmt = con.prepareStatement("SELECT * FROM tempo");
            rs = stmt.executeQuery();
            if (rs.next()) {
                tempo = rs.getTimestamp("tempo_sub");
                segundos = (int) (tempo.getTime() - cal.getTimeInMillis()) / 1000;
                if(segundos > 0) return segundos;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao consultar o tempo de submissão: "+ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return 0;

    }

    public void setTempoSub(int a) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.SECOND, a);

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("TRUNCATE TABLE tempo");
            stmt.execute();

            stmt = con.prepareStatement("INSERT INTO tempo (tempo_sub) VALUES (?)");
            stmt.setTimestamp(1, new Timestamp(cal.getTimeInMillis()));
            stmt.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao definir o tempo de submissão: "+ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
