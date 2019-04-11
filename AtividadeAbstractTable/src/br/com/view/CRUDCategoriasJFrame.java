/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;

import br.com.control.CategoriaControl;
import br.com.control.Validation;

/**
 *
 * @author ACER
 */
public class CRUDCategoriasJFrame extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    private CategoriaControl control;

    public CRUDCategoriasJFrame() {
        initComponents();
        control = new CategoriaControl();
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
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Gerenciamento de Categorias");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        getContentPane().add(tfCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 270, 40));

        bSalvar.setText("Salvar");
        bSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(bSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 100, 40));

        tableCategoria.setModel(new javax.swing.table.DefaultTableModel(
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
        tableCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableCategoriaMousePressed(evt);
            }
        });
        scrollPane.setViewportView(tableCategoria);

        getContentPane().add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 380, 210));

        jLabel2.setText("Itens por página");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "15", "20", " " }));
        comboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxItemStateChanged(evt);
            }
        });
        comboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comboBoxFocusLost(evt);
            }
        });
        comboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                comboBoxMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                comboBoxMouseReleased(evt);
            }
        });
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Controle"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bAlterar.setText("Alterar");
        bAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(bAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 107, 85, -1));

        bNovo.setText("Novo");
        bNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNovoActionPerformed(evt);
            }
        });
        jPanel1.add(bNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 107, 85, -1));

        bUltimo.setText("Último");
        bUltimo.setMaximumSize(new java.awt.Dimension(71, 23));
        bUltimo.setMinimumSize(new java.awt.Dimension(71, 23));
        bUltimo.setPreferredSize(new java.awt.Dimension(71, 23));
        bUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUltimoActionPerformed(evt);
            }
        });
        jPanel1.add(bUltimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 66, 85, -1));

        bProximo.setText("Próximo");
        bProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bProximoActionPerformed(evt);
            }
        });
        jPanel1.add(bProximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 66, 85, -1));

        bPrimeiro.setText("Primeiro");
        bPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPrimeiroActionPerformed(evt);
            }
        });
        jPanel1.add(bPrimeiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 66, 85, -1));

        bAnterior.setText("Anterior");
        bAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnteriorActionPerformed(evt);
            }
        });
        jPanel1.add(bAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 66, 85, -1));

        labelTotalRegistros.setText("...");
        jPanel1.add(labelTotalRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        labelRegistros.setText("...");
        jPanel1.add(labelRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        labelPaginaAtual.setText("...");
        jPanel1.add(labelPaginaAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        labelTotalPaginas.setText("...");
        jPanel1.add(labelTotalPaginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        bDeletar.setText("Deletar");
        bDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeletarActionPerformed(evt);
            }
        });
        jPanel1.add(bDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 107, 85, -1));

        jLabel3.setText("Páginas:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel4.setText("de");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jLabel5.setText("de");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel6.setText("Mostrando:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 380, 150));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnteriorActionPerformed
        control.previousPag();        // TODO add your handling code here:
    }//GEN-LAST:event_bAnteriorActionPerformed

    private void bDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeletarActionPerformed
        control.deleteAction();
    }//GEN-LAST:event_bDeletarActionPerformed

    private void bSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarActionPerformed
        control.saveAction();
    }//GEN-LAST:event_bSalvarActionPerformed

    private void tableCategoriaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCategoriaMousePressed
        Validation.isSelected();
    }//GEN-LAST:event_tableCategoriaMousePressed

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxActionPerformed

    private void bNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNovoActionPerformed
        control.newAction();
    }//GEN-LAST:event_bNovoActionPerformed

    private void comboBoxMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboBoxMouseReleased
    }//GEN-LAST:event_comboBoxMouseReleased

    private void bAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAlterarActionPerformed
        control.updateAction();
    }//GEN-LAST:event_bAlterarActionPerformed

    private void bProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProximoActionPerformed
        control.nextPag();
    }//GEN-LAST:event_bProximoActionPerformed

    private void comboBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboBoxFocusLost
    }//GEN-LAST:event_comboBoxFocusLost

    private void comboBoxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboBoxMouseExited
        control.comboBoxAction();
    }//GEN-LAST:event_comboBoxMouseExited

    private void comboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxItemStateChanged
        control.comboBoxAction();
    }//GEN-LAST:event_comboBoxItemStateChanged

    private void bUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUltimoActionPerformed
        control.lastPage();        // TODO add your handling code here:
    }//GEN-LAST:event_bUltimoActionPerformed

    private void bPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPrimeiroActionPerformed
        control.firstPage();        // TODO add your handling code here:
    }//GEN-LAST:event_bPrimeiroActionPerformed

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
            java.util.logging.Logger.getLogger(CRUDCategoriasJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDCategoriasJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDCategoriasJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDCategoriasJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDCategoriasJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static final javax.swing.JButton bAlterar = new javax.swing.JButton();
    public static final javax.swing.JButton bAnterior = new javax.swing.JButton();
    public static final javax.swing.JButton bDeletar = new javax.swing.JButton();
    public static final javax.swing.JButton bNovo = new javax.swing.JButton();
    public static final javax.swing.JButton bPrimeiro = new javax.swing.JButton();
    public static final javax.swing.JButton bProximo = new javax.swing.JButton();
    public static final javax.swing.JButton bSalvar = new javax.swing.JButton();
    public static final javax.swing.JButton bUltimo = new javax.swing.JButton();
    public static final javax.swing.JComboBox<String> comboBox = new javax.swing.JComboBox<>();
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public static final javax.swing.JLabel labelPaginaAtual = new javax.swing.JLabel();
    public static final javax.swing.JLabel labelRegistros = new javax.swing.JLabel();
    public static final javax.swing.JLabel labelTotalPaginas = new javax.swing.JLabel();
    public static final javax.swing.JLabel labelTotalRegistros = new javax.swing.JLabel();
    public static final javax.swing.JScrollPane scrollPane = new javax.swing.JScrollPane();
    public static final javax.swing.JTable tableCategoria = new javax.swing.JTable();
    public static final javax.swing.JTextField tfCampo = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
}
