package entidades;

import java.util.GregorianCalendar;

/**
 *
 * @author NSteuerberg
 */
public class EDestajo extends Empleado{
    
    private int numeroClientesCaptados;
    private float complementoClienteCaptado;
    
    public EDestajo(String DNI, String nome, String apelidos, GregorianCalendar e, int clientesCaptados, float complemento) {
        super(DNI, nome, apelidos, e);
        this.numeroClientesCaptados = clientesCaptados;
        this.complementoClienteCaptado = complemento;
    }

    @Override
    public String toString() {
        return "EDestajo{" + "numeroClientesCaptados=" + numeroClientesCaptados + ", complementoClienteCaptado=" + complementoClienteCaptado + '}';
    }
    
    
}