/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;
import java.sql.*;

/**
 *
 * @author a-gum
 */
public class koneksi {
    private Connection koneksi;
    public Connection connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Berhasil koneksi");
        }catch (ClassNotFoundException ex) {
            System.out.println("Gagal Koneksi "+ex);
        }
        String url = "jdbc:mysql://localhost/klinik";
        try {
            koneksi = DriverManager.getConnection(url,"root","");
            System.out.println("Berhasil koneksi Database");
        }catch (SQLException ex) {
            System.out.println("Gagal Koneksi Database "+ex);
        }
        return koneksi;
    }
    
}
