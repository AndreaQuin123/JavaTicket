package EVENTOS_USUARIOS;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vanes
 */
public abstract class Usuario {
    
        //ATRIBUTOS
    private String nombre;
    private String username;
    private String password;
    private int edad;
    
    //CONSTRUCTOR
    
    public Usuario(String nombre, String username, String password, int edad){
        this.nombre = nombre;
        this.username = username;
        this.password = password;
        this.edad = edad;
        
    }
    //FUNCIONES GET

    public String getNombre(){
        return nombre;
    }

    public String getUser(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }

    public int getEdad(){
        return edad;
    }    
    
    //FUNCIONES SET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUser(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
