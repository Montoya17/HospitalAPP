/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package autonoma.HospitalApp.views;

import autonoma.HospitalApp.models.Empleado;
import autonoma.HospitalApp.models.EmpleadoSalud;
import autonoma.HospitalApp.models.Hospital;
import java.awt.Frame;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author solis
 */
public class AgregarEmpleado extends javax.swing.JDialog {

    private Hospital hospital;
    private VentanaPrincipal ventanaPrincipal;

    /**
     * Creates new form AgregarEmpleado
     */
    public AgregarEmpleado(java.awt.Frame parent, boolean modal, Hospital hospital, VentanaPrincipal ventanaPrincipal) {
        super(parent, modal);
        initComponents();
        setResizable(false);
        this.setLocationRelativeTo(null);
        try {
            this.setIconImage(new ImageIcon(getClass().getResource("/autonoma/HospiatalApp/images/hospital.png")).getImage());
        } catch (Exception e) {
        }
        this.hospital = hospital;
        this.ventanaPrincipal = ventanaPrincipal;
    }
    
    /**
     * creamos el metodo para poder guardar el empleado en el archivo de texto
     * @param emp 
     */

    private void guardarEmpleadoEnArchivo(EmpleadoSalud emp) {
        try (FileWriter fw = new FileWriter("empleados.txt", true); BufferedWriter bw = new BufferedWriter(fw); PrintWriter out = new PrintWriter(bw)) {

            out.println("SALUD;" + emp.getNombre() + ";" + emp.getId() + ";" + emp.getEdad() + ";"
                    + emp.getCarrera() + ";" + emp.getSalarioBase() + ";" + emp.getHorasTrabajadas());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar el archivo ");
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtNumerodocumento = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtHorastrabajadas = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        brnAgregar1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtEspecialidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSalarioBase = new javax.swing.JTextField();
        btnAgregarempleado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        jLabel1.setText("Agregar Empleado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(340, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(356, 356, 356))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel2.setText("Nombre:");

        jLabel3.setText("Numero de documento:");

        jLabel4.setText("Edad:");

        jLabel5.setText("Salario base");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtNumerodocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumerodocumentoActionPerformed(evt);
            }
        });

        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });

        txtHorastrabajadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorastrabajadasActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        brnAgregar1.setText("Agregar");
        brnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnAgregar1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Horas Trabajadas:");

        txtEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEspecialidadActionPerformed(evt);
            }
        });

        jLabel7.setText("Especialidad:");

        btnAgregarempleado.setText("Ver empleados");
        btnAgregarempleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarempleadoMouseClicked(evt);
            }
        });
        btnAgregarempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarempleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(brnAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNombre)
                    .addComponent(txtNumerodocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                    .addComponent(txtEdad)
                    .addComponent(txtEspecialidad)
                    .addComponent(txtHorastrabajadas, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                    .addComponent(txtSalarioBase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarempleado)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNumerodocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAgregarempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSalarioBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtHorastrabajadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brnAgregar1)
                    .addComponent(btnVolver))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNumerodocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumerodocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumerodocumentoActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void brnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnAgregar1ActionPerformed
        String nombre = txtNombre.getText().trim();
        String numeroDocumento = txtNumerodocumento.getText().trim();
        String edad = txtEdad.getText().trim();
        String especialidad = txtEspecialidad.getText().trim();
        String salarioBase = txtSalarioBase.getText().trim();
        String horasTrabajadas = txtHorastrabajadas.getText().trim();
        
        /**
         * convertimos avalores numericos
         */

        int edadNum = Integer.parseInt(txtEdad.getText().trim());
        double salarioBaseNum = Double.parseDouble(txtSalarioBase.getText().trim());
        int horasTrabajadasNum = Integer.parseInt(txtHorastrabajadas.getText().trim());

        /**
         * validamos que los campos estan con informacion
         */
        if (nombre.isEmpty() || nombre.isEmpty() || numeroDocumento.isEmpty() || edad.isEmpty() || especialidad.isEmpty() || salarioBase.isEmpty() || horasTrabajadas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos de texto");
            return;
        }

        try {

            // Creamosa al empleado Salud
            EmpleadoSalud emp = new EmpleadoSalud(nombre, Integer.parseInt(numeroDocumento), edadNum, salarioBaseNum, especialidad, horasTrabajadasNum);

            if (hospital.agregarEmpleado(emp)) {
                hospital.guardarEmpleadoSalud(emp, "empleadosSalud.txt");
                JOptionPane.showMessageDialog(this, "Empleado agregado con éxito ");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Error al agregar el empleado");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese los datos numéricos correctamente");
        }
        
        


    }//GEN-LAST:event_brnAgregar1ActionPerformed

    private void txtHorastrabajadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorastrabajadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorastrabajadasActionPerformed

    private void txtEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEspecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEspecialidadActionPerformed

    private void btnAgregarempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarempleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarempleadoActionPerformed

    private void btnAgregarempleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarempleadoMouseClicked
        ListaEmpleado VentanaListaEmpleado;
       VentanaListaEmpleado = new ListaEmpleado((Frame)this.getParent(), true, this.hospital, this);
       VentanaListaEmpleado.setVisible(true);
    }//GEN-LAST:event_btnAgregarempleadoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnAgregar1;
    private javax.swing.JButton btnAgregarempleado;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtHorastrabajadas;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumerodocumento;
    private javax.swing.JTextField txtSalarioBase;
    // End of variables declaration//GEN-END:variables
}
