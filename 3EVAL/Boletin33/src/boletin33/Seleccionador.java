package boletin33;

/**
 *
 * @author crist
 */
public class Seleccionador extends SeleccionFutbol{
    
    public void seleccionarXogador(){
        System.out.println("Selecciona un xogador");
    }

    public void concentrarse(){
        System.out.println("Concentrarse en seleccionar buenos jugadores");
    }
    public void viajar(){
        System.out.println("Viaxa para buscar jugarores");
    }
    
    public void entrenar(){
        System.out.println("No entrena");
    }
    
    public void jugarPartido(){
        System.out.println("No juega los partidos");
    }
    
    public String toString(){
        return super.toString();
    }
    
    
}
