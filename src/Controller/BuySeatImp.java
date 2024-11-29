/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import static Controller.ShowImp.con;
import Interface.BuySeatInterface;
import Model.BuySeat;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class BuySeatImp implements BuySeatInterface {

    @Override
    public int addBuySeat(BuySeat buySeat) {
        int n = 0;
        try {
            con = new DatabaseConnection().getConnection();
            String query = "insert into buySeat(cinema_id,show_id,seat_id,date,price,time) values (?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, buySeat.getCinema_id());
            ps.setInt(2, buySeat.getShow_id());
            ps.setInt(3, buySeat.getSeat_id());
            ps.setDate(4, Date.valueOf(buySeat.getDate()));
            ps.setDouble(5, buySeat.getPrice());
            ps.setString(6, buySeat.getTime());
            n = ps.executeUpdate();
            con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return n;
    }

    @Override
    public List<BuySeat> getShowBuySeat(int show_id) {

        List<BuySeat> list = new ArrayList<>();
        try {
            con = new DatabaseConnection().getConnection();
            String query = "select * from buySeat where show_id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, show_id);

            // Execute the query
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BuySeat buySeat = new BuySeat();
                buySeat.setId(rs.getInt("id"));
                buySeat.setCinema_id(rs.getInt("cinema_id"));
                buySeat.setShow_id(rs.getInt("show_id"));
                buySeat.setSeat_id(rs.getInt("seat_id"));
                buySeat.setDate(rs.getDate("date").toString());
                buySeat.setPrice(rs.getDouble("price"));
                buySeat.setTime(rs.getString("time"));
                list.add(buySeat);
            }
            rs.close();
            ps.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list.reversed();

    }

    @Override
    public List<BuySeat> getAllShowBuySeat(int cinema_id) {

        List<BuySeat> list = new ArrayList<>();
        try {
            con = new DatabaseConnection().getConnection();
            String query = "select * from buySeat where cinema_id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, cinema_id);

            // Execute the query
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BuySeat buySeat = new BuySeat();
                buySeat.setId(rs.getInt("id"));
                buySeat.setCinema_id(rs.getInt("cinema_id"));
                buySeat.setShow_id(rs.getInt("show_id"));
                buySeat.setSeat_id(rs.getInt("seat_id"));
                buySeat.setDate(rs.getDate("date").toString());
                buySeat.setPrice(rs.getDouble("price"));
                buySeat.setTime(rs.getString("time"));
                list.add(buySeat);
            }
            rs.close();
            ps.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list.reversed();

    }
}
