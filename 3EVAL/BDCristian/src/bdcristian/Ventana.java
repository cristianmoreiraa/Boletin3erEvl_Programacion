/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bdcristian;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author crist
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
   int num1, num2, num3;
   String nombre;
   
   Conexion con1 = new Conexion();
   Connection conet;
    public Ventana() {
        
        initComponents();
        JOptionPane.showMessageDialog(null, "Ten en cuenta que cada datos que metas a la tabla y desees subir\n"
                + "deberás darle a *Update* y luego a *Mostrar* para que te aperezca\n en la tabla.");
        setLocationRelativeTo(null);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bAñadir = new javax.swing.JButton();
        bBorrar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        bConectar = new javax.swing.JButton();
        jNombre = new javax.swing.JLabel();
        j1erT = new javax.swing.JLabel();
        j2doT = new javax.swing.JLabel();
        j3erT = new javax.swing.JLabel();
        t3erT = new javax.swing.JTextField();
        t2doT = new javax.swing.JTextField();
        t1erT = new javax.swing.JTextField();
        tNombre = new javax.swing.JTextField();
        tNotafinal = new javax.swing.JTextField();
        bNotaFinal = new javax.swing.JButton();
        bAñadir1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        bConectar1 = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        bMostrar = new javax.swing.JButton();
        bEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("NOTAS DAM");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 300, 60));

        bAñadir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bAñadir.setText("Añadir");
        bAñadir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAñadirActionPerformed(evt);
            }
        });
        jPanel1.add(bAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 610, 140, 90));

        bBorrar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bBorrar.setText("Borrar");
        bBorrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(bBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 610, 140, 90));

        bSalir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bSalir.setText("Salir");
        bSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });
        jPanel1.add(bSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 610, 140, 90));

        bConectar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bConectar.setText("Conectar");
        bConectar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        bConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConectarActionPerformed(evt);
            }
        });
        jPanel1.add(bConectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 180, 80));

        jNombre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jNombre.setText("Nombre:");
        jPanel1.add(jNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 100, 70));

        j1erT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        j1erT.setText("1er Trimestre");
        jPanel1.add(j1erT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 160, 70));

        j2doT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        j2doT.setText("2do Trimestre");
        jPanel1.add(j2doT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 160, 70));

        j3erT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        j3erT.setText("3er Trimestre");
        jPanel1.add(j3erT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 160, 70));

        t3erT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3erTActionPerformed(evt);
            }
        });
        jPanel1.add(t3erT, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 270, 40));

        t2doT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2doTActionPerformed(evt);
            }
        });
        jPanel1.add(t2doT, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 270, 40));

        t1erT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1erTActionPerformed(evt);
            }
        });
        jPanel1.add(t1erT, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 270, 40));

        tNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNombreActionPerformed(evt);
            }
        });
        jPanel1.add(tNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 270, 40));

        tNotafinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNotafinalActionPerformed(evt);
            }
        });
        jPanel1.add(tNotafinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 270, 40));

        bNotaFinal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bNotaFinal.setText("Nota Final");
        bNotaFinal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bNotaFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNotaFinalActionPerformed(evt);
            }
        });
        jPanel1.add(bNotaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 150, 60));

        bAñadir1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bAñadir1.setText("Nuevo");
        bAñadir1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bAñadir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAñadir1ActionPerformed(evt);
            }
        });
        jPanel1.add(bAñadir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 610, 140, 90));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tabla.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabla.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Nota1", " Nota2", "Nota3", "NotaFinal"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 620, 280));

        bConectar1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bConectar1.setText("Update");
        bConectar1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        bConectar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConectar1ActionPerformed(evt);
            }
        });
        jPanel1.add(bConectar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 180, 80));

        bEliminar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bEliminar.setText("Eliminar");
        bEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(bEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 610, 140, 90));

        bMostrar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bMostrar.setText("Mostrar");
        bMostrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(bMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 730, 140, 90));

        bEditar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bEditar.setText("Editar");
        bEditar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });
        jPanel1.add(bEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 730, 140, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAñadirActionPerformed
        Object[] fila = {tNombre.getText(),t1erT.getText(), t2doT.getText(),t3erT.getText(),tNotafinal.getText()};
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.addRow(fila);
    }//GEN-LAST:event_bAñadirActionPerformed

    private void bBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarActionPerformed
        t1erT.setText("");
        t2doT.setText("");
        t3erT.setText("");
        tNombre.setText("");
        tNotafinal.setText("");
    }//GEN-LAST:event_bBorrarActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        System.exit(3);
        JOptionPane.showMessageDialog(null, "Se va a cerrar las NotasDAM");
        
    }//GEN-LAST:event_bSalirActionPerformed

    private void bConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConectarActionPerformed
        Conexion bConectar =  new Conexion();
            bConectar.conectar();
    }//GEN-LAST:event_bConectarActionPerformed

    private void t1erTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1erTActionPerformed
        evt.getActionCommand();
        int num1 = Integer.parseInt(t1erT.getText());
       
    }//GEN-LAST:event_t1erTActionPerformed

    private void t2doTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2doTActionPerformed
        evt.getActionCommand();
        int num2 = Integer.parseInt(t2doT.getText());
    }//GEN-LAST:event_t2doTActionPerformed

    private void tNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNombreActionPerformed
        nombre = tNombre.getText();
    }//GEN-LAST:event_tNombreActionPerformed

    private void tNotafinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNotafinalActionPerformed
        
    }//GEN-LAST:event_tNotafinalActionPerformed

    private void t3erTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3erTActionPerformed
        
    }//GEN-LAST:event_t3erTActionPerformed

    private void bNotaFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNotaFinalActionPerformed
        num1 = Integer.parseInt(t1erT.getText());
        num2 = Integer.parseInt(t2doT.getText());
        num3 = Integer.parseInt(t3erT.getText());
        int Notafinal = ((num1+num2+num3)/3);
        tNotafinal.setText(String.valueOf(Notafinal));
    }//GEN-LAST:event_bNotaFinalActionPerformed

    private void bAñadir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAñadir1ActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas añadir un nuevo alumno?");
            if(respuesta != JOptionPane.NO_OPTION){
                t1erT.setText("");
                t2doT.setText("");
                t3erT.setText("");
                tNombre.setText("");
                tNotafinal.setText("");
}
    }//GEN-LAST:event_bAñadir1ActionPerformed

    private void bConectar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConectar1ActionPerformed
        subirDatos();
    }//GEN-LAST:event_bConectar1ActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

    }//GEN-LAST:event_tablaMouseClicked

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
       
        borrarAlumno(tNombre.getText());
    }//GEN-LAST:event_bEliminarActionPerformed

    private void bMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrarActionPerformed
        mostrarDatosTabla(nombre, tabla);
    }//GEN-LAST:event_bMostrarActionPerformed

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
        String nombre = tNombre.getText();
        String nota1 = t1erT.getText();
        String nota2 = t2doT.getText();
        String nota3 = t3erT.getText();
        String Notafinal = tNotafinal.getText();
        
        try {
            Conexion conectar = new Conexion();
            conet = conectar.conectar1(); //se conecta a la base de datos
               // String editado;
                String sql = "UPDATE notas set Nota1 = ?, Nota2 = ?, Nota3 = ?, NotaFinal = ? WHERE Nombre = ?";
                PreparedStatement statement = conet.prepareStatement(sql);
                //.setString(1, nombre);
                statement.setString(1, nota1);
                statement.setString(2, nota2);
                statement.setString(3, nota3);
                statement.setString(4, Notafinal);
                statement.setString(5, nombre);
                
                int filasAfectadas = statement.executeUpdate();
                
                
                    
        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null,"La fila ha sido modificada correctamente.");
        } else {
            JOptionPane.showMessageDialog(null,"No se encontró ninguna fila que editar o estás editando el nombre.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null,"Error al modificar la fila: " + e.getMessage());
    }
        mostrarDatosTabla(nombre, tabla);

    }//GEN-LAST:event_bEditarActionPerformed
