/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import MODELO.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author river
 */
public class AccionesUsuario {
    
    public static int registrarUsuario(Usuario e){
        int estatus=0;
        try{
            Connection con=Conexion.getConnection();
            String q="insert into usuarios(nombre, contra, puesto, sueldo)"
                    + "values(?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(q);
            ps.setString(1,e.getNombre());
            ps.setString(2,e.getContraseña());
            ps.setString(3,e.getPuesto());
            ps.setInt(4,e.getSueldo());
            
            estatus=ps.executeUpdate();
            System.out.println("Registro exitoso");
            con.close();
            
        }catch(Exception ed){
            System.out.println("Error al registrar");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }
    
     public static List<Usuario>  getAllUsuarios(){
        List<Usuario> lista= new ArrayList<Usuario>();
        try{
            Connection con=Conexion.getConnection();
            String q="select * from usuarios";
            PreparedStatement ps=con.prepareStatement(q);
            
  
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Usuario b=new Usuario();
                b.setId_usu(rs.getInt(1));
                b.setNombre(rs.getString(2));
                b.setContraseña(rs.getString(3));
                b.setPuesto(rs.getString(4));
                b.setSueldo(rs.getInt(5));
                lista.add(b);
            }
            System.out.println("Se encontro a los usuarios");
            con.close();
            
        }catch(Exception ed){
            System.out.println("Error al buscar");
            System.out.println(ed.getMessage());
        }
        return lista;
    }
    
      public static int buscarUsuarioByContra(Usuario e){
       int estatus= 0;
        try{
            Connection con=Conexion.getConnection();
            String q="select * from usuarios where contra=?";
            PreparedStatement ps=con.prepareStatement(q);
            ps.setString(1, e.getContraseña());
            
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                e.setId_usu(rs.getInt(1));
                e.setNombre(rs.getString(2));
                e.setContraseña(rs.getString(3));
                e.setPuesto(rs.getString(4));
                e.setSueldo(rs.getInt(5));
            }
            System.out.println("Se encontro al Usuario");
            con.close();
            
        }catch(Exception ed){
            System.out.println("Error al buscar");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }
}

