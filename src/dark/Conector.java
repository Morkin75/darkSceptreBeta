package dark;

import static dark.Dark.con;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manueljesusgarcialopez
 */
public class Conector {
    
    //File file = new File("../BBDD/BDDark.db");
    
    //String url = "/Volumes/SecundarioUSB/darkSceptre/BBDD/BDDark.db";
    String url = "../Dark/BBDD/BDDark.db";
    //String url = file.getPath();
    //String url = "..\\SecundarioUSB\\darkSceptre\\BBDD\\BDDark.db";
    Connection connect;

    public Conector() {
    }
    
    public void connect(){
        
        //A ver la ruta:
        //System.out.println(file.getAbsolutePath());
        //System.out.println(file.getPath());
        
 try {
     connect = DriverManager.getConnection("jdbc:sqlite:"+url);
     if (connect!=null) {
         System.out.println("Conectado");
     }
 }catch (SQLException ex) {
     System.err.println("No se ha podido conectar a la base de datos\n"+ex.getMessage());
 }
}
 public void close(){
        try {
            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
 
 public void mostrarAcciones(){
        ResultSet result = null;
        try {
            PreparedStatement st;
            st = con.connect.prepareStatement("Select * FROM Acciones");
            result = st.executeQuery();
            while (result.next()) {
                
            // Se crea un array que será una de las filas de la tabla. 
            Object [] fila = new Object[3]; // Hay tres columnas en la tabla

            // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.
            for (int i=0;i<3;i++)
                fila[i] = result.getObject(i+1); // El primer indice en rs es el 1, no el cero, por eso se suma 1.

            // Se añade al modelo la fila completa.
            Dark.ventanaInicio.acciones.addRow(fila);
            //modelo.addRow(fila); 
                
                
                //System.out.print("ID: ");
                //System.out.println(result.getInt("ID"));
 
                //System.out.print("Accion: ");
                //System.out.println(result.getString("Accion"));
 
                //System.out.print("Descripción: ");
                //System.out.println(result.getString("Descripcion"));
 
                //System.out.println("=======================");
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
 
    
}
