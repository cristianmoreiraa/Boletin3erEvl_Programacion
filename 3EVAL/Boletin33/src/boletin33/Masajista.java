package boletin33;

/**
 *
 * @author crist
 */
public class Masajista extends SeleccionFutbol{
    
    private String titulacion;
    private int aniosExperiencia;
    
    public void concentrarse(){
       System.out.println("El masajista se concentra");
    }

    
    public void viajar() {
        System.out.println("El masajista viaja");
    }

    public void entrenar() {
        System.out.println("El masajista entrena los masajes");
    }

    
    public void jugarPartido() {
        System.out.println("O masajista no juega los partidos");
    }
    
    public void darMensaje(){
        System.out.println("O masajista da un masaje");
    }
    
    @Override
    public String toString() {
        return super.toString() + ", titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia;
    }
    
    
    
}
