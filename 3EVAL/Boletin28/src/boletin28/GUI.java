
package boletin28;

import javax.swing.*;

/**
 *
 * @author crist
 */
public class GUI {
    
    JFrame marco;
    JPanel panel;
    JLabel etiqueta1,etiqueta2;
    JTextField lTexto1;
    JPasswordField pass;    //para que lo ponga como una contraseña
    JTextArea aTexto;
    JButton bCopiar, bSalir;
    
    public void iniciarComponentes(){
        marco =  new JFrame(" Componentes ");
        panel = new JPanel();
        etiqueta1 = new JLabel("NAME");
        lTexto1 = new JTextField();
        etiqueta2 = new JLabel("PASSWORD");
        pass = new JPasswordField();  //para que aparezca como una contraseña
        aTexto = new JTextArea("Area de texto");
        bCopiar= new JButton("PREMER");
        bSalir = new JButton("LIMPAR");
        
        //caracteristicas
        marco.setBounds(0, 0, 800, 800);
        panel.setBounds(5, 5, 750, 750);
        etiqueta1.setBounds(100, 100, 100, 50);
        lTexto1.setBounds(400, 100, 200, 50);
        etiqueta2.setBounds(100, 160, 100, 50);
        pass.setBounds(400, 160, 200, 50);
        aTexto.setBounds(150, 230, 500, 300);
        bCopiar.setBounds(100, 600, 250, 100);
        bSalir.setBounds(425, 600, 250, 100);
        
        //añadimos componentes al panel
        panel.setLayout(null);
        panel.add(etiqueta1);
        panel.add(lTexto1);
        panel.add(etiqueta2);   
        panel.add(pass);
        panel.add(aTexto);
        panel.add(bCopiar);
        panel.add(bSalir);
        marco.add(panel);
        marco.setDefaultCloseOperation(3);  //para que se cierre
        marco.setVisible(true); //para q se vea
    }
}
