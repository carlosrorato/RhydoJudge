/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Usuario;


/**
 *
 * @author carlosrorato
 */
public class UsuarioDAO {
    
    public int getSubm(String login){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int subm = 0;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE login = ?");
            stmt.setString(1, login);
            rs = stmt.executeQuery();
            
            
            if(rs.next()){
                
                subm = rs.getInt("totalSub");
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao consultar submissoes: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return subm;
        
    }
    
    public int getScore(String login){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int score = 0;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE login = ?");
            stmt.setString(1, login);
            rs = stmt.executeQuery();
            
            
            if(rs.next()){
                
                score = rs.getInt("score");
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao consultar score: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return score;
        
    }
    
    public void adicionaScore(String senha){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        
        try {
            stmt = con.prepareStatement("UPDATE usuario SET score = score+1 WHERE senha = ?");
            stmt.setString(1,senha);
            
            
            
            
            stmt.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao computar o score: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    
    public void adicionaSubmissao(String senha){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        
        try {
            stmt = con.prepareStatement("UPDATE usuario SET totalSub = totalSub+1 WHERE senha = ?");
            stmt.setString(1,senha);
            
            
            
            
            stmt.executeUpdate();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao computar a submissão: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
     public boolean checkLogin(String login, String senha, int tipo){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE login = ? and senha = ? and tipo = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            stmt.setInt(3,tipo);
            rs = stmt.executeQuery();
            
            
            if(rs.next()){
                
                check = true;
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao checar login: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return check;
        
    }
     
    public void create(Usuario u){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        
        try {
            stmt = con.prepareStatement("INSERT INTO usuario (login,senha,tipo,score,totalSub)VALUES(?,?,?,?,?)");
            stmt.setString(1,u.getLogin());
            stmt.setString(2,u.getSenha());
            stmt.setInt(3,u.getTipo());
            stmt.setInt(4,u.getScore());
            stmt.setInt(5,u.getTotalSub());
            
            
            
            stmt.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null,"Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    public List<Usuario> read(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> usuarios = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM usuario");
            rs = stmt.executeQuery();
            
            
            while(rs.next()){
                
                Usuario u = new Usuario();
                
                u.setTipo(rs.getInt("tipo"));
                u.setLogin(rs.getString("login"));
                u.setSenha(rs.getString("senha"));
                u.setScore(rs.getInt("score"));
                u.setTotalSub(rs.getInt("totalSub"));
                
                
                usuarios.add(u);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao adicionar usuario na lista: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuarios;
        
    }
    
    
    public void update(Usuario u){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        
        try {
            stmt = con.prepareStatement("UPDATE usuario SET senha = ?,tipo = ?,score = ?,totalSub = ? WHERE login = ?");
            stmt.setString(1,u.getSenha());
            stmt.setInt(2,u.getTipo());
            stmt.setInt(3,u.getScore());
            stmt.setInt(4,u.getTotalSub());
            stmt.setString(5,u.getLogin());
            
            
            
            stmt.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null,"Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao atualizar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    
    public void delete(Usuario u){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        
        try {
            stmt = con.prepareStatement("DELETE FROM usuario WHERE login = ?");
            stmt.setString(1,u.getLogin());
            
            
            stmt.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null,"Excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
}
