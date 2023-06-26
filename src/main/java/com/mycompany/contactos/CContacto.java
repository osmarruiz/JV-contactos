/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contactos;

/**
 *
 * @author osmar
 */
public class CContacto {
    
    //atributos
    private int numero;
    private String nombre;
    private String correo;
    private String telefono;
    private String direccion;
    private String grupo;
    
    
    //constructor
    public CContacto(){}
    
    // metodos get
    
    public int getNumero(){
        return numero;
    }
    public String getNombre(){
        return nombre;
    }

    public String getCorreo(){
        return correo;
    }
    public String getTelefono(){
        return telefono;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getGrupo(){
        return grupo;
    }
    
    //metodos set
    public void setNumero(int num){
        this.numero = num;
    }
    public void setNombre(String nomb){
        this.nombre = nomb;
    }

    public void setCorreo(String corr){
        this.correo = corr;
    }
    public void setTelefono(String telf){
        this.telefono = telf;
    }
    public void setDireccion(String direc){
        this.direccion = direc;
    }
    public void setGrupo(String grup){
        this.grupo = grup;
    }
    
    
    
}
