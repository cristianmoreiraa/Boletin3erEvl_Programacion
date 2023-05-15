package boletin33;

import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class Entrenador extends SeleccionFutbol{
    
    private Integer idFederacion;
    
    
    public void concentrarse() {
        System.out.println("Concentra aos futbolistas");
    }

    
    public void viajar() {
        System.out.println("Viaxa o entrenador");
    }

    
    public void entrenar() {
        System.out.println("O entrenador entrena aos futbolistas");
    }

    
    public void jugarPartido() {
        System.out.println("O entrenador dirixe aos futbolistas no partido");
    }
    
    public void planificarEntrenamiento(){
        System.out.println("O entrenador planifica os entrenamientos");
    }

    @Override
    public String toString() {
        return super.toString() + ", idFederacion=" + idFederacion;
    }
    
   
   
 
}
