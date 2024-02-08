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
    private String usuario;
    private String password;
    private int edad;
    
    //CONSTRUCTOR
    
    public Usuario(String nombre, String usuario, String password, int edad){
        this.nombre = nombre;
        this.usuario = usuario;
        this.password = password;
        this.edad = edad;
        
        
    }
    //FUNCIONES GET

    public String getNombre(){
        return nombre;
    }

    public String getUsuario(){
        return usuario;
    }
    
    public String getContraseña(){
        return password;
    }

    public int getEdad(){
        return edad;
    }    
    
    //FUNCIONES SET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUser(String usuario) {
        this.usuario = usuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract void AgregarEvento(Evento nuevoEvento);

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Pass: " + password;
    }


}
