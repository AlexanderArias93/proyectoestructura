/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularecuacioncuadratica;

import java.awt.Image;
import java.text.DecimalFormat;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class EcuacionCuadratica extends javax.swing.JFrame {

    Icon imagenRaiz;   //Esta es la imagen utilizada en el Joptionpane del discriminante negativo
    public EcuacionCuadratica() {
        initComponents();
        //Ubicar el formulario al centro de la pantalla
          this.setLocationRelativeTo(null);
        //Código para ajustar Margen al label
        ImageIcon fondo = new ImageIcon("src/Fondo.jpg");
        Icon icono = new ImageIcon (fondo.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_DEFAULT));
        lblFondo.setIcon(icono);
        this.repaint();
        imagenRaiz = new ImageIcon("src\\raiz.png");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblDigiteA = new javax.swing.JLabel();
        lblDigiteB = new javax.swing.JLabel();
        lblDigiteC = new javax.swing.JLabel();
        txtDigiteA = new javax.swing.JTextField();
        txtDigiteB = new javax.swing.JTextField();
        txtDigiteC = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblEquisUno = new javax.swing.JLabel();
        lblEquisDos = new javax.swing.JLabel();
        lblResultadoUno = new javax.swing.JLabel();
        lblResultadoDos = new javax.swing.JLabel();
        lblPrimeResultado = new javax.swing.JLabel();
        lblSegundoResultado = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calcular ecuación cuadrática");
        setFont(new java.awt.Font("JasmineUPC", 1, 24)); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(555, 320));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTitulo.setText("ECUACIÓN CUADRÁTICA");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 250, 25));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos a calcular", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        lblDigiteA.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDigiteA.setText("A =");

        lblDigiteB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDigiteB.setText("B =");

        lblDigiteC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDigiteC.setText("C =");
        lblDigiteC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblDigiteCKeyReleased(evt);
            }
        });

        txtDigiteA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDigiteAActionPerformed(evt);
            }
        });

        txtDigiteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDigiteBActionPerformed(evt);
            }
        });

        txtDigiteC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDigiteCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblDigiteA)
                        .addGap(18, 18, 18)
                        .addComponent(txtDigiteA, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblDigiteB)
                        .addGap(18, 18, 18)
                        .addComponent(txtDigiteB))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblDigiteC)
                        .addGap(18, 18, 18)
                        .addComponent(txtDigiteC)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDigiteA)
                    .addComponent(txtDigiteA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDigiteB)
                    .addComponent(txtDigiteB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDigiteC)
                    .addComponent(txtDigiteC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 111, -1, -1));

        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Calcular.png"))); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 111, -1, 47));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        lblEquisUno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblEquisUno.setText("X1 =");

        lblEquisDos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblEquisDos.setText("X2 =");

        lblPrimeResultado.setBackground(new java.awt.Color(0, 0, 0));
        lblPrimeResultado.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPrimeResultado.setForeground(new java.awt.Color(0, 51, 0));
        lblPrimeResultado.setText("         ");
        lblPrimeResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblSegundoResultado.setBackground(new java.awt.Color(0, 0, 0));
        lblSegundoResultado.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSegundoResultado.setForeground(new java.awt.Color(102, 0, 0));
        lblSegundoResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEquisDos)
                        .addGap(18, 18, 18)
                        .addComponent(lblSegundoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEquisUno)
                        .addGap(18, 18, 18)
                        .addComponent(lblPrimeResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResultadoUno, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblResultadoDos, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEquisUno)
                    .addComponent(lblResultadoUno, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrimeResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEquisDos)
                    .addComponent(lblResultadoDos)
                    .addComponent(lblSegundoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 111, -1, -1));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 170, 113, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 224, 113, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form.gif"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 37, 135, 56));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo.jpg"))); // NOI18N
        lblFondo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblFondoKeyReleased(evt);
            }
        });
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        //Declarar variables
        double a ;
        double b ;
        double c ;
        double discriminante;
        
        DecimalFormat d = new DecimalFormat("####");
        double xUno;
        double xDos;
  
        
    //valido los campos vacios
    if(txtDigiteA.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Debe ingresar el valor de A");
    txtDigiteA.requestFocus();
    return;
    }
    if(txtDigiteA.getText().equals("0")){
    JOptionPane.showMessageDialog(null, "El índice con el primer sumando de la ecuación no puede equivaler a cero, cámbialo e intente otra vez.");
    txtDigiteA.requestFocus();
    return;
    }
    if(txtDigiteB.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Debe ingresar el valor de B");
    txtDigiteB.requestFocus();
    return;
    }
    if (txtDigiteC.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Debe ingresar el valor de C");
    txtDigiteC.requestFocus();
    return;
    }
    
    // Asignación de elementos gráficos a las variables
     a = Double.parseDouble(txtDigiteA.getText());
     b = Double.parseDouble(txtDigiteB.getText());
     c = Double.parseDouble(txtDigiteC.getText());
      
     //Discriminante
        discriminante=(Math.pow(b, 2)-(4*a*c));

        if(discriminante >=0){
            xUno=((-b)+Math.sqrt(discriminante))/(2*a);
            xDos=((-b)-Math.sqrt(discriminante))/(2*a);
            
            lblPrimeResultado.setText("" + d.format(xUno));
            lblPrimeResultado.requestFocus();
            lblSegundoResultado.setText("" + d.format(xDos));
            lblSegundoResultado.requestFocus();
           
        }else if(discriminante<0){

              JOptionPane.showMessageDialog(null,(discriminante) +  ", El discriminante es negativo, no tiene solución real.\n La solución se encuentra en el conjunto de los números complejos.","",JOptionPane.WIDTH,imagenRaiz);
         }
    
         
    }//GEN-LAST:event_btnCalcularActionPerformed

        
    private void txtDigiteAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDigiteAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDigiteAActionPerformed

    private void txtDigiteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDigiteBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDigiteBActionPerformed
     
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // Proceso para limpiar datos generales
        txtDigiteA.setText("");
        txtDigiteB.setText("");
        txtDigiteC.setText("");
        lblPrimeResultado.setText("");
        lblSegundoResultado.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void lblFondoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblFondoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lblFondoKeyReleased

    private void lblDigiteCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblDigiteCKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lblDigiteCKeyReleased

    private void txtDigiteCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDigiteCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDigiteCActionPerformed

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
            java.util.logging.Logger.getLogger(EcuacionCuadratica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EcuacionCuadratica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EcuacionCuadratica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EcuacionCuadratica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EcuacionCuadratica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDigiteA;
    private javax.swing.JLabel lblDigiteB;
    private javax.swing.JLabel lblDigiteC;
    private javax.swing.JLabel lblEquisDos;
    private javax.swing.JLabel lblEquisUno;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblPrimeResultado;
    private javax.swing.JLabel lblResultadoDos;
    private javax.swing.JLabel lblResultadoUno;
    private javax.swing.JLabel lblSegundoResultado;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtDigiteA;
    private javax.swing.JTextField txtDigiteB;
    private javax.swing.JTextField txtDigiteC;
    // End of variables declaration//GEN-END:variables
}
