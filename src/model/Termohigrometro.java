/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
        return "termohigrometro{" + "id=" + id + ", fecha=" + fecha + ", temperaturaam=" + temperaturaam + ", temperaturapm=" + temperaturapm + ", humedadam=" + humedadam + ", humedadpm=" + humedadpm + '}';
    }
    
    
        public boolean insert(){
        Connection connection;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            String query = "INSERT INTO termohigrometro VALUES (null,?,?,?,?,?)";
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


    
    

}
