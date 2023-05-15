package boletin33;

/**
 *
 * @author crist
 */
public class Futbolista extends SeleccionFutbol{
    
    private Integer dorsal;
    private String demarcacion;
    
    
    public void concentrarse() {
        System.out.println("concentrase o futbolista");
    }

    
    public void viajar() {
        System.out.println("Viaxa o futbolista");
    }

    
    public void entrenar() {
        System.out.println("entrena o futbolista");
    }

    
    public void jugarPartido() {
        System.out.println("juega o futbolista");
    }
    
    public void entrevista(){
        System.out.println("entrevistan al futbolista");
    }

    @Override
    public String toString() {
        return super.toString() + ", dorsal=" + dorsal + ", demarcacion=" + demarcacion;
    }
    
}
