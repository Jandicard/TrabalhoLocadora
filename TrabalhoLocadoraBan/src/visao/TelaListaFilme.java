/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import entidades.Filme;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.FilmeDAO;

/**
 *
 * @author janderson.cardoso
 */
public class TelaListaFilme extends javax.swing.JFrame {
    private List<Filme> listaFilmes;
    /**
     * Creates new form TelaListaFilme
     */
    public TelaListaFilme() {
        initComponents();
        montarListaFilmes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabFilmes = new javax.swing.JTable();
        btnAddAluguel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("tabFilmes");

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        tabFilmes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Titulo", "Categoria", "Preço", "Número Dias"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabFilmes);
        if (tabFilmes.getColumnModel().getColumnCount() > 0) {
            tabFilmes.getColumnModel().getColumn(0).setResizable(false);
            tabFilmes.getColumnModel().getColumn(1).setResizable(false);
            tabFilmes.getColumnModel().getColumn(2).setResizable(false);
            tabFilmes.getColumnModel().getColumn(3).setResizable(false);
        }

        btnAddAluguel.setText("Adicionar Filme - Aluguel");
        btnAddAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAluguelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddAluguel)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnAddAluguel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = tabFilmes.getSelectedRow();
        if(linha == -1){
            JOptionPane.showMessageDialog(this, "Selecione um filme para excluir!");
        }else{
            Filme filme = listaFilmes.get(linha);
            String mensagem = "Deseja realmente excluir o filme " + filme.getTitulo() + "?";
            int opcao = JOptionPane.showConfirmDialog(this, mensagem, "Confirme a exclusão",
                    JOptionPane.YES_NO_OPTION);
            
            if (opcao == JOptionPane.YES_OPTION){
                if(FilmeDAO.excluir(filme.getId())){
                    montarListaFilmes(); // atualiza a lista de filmes
                    JOptionPane.showMessageDialog(this,"Filme excluido com sucesso!");
                }else{
                    JOptionPane.showMessageDialog(this, "Erro ao excluir o filme");
                }
        }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int linha = tabFilmes.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um filme para alterar!");
        } else {
            TelaCadastroFilme cadastro = new TelaCadastroFilme(this);
            // Pega o filme selecionado e envia para a tela de cadastro
            cadastro.setFilme(listaFilmes.get(linha)); 
            cadastro.setVisible(true);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        new TelaCadastroFilme(this).setVisible(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAddAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAluguelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddAluguelActionPerformed

    
    public void montarListaFilmes(){
        listaFilmes = FilmeDAO.listar();
        DefaultTableModel modelo = (DefaultTableModel) tabFilmes.getModel();
        modelo.setRowCount(0);
        for(Filme filme : listaFilmes){
            Object[] linha = {
                filme.getTitulo(),
                filme.getCategoria().getNome(),
                filme.getPreco(),
                filme.getNumeroDias()
            };
            modelo.addRow(linha);
        }
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAluguel;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabFilmes;
    // End of variables declaration//GEN-END:variables
}
