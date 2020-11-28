/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author AxelHOOLIC
 */
public class Alumno {
    private int id;
    private String Nombre;
    private String Apellido;
    private int Nota1;
    private int Nota2;
    private float Promedio;

    public Alumno(int id, String Nombre, String Apellido, int Nota1, int Nota2, float Promedio) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Nota1 = Nota1;
        this.Nota2 = Nota2;
        this.Promedio = Promedio;
    }

    public Alumno() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getNota1() {
        return Nota1;
    }

    public void setNota1(int Nota1) {
        this.Nota1 = Nota1;
    }

    public int getNota2() {
        return Nota2;
    }

    public void setNota2(int Nota2) {
        this.Nota2 = Nota2;
    }

    public float getPromedio() {
        return Promedio;
    }

    public void setPromedio(float Promedio) {
        this.Promedio = Promedio;
    }

    
}
