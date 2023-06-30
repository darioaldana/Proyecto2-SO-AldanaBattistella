/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.aldanabattistella;

import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dario
 */
public class Ventana extends javax.swing.JFrame {
    public int counterBugatti = 0; 
    public int counterLambo = 0; 
    //colas del admin
    public Cola Lambo1;
    public Cola Lambo2; 
    public Cola Lambo3;
    public Cola Lambo4;
    public Cola Bugatti1;
    public Cola Bugatti2; 
    public Cola Bugatti3;
    public Cola Bugatti4;
    public Cola winners;
    public IA procesador;
    //Ciclo tambien del admin
    public int cicloCounter;
    public int duration;
    public int winsBu, winsLa;
    
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        this.Lambo1 = new Cola();
        this.Lambo2 = new Cola();
        this.Lambo3 = new Cola();
        this.Lambo4 = new Cola();
        this.Bugatti1 = new Cola();
        this.Bugatti2 = new Cola();
        this.Bugatti3 = new Cola();
        this.Bugatti4 = new Cola();
        this.winners = new Cola();
        this.procesador = new IA();
        
        this.cicloCounter = 2;
        this.duration = 10;
        this.winsBu = 0;
        this.winsLa = 0;
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

        lblSliderValue = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        slider = new javax.swing.JSlider();
        btnStart = new javax.swing.JButton();
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
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSliderValue.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblSliderValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSliderValue.setText("10");
        getContentPane().add(lblSliderValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 180, -1));

        jButton1.setText("Prueba la seleccion de carros");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        slider.setMaximum(19);
        slider.setMinimum(1);
        slider.setToolTipText("");
        slider.setValue(10);
        slider.setName(""); // NOI18N
        slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderStateChanged(evt);
            }
        });
        getContentPane().add(slider, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, -1, 40));

        btnStart.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnStart.setText("START");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        getContentPane().add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 120, 30));

        panLambo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lamboTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lamboTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lamboTitle.setText("Lamborghini");
        panLambo.add(lamboTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 30));

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
        txtArLamboRefuerzo.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        txtArLamboRefuerzo.setLineWrap(true);
        txtArLamboRefuerzo.setRows(5);
        txtArLamboRefuerzo.setPreferredSize(new java.awt.Dimension(124, 100));
        txtArSPLamboRefuerzo.setViewportView(txtArLamboRefuerzo);

        panLambo.add(txtArSPLamboRefuerzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 190, 40));

        txtArSPLambo3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtArLambo3.setEditable(false);
        txtArLambo3.setColumns(20);
        txtArLambo3.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        txtArLambo3.setLineWrap(true);
        txtArLambo3.setRows(5);
        txtArLambo3.setPreferredSize(new java.awt.Dimension(124, 100));
        txtArSPLambo3.setViewportView(txtArLambo3);

        panLambo.add(txtArSPLambo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 190, 40));

        txtArSPLambo2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtArLambo2.setEditable(false);
        txtArLambo2.setColumns(20);
        txtArLambo2.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        txtArLambo2.setLineWrap(true);
        txtArLambo2.setRows(5);
        txtArLambo2.setPreferredSize(new java.awt.Dimension(124, 100));
        txtArSPLambo2.setViewportView(txtArLambo2);

        panLambo.add(txtArSPLambo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 190, 40));

        txtArSPLambo1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtArLambo1.setEditable(false);
        txtArLambo1.setColumns(20);
        txtArLambo1.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        txtArLambo1.setLineWrap(true);
        txtArLambo1.setRows(5);
        txtArLambo1.setPreferredSize(new java.awt.Dimension(124, 100));
        txtArSPLambo1.setViewportView(txtArLambo1);

        panLambo.add(txtArSPLambo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 190, 40));

        getContentPane().add(panLambo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 240, 400));

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
        txtArBugatti1.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        txtArBugatti1.setLineWrap(true);
        txtArBugatti1.setRows(5);
        txtArBugatti1.setPreferredSize(new java.awt.Dimension(124, 100));
        txtArSPBugatti1.setViewportView(txtArBugatti1);

        panBugatti.add(txtArSPBugatti1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 190, 40));

        txtArSPBugatti2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtArBugatti2.setEditable(false);
        txtArBugatti2.setColumns(20);
        txtArBugatti2.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        txtArBugatti2.setLineWrap(true);
        txtArBugatti2.setRows(5);
        txtArBugatti2.setPreferredSize(new java.awt.Dimension(124, 100));
        txtArSPBugatti2.setViewportView(txtArBugatti2);

        panBugatti.add(txtArSPBugatti2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 190, 40));

        txtArSPBugatti3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtArBugatti3.setEditable(false);
        txtArBugatti3.setColumns(20);
        txtArBugatti3.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        txtArBugatti3.setLineWrap(true);
        txtArBugatti3.setRows(5);
        txtArBugatti3.setPreferredSize(new java.awt.Dimension(124, 100));
        txtArSPBugatti3.setViewportView(txtArBugatti3);

        panBugatti.add(txtArSPBugatti3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 190, 40));

        txtArSPBugattiRefuerzo.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtArBugattiRefuerzo.setEditable(false);
        txtArBugattiRefuerzo.setColumns(20);
        txtArBugattiRefuerzo.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        txtArBugattiRefuerzo.setLineWrap(true);
        txtArBugattiRefuerzo.setRows(5);
        txtArBugattiRefuerzo.setPreferredSize(new java.awt.Dimension(124, 100));
        txtArSPBugattiRefuerzo.setViewportView(txtArBugattiRefuerzo);

        panBugatti.add(txtArSPBugattiRefuerzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 190, 40));

        getContentPane().add(panBugatti, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 240, 400));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        btnStart.setVisible(false);
        
        //El admin crea los vehiculos iniciales
        for (int i = 1; i < 11; i++) {
           
            Vehiculo vLambo = new Vehiculo("Lamborghini", this.counterLambo);
            this.counterLambo++;
            queue(vLambo);
            
            Vehiculo vBugatti = new Vehiculo("Bugatti", this.counterBugatti);
            this.counterBugatti++;
            queue(vBugatti);           
        }
        
        updateFields(this.txtArLambo1, this.Lambo1);
        updateFields(this.txtArLambo2, this.Lambo2);
        updateFields(this.txtArLambo3, this.Lambo3);
        updateFields(this.txtArBugatti1, this.Bugatti1);
        updateFields(this.txtArBugatti2, this.Bugatti2);
        updateFields(this.txtArBugatti3, this.Bugatti3);
        
    }//GEN-LAST:event_btnStartActionPerformed

    private void sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderStateChanged
        lblSliderValue.setText(Integer.toString(slider.getValue()));
        this.duration = slider.getValue();
    }//GEN-LAST:event_sliderStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        selectCars();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void selectCars(){
        //El admin verifica la lista de refuerzo
        if(!this.Lambo4.isEmpty()){
            Vehiculo chosen = this.Lambo4.getHead();
            this.Lambo4.sacar();
            chosen.setNext(null);

            Random rand = new Random(); 
            int int_random = rand.nextInt(100);

            if(int_random<=40){
                chosen.qualityLevel = 1;
            }
            queue(chosen);

            updateFields(this.txtArLambo1, this.Lambo1);
            updateFields(this.txtArLambo2, this.Lambo2);
            updateFields(this.txtArLambo3, this.Lambo3);
            updateFields(this.txtArLamboRefuerzo, this.Lambo4);
        }
        if(!this.Bugatti4.isEmpty()){
            Vehiculo chosen = this.Bugatti4.getHead();
            this.Bugatti4.sacar();
            chosen.setNext(null);

            Random rand = new Random(); 
            int int_random = rand.nextInt(100);

            if(int_random<=40){
                chosen.qualityLevel = 1;
            }
            queue(chosen);
            
            updateFields(this.txtArBugatti1, this.Bugatti1);
            updateFields(this.txtArBugatti2, this.Bugatti2);
            updateFields(this.txtArBugatti3, this.Bugatti3);
            updateFields(this.txtArBugattiRefuerzo, this.Bugatti4);
        }
        
        Vehiculo LamboChosen, BugattiChosen;
        //El admin selecciona los carros para correr
        if (!this.Lambo1.isEmpty()){
            LamboChosen = this.Lambo1.getHead();
            this.Lambo1.sacar();
            updateFields(txtArLambo1, Lambo1);
        } else if (!this.Lambo2.isEmpty()){
            LamboChosen = this.Lambo2.getHead();
            this.Lambo2.sacar();
            updateFields(txtArLambo2, Lambo2);
        } else {
            LamboChosen = this.Lambo3.getHead();
            this.Lambo3.sacar();
            updateFields(txtArLambo3, Lambo3);
        }
        
        if (!this.Bugatti1.isEmpty()){
            BugattiChosen = this.Bugatti1.getHead();
            this.Bugatti1.sacar();
            updateFields(txtArBugatti1, Bugatti1);
        } else if (!this.Bugatti2.isEmpty()){
            BugattiChosen = this.Bugatti2.getHead();
            this.Bugatti2.sacar();
            updateFields(txtArBugatti2, Bugatti2);
        } else {
            BugattiChosen = this.Bugatti3.getHead();
            this.Bugatti3.sacar();
            updateFields(txtArBugatti3, Bugatti3);
        }
        LamboChosen.setNext(null);
        BugattiChosen.setNext(null);
        LamboChosen.counter = 0;
        BugattiChosen.counter = 0;
        
        //Empieza la IA
        try{
            sleep(this.duration*1000);
        }
        catch(InterruptedException ex){
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String ganador = procesador.winner(BugattiChosen, LamboChosen);
        
        //El admin modifica las colas
        switch(ganador){
            case "bu":
                System.out.println("Gana b");
                this.winners.agregar(BugattiChosen);
                this.winsBu++;
                break;
            case "la":
                System.out.println("Gana l");
                this.winners.agregar(LamboChosen);
                this.winsLa++;
                break;
            case "empate":
                System.out.println("Empate");
                LamboChosen.qualityLevel = 1;
                BugattiChosen.qualityLevel = 1;
                queue(LamboChosen);
                queue(BugattiChosen);
                updateFields(this.txtArLambo1, this.Lambo1);
                updateFields(this.txtArBugatti1, this.Bugatti1);
                break;
            case "refuerzo":
                System.out.println("Refuerzo");
                this.Lambo4.agregar(LamboChosen);
                this.Bugatti4.agregar(BugattiChosen);
                updateFields(this.txtArLamboRefuerzo, this.Lambo4);
                updateFields(this.txtArBugattiRefuerzo, this.Bugatti4);
                break;
        }
        //El admin suma ciclos y contadores
        this.cicloCounter++;
        if ((this.cicloCounter%2)==0){
            Random rand = new Random(); 
            int int_random = rand.nextInt(100);
            
            if(int_random<=80){
                createCars();
            }
        }
        
        contador(this.Bugatti2);
        contador(this.Bugatti3);
        contador(this.Lambo2);
        contador(this.Lambo3);
        
        updateFields(this.txtArLambo1, this.Lambo1);
        updateFields(this.txtArLambo2, this.Lambo2);
        updateFields(this.txtArLambo3, this.Lambo3);
        updateFields(this.txtArBugatti1, this.Bugatti1);
        updateFields(this.txtArBugatti2, this.Bugatti2);
        updateFields(this.txtArBugatti3, this.Bugatti3);
    }
    
    public void createCars(){
        Vehiculo vLambo = new Vehiculo("Lamborghini", this.counterLambo);
        this.counterLambo++;
        queue(vLambo);
        Vehiculo vBugatti = new Vehiculo("Bugatti", this.counterBugatti);
        this.counterBugatti++;
        queue(vBugatti);
        
        if (vLambo.qualityLevel==1){
            updateFields(this.txtArLambo1, this.Lambo1);    
        } else if (vLambo.qualityLevel==2){
            updateFields(this.txtArLambo2, this.Lambo2);
        } else if (vLambo.qualityLevel==3){
            updateFields(this.txtArLambo3, this.Lambo3);
        }

          //PROBARE UN PUSH
        
        if (vBugatti.qualityLevel==1){
            updateFields(this.txtArBugatti1, this.Bugatti1); 
        } else if (vBugatti.qualityLevel==2){
            updateFields(this.txtArBugatti2, this.Bugatti2);
        } else if (vBugatti.qualityLevel==3){
            updateFields(this.txtArBugatti3, this.Bugatti3);
        }
    }
    
    public void updateFields(javax.swing.JTextArea txtArea, Cola q){
        txtArea.setText("");
        if(q.isEmpty()){return;}
        Vehiculo head = q.getHead(); 
        txtArea.append(head.id);
        head = head.getNext();
        while (head!=null){  
            txtArea.append(" - " + head.id);
            head = head.getNext();
        } 
    }
    
    public void contador(Cola q){
        Vehiculo aux = q.getHead();
        Vehiculo aux2;
                
        while(aux!=null){
            aux.counter++;
            aux2 = aux.getNext();
            if(aux.counter==8){
                aux.counter = 0;
                aux.qualityLevel--;
                aux.setNext(null);
                if(aux.qualityLevel==1){
                    this.Lambo2.sacar();
                    this.Lambo1.agregar(aux);
                }else{
                    this.Lambo3.sacar();
                    this.Lambo2.agregar(aux);
                }
            }
            aux=aux2;
        }
    }
    
    public void queue(Vehiculo vehiculo){
        if (vehiculo.empresa.equals("Lamborghini")){
            if (vehiculo.qualityLevel==1){
                this.Lambo1.agregar(vehiculo);     
            } else if (vehiculo.qualityLevel==2){
                this.Lambo2.agregar(vehiculo);
            } else if (vehiculo.qualityLevel==3){
                this.Lambo3.agregar(vehiculo);   
            }
        } else {
            if (vehiculo.qualityLevel==1){
                this.Bugatti1.agregar(vehiculo);
            } else if (vehiculo.qualityLevel==2){
                this.Bugatti2.agregar(vehiculo); 
            } else if (vehiculo.qualityLevel==3){
                this.Bugatti3.agregar(vehiculo); 
            }
        }
    }
        
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
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel bugattiTitle;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lamboTitle;
    private javax.swing.JLabel lblBugattiNivel1;
    private javax.swing.JLabel lblBugattiNivel2;
    private javax.swing.JLabel lblBugattiNivel3;
    private javax.swing.JLabel lblBugattiRefuerzo;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblLamboNivel1;
    private javax.swing.JLabel lblLamboNivel2;
    private javax.swing.JLabel lblLamboNivel3;
    private javax.swing.JLabel lblLamboRefuerzo;
    private javax.swing.JLabel lblSliderValue;
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
