/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Modelo.Alumno;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AxelHOOLIC
 */
public class AlumnoDAO implements Interface{

    @Override
    public List<Alumno> getAlumno() {
        List<Alumno>alumnos=new ArrayList<>();
        String sql="select * from alumno";
        try {
            PreparedStatement ps=Conexion.Conectar().prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Alumno a = new Alumno();
                a.setId(rs.getInt(1));
                a.setNombre(rs.getString(2));
                a.setApellido(rs.getString(3));
                a.setNota1(rs.getInt(4));
                a.setNota2(rs.getInt(5));
                a.setPromedio(rs.getFloat(6));
                alumnos.add(a);
            }
        } catch (Exception e) {
            System.out.println("error: " + e);
        }return alumnos;
    }

    @Override
    public Alumno getId(int id) {
        String sql="select * from alumno where id=?";
        Alumno alumno=new Alumno();
        try {
            PreparedStatement ps=Conexion.Conectar().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                alumno.setId(rs.getInt(1));
                alumno.setNombre(rs.getString(2));
                alumno.setApellido(rs.getString(3));
                alumno.setNota1(rs.getInt(4));
                alumno.setNota2(rs.getInt(5));
                alumno.setPromedio(rs.getFloat(6));
            }
        } catch (Exception e) {
            System.out.println("error: " + e);
        }return alumno;
    }

    @Override
    public int add(Alumno a) {
        int resultado=0;
        String sql="insert into alumno(nombre, apellido, nota1, nota2, promedio) values (?,?,?,?,?)";
        try {
            PreparedStatement ps=Conexion.Conectar().prepareStatement(sql);
            ps.setString(1, a.getNombre());
            ps.setString(2, a.getApellido());
            ps.setInt(3, a.getNota1());
            ps.setInt(4, a.getNota2());
            ps.setFloat(5, a.getPromedio());
            resultado=ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("error al agregar: " + e);
        }return resultado;
    }

    @Override
    public int delete(int id) {
        int resultado=0;
        String sql="delete from alumno where id=" + id;
        try {
            PreparedStatement ps=Conexion.Conectar().prepareStatement(sql);
            resultado=ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("error al eliminar: " + e);
        }return resultado;
    }
    
}
