/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Wnieto
 */
public class Termohigrometro extends DbData{
    public int id;
    public String fecha;
    public float temperaturaam;
    public float temperaturapm;
    public float humedadam;
    public float humedadpm;

    @Override
    public String toString() {
        return "" + id + ", fecha=" + fecha + ", temperaturaam=" + temperaturaam + ", temperaturapm=" + temperaturapm + ", humedadam=" + humedadam + ", humedadpm=" + humedadpm ;
    }
    
    
    public boolean insert(){
        Connection connection;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            String query = "INSERT INTO temperaturahumedad VALUES (null,?,?,?,?,?)";
            PreparedStatement sentencia = connection.prepareStatement(query);
            sentencia.setString(1,fecha);
            sentencia.setFloat(2,temperaturaam);
            sentencia.setFloat(3,temperaturapm);
            sentencia.setFloat(4,humedadam);
            sentencia.setFloat(5,humedadpm);
            int filasAfectadas = sentencia.executeUpdate();
            connection.close();
            if (filasAfectadas > 0){
                return true;
            }else{
                return false;
            }
        } catch(Exception e){
            System.out.println("Error " + e.toString());
            return false;
        }
    }

    public ArrayList<Termohigrometro> select(){
        Connection connection;
        try{
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            
            String query = "SELECT * FROM temperaturahumedad";
            PreparedStatement sentencia = connection.prepareStatement(query);
            ResultSet rs = sentencia.executeQuery();
            ArrayList<Termohigrometro> listaTermohigrometro = new ArrayList<>();
            while(rs.next()){
                Termohigrometro termohigrometro = new Termohigrometro();
                termohigrometro.id = rs.getInt(1);
                termohigrometro.fecha = rs.getString(2);
                termohigrometro.temperaturaam = rs.getFloat(3);
                termohigrometro.temperaturapm = rs.getFloat(4);
                termohigrometro.humedadam = rs.getFloat(5);
                termohigrometro.humedadpm = rs.getFloat(6);
                listaTermohigrometro.add(termohigrometro);
            }
            connection.close();
            return listaTermohigrometro;
        }catch (Exception e){
            System.out.println("Error " + e.toString());
            return null;
        }
    }    
    
    
    public boolean update(){
        Connection connection;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            String query = "UPDATE temperaturahumedad SET fecha=?, temperaturaam=?,temperaturapm=?,humedadam=?,humedadpm=? WHERE id_registro=?";
            PreparedStatement sentencia = connection.prepareStatement(query);
            sentencia.setString(1,fecha);
            sentencia.setFloat(2,temperaturaam);
            sentencia.setFloat(3,temperaturapm);
            sentencia.setFloat(4,humedadam);
            sentencia.setFloat(5,humedadpm);
            sentencia.setFloat(6,id);
            int filasAfectadas = sentencia.executeUpdate();
            connection.close();
            if (filasAfectadas > 0){
                return true;
            }else{
                return false;
            }
        } catch(Exception e){
            System.out.println("Error " + e.toString());
            return false;
        }
    }

    public Termohigrometro find(int id){
        Connection connection;
        try{
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            String query = "SELECT * FROM  temperaturahumedad WHERE id_registro=?";
            PreparedStatement sentencia = connection.prepareStatement(query);
            sentencia.setInt(1, id);
            ResultSet rs = sentencia.executeQuery();
            Termohigrometro termohigrometro = new Termohigrometro();
            if(rs.next()){
                termohigrometro.id = rs.getInt(1);
                termohigrometro.fecha = rs.getString(2);
                termohigrometro.temperaturaam = rs.getFloat(3);
                termohigrometro.temperaturapm = rs.getFloat(4);
                termohigrometro.humedadam = rs.getFloat(5);
                termohigrometro.humedadpm = rs.getFloat(6);
            }else{
                termohigrometro = null;
            }
            connection.close();
            return termohigrometro;
        }catch (Exception e){
            System.out.println("Error " + e.toString());
            return null;
        }
    }
    
    

}
