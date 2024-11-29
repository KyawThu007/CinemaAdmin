/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Interface.LoginInterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class LoginImp implements LoginInterface {

    static Connection con = null;
    
    @Override
    public int login(String username, String password) {
        int n = 0;
        try {
            con = new DatabaseConnection().getConnection();
            String query = "select * from admin where username=? and password=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            // Execute the query
            ResultSet rs = ps.executeQuery();  // Use executeQuery for SELECT statements

            while (rs.next()) {
                n = 1;
                break;
            }

            // Close the ResultSet and PreparedStatement
            rs.close();
            ps.close();

            con.close();

        } catch (SQLException ex) {
            logMessage(ex.getMessage());
        }
        return n;
    }

    @Override
    public void logMessage(String log) {
        JOptionPane.showMessageDialog(null, log, "", JOptionPane.INFORMATION_MESSAGE);
    }

}
