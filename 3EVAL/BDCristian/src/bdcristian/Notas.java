
package bdcristian;

import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class Notas {
    public void notasAlumnos(){
        
        //pedir cantidad de alumnos
        int numeroAl = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de alumnos que hay en DAM1"));
        
        
        String[][] datosAlumnos =  new String[numeroAl][4];
        
        //pedimos el nombre y las notas de cada alumno
        for (int i = 0; i < numeroAl; i++){
            String nombre = JOptionPane.showInputDialog("Introduce el nombre del alumno: ");
            String nota1 = JOptionPane.showInputDialog("Introduce la nota del PRIMER trimestre: ");
            String nota2 = JOptionPane.showInputDialog("Introduce la nota del SEGUNDO trimestre: ");
            String nota3 = JOptionPane.showInputDialog("Introduce la nota del TERCER trimestre: ");
            
        //guardamos los datos anteriores
            datosAlumnos[i][0] = nombre;
            datosAlumnos[i][1] = nota1;
            datosAlumnos[i][2] = nota2;
            datosAlumnos[i][3] = nota3;
        }
        
        //mostramos los datos de los alumnos
            for(int i = 0; i < numeroAl; i++){
                String nombre = datosAlumnos[i][0];
                String nota1 = datosAlumnos[i][1];
                String nota2 = datosAlumnos[i][2];
                String nota3 = datosAlumnos[i][3];
                
                JOptionPane.showMessageDialog(null,"Alumno: " + nombre + "\n" + "Nota 1erT: " + nota1 + "\n" + "Nota 2doT: " + nota2 + "\n" + "Nota 3erT: " + nota3);
            }
    
    while (true) {
        String nombreBuscar = JOptionPane.showInputDialog("Introduce el nombre del alumno que deseas buscar.\nSi no deseas buscar a nadie pulsa cancelar");
        if (nombreBuscar == null){
            JOptionPane.showMessageDialog(null, "Operacion cancelada");
            return;
        }

        String[] notasAlumno = buscarAlumno(datosAlumnos, nombreBuscar);

        if (notasAlumno != null){
            JOptionPane.showMessageDialog(null, "Nombre: " + nombreBuscar
                    + "\n Nota 1erT: " + notasAlumno[0]
                    + "\n Nota 2doT: " + notasAlumno[1]
                    + "\n Nota 3erT: " + notasAlumno[2]);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró al alumno con nombre " + nombreBuscar);
        }

        int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas buscar otro alumno?");
        if (respuesta != JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Operacion finalizada");
            return;
        }
    }
}
    
        private String[] buscarAlumno(String[][] datosAlumnos, String nombreBuscar) {
            for (String[] alumno : datosAlumnos) {
                if (alumno[0].equalsIgnoreCase(nombreBuscar)) {
                    return new String[]{alumno[1], alumno[2], alumno[3]};
            }
           }
            return null;
  
    }

}

