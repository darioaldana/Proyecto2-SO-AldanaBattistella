/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.aldanabattistella;

/**
 *
 * @author dario
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        slider = new javax.swing.JSlider();
        jButton1 = new javax.swing.JButton();
        panLambo = new javax.swing.JPanel();
        lamboTitle = new javax.swing.JLabel();
        lblLamboNivel1 = new javax.swing.JLabel();
        lblLamboNivel2 = new javax.swing.JLabel();
        lblLamboNivel3 = new javax.swing.JLabel();
        lblLamboRefuerzo = new javax.swing.JLabel();
        txtArSPLamboRefuerzo = new javax.swing.JScrollPane();
        txtArLamboRefuerzo = new javax.swing.JTextArea();
        txtArSPLambo3 = new javax.swing.JScrollPane();
        txtArLambo3 = new javax.swing.JTextArea();
        txtArSPLambo2 = new javax.swing.JScrollPane();
        txtArLambo2 = new javax.swing.JTextArea();
        txtArSPLambo1 = new javax.swing.JScrollPane();
        txtArLambo1 = new javax.swing.JTextArea();
        panBugatti = new javax.swing.JPanel();
        bugattiTitle = new javax.swing.JLabel();
        lblBugattiNivel1 = new javax.swing.JLabel();
        lblBugattiNivel2 = new javax.swing.JLabel();
        lblBugattiNivel3 = new javax.swing.JLabel();
        lblBugattiRefuerzo = new javax.swing.JLabel();
        txtArSPBugatti1 = new javax.swing.JScrollPane();
        txtArBugatti1 = new javax.swing.JTextArea();
        txtArSPBugatti2 = new javax.swing.JScrollPane();
        txtArBugatti2 = new javax.swing.JTextArea();
        txtArSPBugatti3 = new javax.swing.JScrollPane();
        txtArBugatti3 = new javax.swing.JTextArea();
        txtArSPBugattiRefuerzo = new javax.swing.JScrollPane();
        txtArBugattiRefuerzo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(slider, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, -1, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, -1, -1));

        panLambo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lamboTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lamboTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lamboTitle.setText("Lamborghini");
        panLambo.add(lamboTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, -1));

        lblLamboNivel1.setText("Nivel 1");
        panLambo.add(lblLamboNivel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        lblLamboNivel2.setText("Nivel 2");
        panLambo.add(lblLamboNivel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        lblLamboNivel3.setText("Nivel 3");
        panLambo.add(lblLamboNivel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        lblLamboRefuerzo.setText("Refuerzo");
        panLambo.add(lblLamboRefuerzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        txtArSPLamboRefuerzo.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtArLamboRefuerzo.setEditable(false);
        txtArLamboRefuerzo.setColumns(20);
        txtArLamboRefuerzo.setLineWrap(true);
        txtArLamboRefuerzo.setRows(5);
        txtArLamboRefuerzo.setPreferredSize(new java.awt.Dimension(80, 45));
        txtArSPLamboRefuerzo.setViewportView(txtArLamboRefuerzo);

        panLambo.add(txtArSPLamboRefuerzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 190, 40));

        txtArSPLambo3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtArLambo3.setEditable(false);
        txtArLambo3.setColumns(20);
        txtArLambo3.setLineWrap(true);
        txtArLambo3.setRows(5);
        txtArLambo3.setPreferredSize(new java.awt.Dimension(80, 45));
        txtArSPLambo3.setViewportView(txtArLambo3);

        panLambo.add(txtArSPLambo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 190, 40));

        txtArSPLambo2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtArLambo2.setEditable(false);
        txtArLambo2.setColumns(20);
        txtArLambo2.setLineWrap(true);
        txtArLambo2.setRows(5);
        txtArLambo2.setPreferredSize(new java.awt.Dimension(80, 45));
        txtArSPLambo2.setViewportView(txtArLambo2);

        panLambo.add(txtArSPLambo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 190, 40));

        txtArSPLambo1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtArLambo1.setEditable(false);
        txtArLambo1.setColumns(20);
        txtArLambo1.setLineWrap(true);
        txtArLambo1.setRows(5);
        txtArLambo1.setPreferredSize(new java.awt.Dimension(80, 45));
        txtArSPLambo1.setViewportView(txtArLambo1);

        panLambo.add(txtArSPLambo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 190, 40));

        getContentPane().add(panLambo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 240, 400));

        panBugatti.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bugattiTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bugattiTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bugattiTitle.setText("Bugatti");
        panBugatti.add(bugattiTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, -1));

        lblBugattiNivel1.setText("Nivel 1");
        panBugatti.add(lblBugattiNivel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        lblBugattiNivel2.setText("Nivel 2");
        panBugatti.add(lblBugattiNivel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        lblBugattiNivel3.setText("Nivel 3");
        panBugatti.add(lblBugattiNivel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        lblBugattiRefuerzo.setText("Refuerzo");
        panBugatti.add(lblBugattiRefuerzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        txtArSPBugatti1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtArBugatti1.setEditable(false);
        txtArBugatti1.setColumns(20);
        txtArBugatti1.setLineWrap(true);
        txtArBugatti1.setRows(5);
        txtArBugatti1.setPreferredSize(new java.awt.Dimension(80, 45));
        txtArSPBugatti1.setViewportView(txtArBugatti1);

        panBugatti.add(txtArSPBugatti1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 190, 40));

        txtArSPBugatti2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtArBugatti2.setEditable(false);
        txtArBugatti2.setColumns(20);
        txtArBugatti2.setLineWrap(true);
        txtArBugatti2.setRows(5);
        txtArBugatti2.setPreferredSize(new java.awt.Dimension(80, 45));
        txtArSPBugatti2.setViewportView(txtArBugatti2);

        panBugatti.add(txtArSPBugatti2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 190, 40));

        txtArSPBugatti3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtArBugatti3.setEditable(false);
        txtArBugatti3.setColumns(20);
        txtArBugatti3.setLineWrap(true);
        txtArBugatti3.setRows(5);
        txtArBugatti3.setPreferredSize(new java.awt.Dimension(80, 45));
        txtArSPBugatti3.setViewportView(txtArBugatti3);

        panBugatti.add(txtArSPBugatti3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 190, 40));

        txtArSPBugattiRefuerzo.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtArBugattiRefuerzo.setEditable(false);
        txtArBugattiRefuerzo.setColumns(20);
        txtArBugattiRefuerzo.setLineWrap(true);
        txtArBugattiRefuerzo.setRows(5);
        txtArBugattiRefuerzo.setPreferredSize(new java.awt.Dimension(80, 45));
        txtArSPBugattiRefuerzo.setViewportView(txtArBugattiRefuerzo);

        panBugatti.add(txtArSPBugattiRefuerzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 190, 40));

        getContentPane().add(panBugatti, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 240, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            Vehiculo v = new Vehiculo();
            txtArBugatti1.append(Integer.toString(i));
            System.out.println("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bugattiTitle;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lamboTitle;
    private javax.swing.JLabel lblBugattiNivel1;
    private javax.swing.JLabel lblBugattiNivel2;
    private javax.swing.JLabel lblBugattiNivel3;
    private javax.swing.JLabel lblBugattiRefuerzo;
    private javax.swing.JLabel lblLamboNivel1;
    private javax.swing.JLabel lblLamboNivel2;
    private javax.swing.JLabel lblLamboNivel3;
    private javax.swing.JLabel lblLamboRefuerzo;
    private javax.swing.JPanel panBugatti;
    private javax.swing.JPanel panLambo;
    private javax.swing.JSlider slider;
    private javax.swing.JTextArea txtArBugatti1;
    private javax.swing.JTextArea txtArBugatti2;
    private javax.swing.JTextArea txtArBugatti3;
    private javax.swing.JTextArea txtArBugattiRefuerzo;
    private javax.swing.JTextArea txtArLambo1;
    private javax.swing.JTextArea txtArLambo2;
    private javax.swing.JTextArea txtArLambo3;
    private javax.swing.JTextArea txtArLamboRefuerzo;
    private javax.swing.JScrollPane txtArSPBugatti1;
    private javax.swing.JScrollPane txtArSPBugatti2;
    private javax.swing.JScrollPane txtArSPBugatti3;
    private javax.swing.JScrollPane txtArSPBugattiRefuerzo;
    private javax.swing.JScrollPane txtArSPLambo1;
    private javax.swing.JScrollPane txtArSPLambo2;
    private javax.swing.JScrollPane txtArSPLambo3;
    private javax.swing.JScrollPane txtArSPLamboRefuerzo;
    // End of variables declaration//GEN-END:variables
}