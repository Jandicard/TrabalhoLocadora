/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

/**
 *
 * @author janderson.cardoso
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        BtnFilmes = new javax.swing.JButton();
        BtnCategorias2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BtnAluguel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        BtnFilmes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BtnFilmes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/filme2.png"))); // NOI18N
        BtnFilmes.setText(" Filmes");
        BtnFilmes.setMaximumSize(new java.awt.Dimension(200, 200));
        BtnFilmes.setMinimumSize(new java.awt.Dimension(518, 519));
        BtnFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFilmesActionPerformed(evt);
            }
        });

        BtnCategorias2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BtnCategorias2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu3.png"))); // NOI18N
        BtnCategorias2.setText(" Categorias");
        BtnCategorias2.setMaximumSize(new java.awt.Dimension(200, 200));
        BtnCategorias2.setMinimumSize(new java.awt.Dimension(518, 519));
        BtnCategorias2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCategorias2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Locadora Ban");

        BtnAluguel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BtnAluguel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alugar.png"))); // NOI18N
        BtnAluguel.setText(" Alugar");
        BtnAluguel.setMaximumSize(new java.awt.Dimension(200, 200));
        BtnAluguel.setMinimumSize(new java.awt.Dimension(518, 519));
        BtnAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAluguelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCategorias2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(BtnCategorias2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCategorias2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCategorias2ActionPerformed
        new TelaListaCategoria().setVisible(true);
    }//GEN-LAST:event_BtnCategorias2ActionPerformed

    private void BtnFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFilmesActionPerformed
        new TelaListaFilme().setVisible(true);
    }//GEN-LAST:event_BtnFilmesActionPerformed

    private void BtnAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAluguelActionPerformed
        new Aluguel().setVisible(true);
    }//GEN-LAST:event_BtnAluguelActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAluguel;
    private javax.swing.JButton BtnCategorias2;
    private javax.swing.JButton BtnFilmes;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}