/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author USUARIO
 */
public class InstitucionEducativa {
    private String nombre;
    private String tpiinstitucion;
    private int numAlumnos;
    private int numDocentes;
    private int numSede;
    
    public void establecerNombre(String c){
        nombre = c;
        
    }
    public void establecerTipoInstitucion(String c){
        tpiinstitucion = c;
    }
    public void establecerNumAlumnos(int c){
        numAlumnos = c;
     
    }
    public void establecerNumDocentes(int c){
        numDocentes = c;
        
    }
    public void establecerNumSede(int c){
        numSede = c;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerTipoInstitucion(){
        return tpiinstitucion;
        
    }
    public int obtenerNumAlumnos(){
        return numAlumnos;
    }
    public int obtenerNumDocentes(){
        return numDocentes;
    }
    public int obtenerNumSede(){
        return numSede;
    }
}
