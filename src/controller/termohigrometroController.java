/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Termohigrometro;

/**
 *
 * @author Wnieto
 */
public class TermohigrometroController {
    public boolean insertTermohigrometro(String fecha, float temperaturaam, float temperaturapm, float humedadam, float humedadpm){
        Termohigrometro termohigrometro = new Termohigrometro();
        termohigrometro.fecha = fecha;
        termohigrometro.temperaturaam = temperaturaam;
        termohigrometro.temperaturapm = temperaturapm;
        termohigrometro.humedadam = humedadam;
        termohigrometro.humedadpm = humedadpm;
        return termohigrometro.insert();
    }  
    public boolean updateTermohigrometro(int id, String fecha, float temperaturaam, float temperaturapm, float humedadam, float humedadpm){
        Termohigrometro termohigrometro = new Termohigrometro();
        termohigrometro.id = id;
        termohigrometro.fecha = fecha;
        termohigrometro.temperaturaam = temperaturaam;
        termohigrometro.temperaturapm = temperaturapm;
        termohigrometro.humedadam = humedadam;
        termohigrometro.humedadpm = humedadpm;
        return termohigrometro.update();
    }     
    
    public ArrayList<Termohigrometro> SelectTermohigrometro(){
        Termohigrometro termohigrometro = new Termohigrometro();
        return termohigrometro.select();
    }    

    public Termohigrometro findTermohigrometro(int id){
        Termohigrometro termohigrometro = new Termohigrometro();
        return termohigrometro.find(id);
    }    
    
    
}
