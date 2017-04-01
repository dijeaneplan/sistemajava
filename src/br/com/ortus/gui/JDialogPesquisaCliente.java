/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JDialogPesquisaCliente.java
 *
 * Created on 05/01/2012, 15:28:34
 */
package br.com.ortus.gui;

import br.com.ortus.beans.Cliente;
import br.com.ortus.beans.Endereco;
import br.com.ortus.daosSistema.ClienteDao;
import br.com.ortus.daosSistema.EnderecoDao;
import br.com.ortus.utilidades.HashSistema;
import br.com.ortus.utilidades.Utilidades;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class JDialogPesquisaCliente extends javax.swing.JDialog {
    
    private List<Cliente> clientes;
    private String filtro =""; 
    /** Creates new form JDialogPesquisaCliente */
    public JDialogPesquisaCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        povoarTabelaClientes();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jComboBoxFiltro = new javax.swing.JComboBox();
        jTextFieldFiltro = new javax.swing.JTextField();
        jButtonFiltro = new javax.swing.JButton();
        jTextFieldResultado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButtonFechar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Assistência Técnica Ortus - Pesquisa de Cliente");

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pesquisa de Cliente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel1)
                .addContainerGap(252, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableClientes);

        jComboBoxFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID", "Nome", "Telefone", "Email", " " }));

        jButtonFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ortus/icones/pesquisarpequeno.png"))); // NOI18N
        jButtonFiltro.setText("Pesquisar");
        jButtonFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltroActionPerformed(evt);
            }
        });

        jTextFieldResultado.setEditable(false);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel2.setText("resultado(s).");

        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ortus/icones/close.png"))); // NOI18N
        jButtonFechar.setText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ortus/icones/alterar.png"))); // NOI18N
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ortus/icones/mais.png"))); // NOI18N
        jButton1.setText("Adicionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
                        .addComponent(jButtonAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonFechar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonFiltro)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButtonFiltro))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButtonFechar)
                    .addComponent(jButtonAlterar))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:
        alterar();
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltroActionPerformed
        // TODO add your handling code here:
        filtrar();
    }//GEN-LAST:event_jButtonFiltroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JDialog jd = new JDialogCadastroCliente(null, true);
        jd.setLocationRelativeTo(null);
        jd.setVisible(true);
        povoarTabelaClientes();        
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
            java.util.logging.Logger.getLogger(JDialogPesquisaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogPesquisaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogPesquisaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogPesquisaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                JDialogPesquisaCliente dialog = new JDialogPesquisaCliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonFiltro;
    private javax.swing.JComboBox jComboBoxFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTextField jTextFieldFiltro;
    private javax.swing.JTextField jTextFieldResultado;
    // End of variables declaration//GEN-END:variables

    private void povoarTabelaClientes() {
        ClienteDao cDao = new ClienteDao();
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{
                    "ID", "Nome","CPF", "CNPJ", "Telefone 1", "Telefone 2", "Cidade"});
        clientes = cDao.obterLista(filtro);
        
        if (clientes != null) {
            for (Cliente cliente : clientes) {
                model.addRow(new Object[]{cliente.getId(), cliente.getNome(), cliente.getCpf(), cliente.getCnpj(), cliente.getTelefone1(), cliente.getTelefone2(), pegarCidade(cliente)});
            }
            jTableClientes.setModel(model);            
        }
        jTextFieldResultado.setText(String.valueOf(clientes.size()));
    }

    private Object pegarCidade(Cliente c) {
        EnderecoDao eDao = new EnderecoDao();
        Endereco end = eDao.obterLista("cliente_id='" + c.getId()+"'").get(0);
        return end.getCidade();
    }

    private void alterar() {
        int linha = jTableClientes.getSelectedRow();
        if(linha != -1){
            Cliente c = clientes.get(linha);
            HashSistema.hash.put("cliente", c);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para editar o componente.");
            return;
        }
    }

    private void filtrar() {
        if(jTextFieldFiltro.getText().isEmpty()){
            filtro = "";
            povoarTabelaClientes();
        }else{
            if(jComboBoxFiltro.getSelectedIndex() == 0){
                pesquisarPorID();
                filtro = "";
            }else if(jComboBoxFiltro.getSelectedIndex() == 1){
                pesquisarPorNome();
                filtro = "";
            }else if(jComboBoxFiltro.getSelectedIndex() == 2){
                pesquisarPorTelefone();
                filtro = "";
            }else if (jComboBoxFiltro.getSelectedIndex() == 3){
                pesquisarPorEmail();
                filtro = "";
            }else{
//                pesquisarPorValorMenorIgual();
                filtro = "";
            }
        }
    }

    private void pesquisarPorID() {
        if(verificarSeEntradaENumero()){
            filtro = "id='"+jTextFieldFiltro.getText()+"'";
            povoarTabelaClientes();
        }else{
            return;
        }
    }

    private boolean verificarSeEntradaENumero() {
        return new Utilidades().verificarSeEntradaENumeroInteger(jTextFieldFiltro.getText());
    }

    private void pesquisarPorNome() {
        filtro = "nome LIKE '%"+jTextFieldFiltro.getText()+ "%'";
        povoarTabelaClientes();
    }

    private void pesquisarPorTelefone() {
        filtro = "telefone1 LIKE '%"+jTextFieldFiltro.getText()+ "%' OR telefone2 LIKE '%"+jTextFieldFiltro.getText()+ "%'";
        povoarTabelaClientes();
    }

    private void pesquisarPorEmail() {
        filtro = "email LIKE '%"+jTextFieldFiltro.getText()+ "%'";
        povoarTabelaClientes();
    }
}