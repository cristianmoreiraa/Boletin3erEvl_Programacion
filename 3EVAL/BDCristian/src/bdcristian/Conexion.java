package bdcristian;


import java.sql.Connection;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author crist
 */
public class Conexion {
    String bd="notasalumnos";
    String url="jdbc:mysql://localhost:3306/";
    String user="root";
    String password="";
    String driver="com.mysql.cj.jdbc.Driver";
    Connection cx;

    public Conexion() {
        this.cx = cx;
    }
    
    public Connection conectar(){
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            cx = (Connection) DriverManager.getConnection(url+bd, user, password);
            JOptionPane.showMessageDialog(null, "Se ha conectado a '"+bd+"' con exito.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se ha conectado con la base de datos.");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cx;
    }
    
    public Connection getConnection(){
        return cx;
    }

    public Connection conectar1(){
    try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            cx = (Connection) DriverManager.getConnection(url+bd, user, password);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se ha conectado con la base de datos.");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cx;
        
        }

        public void cerrarConexion(){
        //devuelvo un String por la misma razón que antes
        try{
            cx.close();//Cerrar la conexión
            JOptionPane.showMessageDialog(null, "Desconexión exitosa");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Desconexión errónea");
        }
    }
    } 

