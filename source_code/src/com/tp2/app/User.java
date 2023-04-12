/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp2.app;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author vamou
 */
public class User {
    private final int id;
    private String nama;
    private String username;
    private String password;
    private boolean isValid;
    
    public User(int id, String nama, String username, String password, boolean isValid){
        this.id = id;
        this.nama = nama;
        this.username = username;
        this.password = password;
        this.isValid = isValid;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public boolean getIsValid(){
        return this.isValid;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public void setIsValid(boolean isValid){
        this.isValid = isValid;
    }
    
    static public User authenticate(String username, String password){
        try{
            String sql = "SELECT * FROM `user` WHERE username='"+username+"'";
            java.sql.Connection conn = (Connection)DBConnection.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            if(res.next()){
                if(res.getString(4).equals(password)){
                    JOptionPane.showMessageDialog(null, "Login Berhasil..");
                    User temp = new User(res.getInt(1), res.getString(2),res.getString(3), res.getString(4), true);
                    
                    return temp;
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "User Tidak Ditemukan");
            }
            // TODO go to another page
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        User temp = new User(0, "-","-", "-", false);
        JOptionPane.showMessageDialog(null, "Password salah..");
        return temp;
    }
}