int filaseleccionada;
    private void tablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMousePressed
       
     
        //identificamos que fila ha sido seleccionada    
         filaseleccionada = tabla.getSelectedRow();
            
        try {
            this.tNombre.setText(tabla.getValueAt(filaseleccionada, 0).toString());
            this.t1erT.setText(tabla.getValueAt(filaseleccionada, 1).toString());
            this.t2doT.setText(tabla.getValueAt(filaseleccionada, 2).toString());
            this.t3erT.setText(tabla.getValueAt(filaseleccionada, 3).toString());
            this.tNotafinal.setText(tabla.getValueAt(filaseleccionada, 4).toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al intentar realizar esta acción.");
        }
    }//GEN-LAST:event_tablaMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    void subirDatos(){
        String nombre = tNombre.getText();
        String nota1 = t1erT.getText();
        String nota2 = t2doT.getText();
        String nota3 = t3erT.getText();
        String Notafinal = tNotafinal.getText();
        
        try {
            if (nombre.equals("") || nota1.equals("") || nota2.equals("") || nota3.equals("") || Notafinal.equals("")){
                JOptionPane.showMessageDialog(null, "Faltan añadir datos");
            }else{
                Conexion obj = new Conexion();
                String sql = "INSERT INTO notas(Nombre, Nota1, Nota2, Nota3, Notafinal) VALUES ('"+nombre+"','"+nota1+"','"+nota2+"','"+nota3+"','"+Notafinal+"')";
                conet =  (Connection) con1.getConnection();
               // st = conet.createStatement();
                Statement st = obj.conectar1().createStatement();
                st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Los datos han sido subidos correctamente a la base de datos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha fallado al subirse los datos");
        }
    }
    
    void borrarAlumno(String nombre){
        try {
            Conexion obj = new Conexion();
            conet = obj.conectar1();
            String Nombre = JOptionPane.showInputDialog("Introduce el nombre del alumno que deseas borrar: ");
            
            String sql = "DELETE FROM notas WHERE Nombre = ?";
            PreparedStatement statement = conet.prepareStatement(sql);
            //coge con el 1, el primer valor de ? y string es la variable en este caso que queremos meter en el 1
            statement.setString(1, Nombre);
            int change = statement.executeUpdate();
            if (change > 0) {
                JOptionPane.showMessageDialog(null,"La fila ha sido eliminada correctamente.");
                    } else {
                JOptionPane.showMessageDialog(null,"No se ha podido borrar el alumno.");
                }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Algo ha ido mal.");
        }
            try {
                mostrarDatosTabla(nombre, tabla);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo ha ido mal");
        }
    }
    
    void mostrarDatosTabla(String nombreTabla, javax.swing.JTable tabla) {
    try {
        Conexion obj = new Conexion();
        conet = obj.conectar1();
        // Obtener los datos de la tabla
        String sql = "SELECT * FROM notas" ;
        Statement statement = conet.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        // Crear el modelo de la tabla
        DefaultTableModel tableModel = new DefaultTableModel();

        // Obtener metadatos de la consulta
        int columnCount = resultSet.getMetaData().getColumnCount();
        for (int i = 1; i <= columnCount; i++) {
            tableModel.addColumn(resultSet.getMetaData().getColumnLabel(i));
        }

        // Agregar filas a la tabla con los datos de la consulta
        while (resultSet.next()) {
            Object[] row = new Object[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                row[i - 1] = resultSet.getObject(i);
            }
            tableModel.addRow(row);
        }
        
        JOptionPane.showMessageDialog(null, "Se ha actualizado la tabla");

        // Asignar el modelo a la tabla
        tabla.setModel(tableModel);
            } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al mostrar los datos de la tabla");
    }
     
    
   
}
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAñadir;
    private javax.swing.JButton bAñadir1;
    private javax.swing.JButton bBorrar;
    private javax.swing.JButton bConectar;
    private javax.swing.JButton bConectar1;
    private javax.swing.JButton bEditar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bMostrar;
    private javax.swing.JButton bNotaFinal;
    private javax.swing.JButton bSalir;
    private javax.swing.JLabel j1erT;
    private javax.swing.JLabel j2doT;
    private javax.swing.JLabel j3erT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t1erT;
    private javax.swing.JTextField t2doT;
    private javax.swing.JTextField t3erT;
    private javax.swing.JTextField tNombre;
    private javax.swing.JTextField tNotafinal;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
