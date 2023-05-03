/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import entidades.Cliente;
import entidades.Categoria;
import entidades.Filme;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.FilmeDAO;

/**
 *
 * @author janderson.cardoso
 */
public class Aluguel extends javax.swing.JFrame {
    private List<Filme> listaFilmes;
    /**
     * Creates new form Aluguel
     */
    public Aluguel() {
        initComponents();
        montarListaItens();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabItens = new javax.swing.JTable();
        ldlTotal = new javax.swing.JLabel();
        BtnAdicionarFilme = new javax.swing.JButton();
        BtnExcluirFilme = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Nome");

        jLabel2.setText("E-mail");

        jLabel3.setText("Telefone");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tabItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Titulo", "Tipo", "Valor"
            }
        ));
        jScrollPane1.setViewportView(tabItens);

        ldlTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ldlTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ldlTotal.setText("Total: R$ 00,00");

        BtnAdicionarFilme.setText("Adicionar Filme");
        BtnAdicionarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAdicionarFilmeActionPerformed(evt);
            }
        });

        BtnExcluirFilme.setText("Excluir Filme");
        BtnExcluirFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluirFilmeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(txtEmail))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(123, 123, 123))
                            .addComponent(txtTelefone)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(ldlTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnAdicionarFilme)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnExcluirFilme)))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAdicionarFilme)
                    .addComponent(BtnExcluirFilme))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ldlTotal)
                .addGap(49, 49, 49))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAdicionarFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdicionarFilmeActionPerformed
        new TelaListaFilme().setVisible(true);
    }//GEN-LAST:event_BtnAdicionarFilmeActionPerformed
    
    public void montarListaItens(){
        listaFilmes = FilmeDAO.listar();
        DefaultTableModel modelo = (DefaultTableModel) tabItens.getModel();
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

    private void BtnExcluirFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirFilmeActionPerformed
        int linha = tabItens.getSelectedRow();
        if(linha == -1){
            JOptionPane.showMessageDialog(this, "Selecione um filme para excluir!");
        }else{
            Filme filme = listaFilmes.get(linha);
            String mensagem = "Deseja realmente excluir o filme " + filme.getTitulo() + "?";
            int opcao = JOptionPane.showConfirmDialog(this, mensagem, "Confirme a exclusão",
                    JOptionPane.YES_NO_OPTION);
            
            if (opcao == JOptionPane.YES_OPTION){
                if(FilmeDAO.excluir(filme.getId())){
                    montarListaItens(); // atualiza a lista de filmes
                    JOptionPane.showMessageDialog(this,"Filme excluido com sucesso!");
                }else{
                    JOptionPane.showMessageDialog(this, "Erro ao excluir o filme");
                }
        }
    }//GEN-LAST:event_BtnExcluirFilmeActionPerformed
    }
        
       
        
       
        


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdicionarFilme;
    private javax.swing.JButton BtnExcluirFilme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel ldlTotal;
    private javax.swing.JTable tabItens;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}