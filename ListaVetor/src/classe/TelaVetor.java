/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

import java.util.Arrays;
import javax.swing.DefaultListModel;

/**
 *
 * @author gropp
 */
public class TelaVetor extends javax.swing.JFrame {
    

    //SEMPRE CRIAR AQUI VARIAVEIS GLOBAIS!!!!!!!!!!!!!!!!
    //criamos um vetor com 10 posicoes
    int vetor[] = new int[10];
    //criamos um objeto lista para usar no campo lista do projeto
    DefaultListModel lista = new DefaultListModel();
    //criamos uma variavel selecionado para pegar o indice na lista do elemento clicado
    int selecionado = 0;
    /* IMPORTANTE!!!!!!!!!!!!!!!!!!!!!!!!
    *no projeto, seleciona o campo lista, vai em model, altera para codigo personalizado e no campo coloca o
    *nome do Default List Model criado - que neste caso é "lista"!
    *ISSO VINCULA O OBJETO LISTA COM O CAMPO LISTA!!!!!!!!!
    */
    
    /**
     * Creates new form TelaVetor
     */
    public TelaVetor() { //variaveis no construtor nao sao vistas em outros lugais
        initComponents();
        //ao iniciar o programa ja carregamos a lista com os valores iniciais do vetor
        for(int c = 0; c < vetor.length; c++)
            lista.addElement(vetor[c]);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtValor = new javax.swing.JSpinner();
        btnAdd = new javax.swing.JButton();
        btnRem = new javax.swing.JButton();
        btnOrd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstVetor = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        lblVetorSel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtValor.setModel(new javax.swing.SpinnerNumberModel());
        txtValor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtValorStateChanged(evt);
            }
        });

        btnAdd.setText("Adicionar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRem.setText("Remover");
        btnRem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemActionPerformed(evt);
            }
        });

        btnOrd.setText("Ordenar");
        btnOrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdActionPerformed(evt);
            }
        });

        lstVetor.setModel(lista);
        lstVetor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstVetorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstVetor);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setText("Vetor:");

        lblVetorSel.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        lblVetorSel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVetorSel.setText("[0]");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnOrd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblVetorSel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd))
                        .addGap(18, 18, 18)
                        .addComponent(btnRem)
                        .addGap(18, 18, 18)
                        .addComponent(btnOrd))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblVetorSel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        //o vetor na posicao da variavel selecionado, recebe o valor da caixa de texto:
        vetor[selecionado] = Integer.parseInt(txtValor.getValue().toString());
        //Ao manipular a lista sempre limpar ela antes
        lista.removeAllElements();
        for(int c = 0; c < vetor.length; c++)
            lista.addElement(vetor[c]);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemActionPerformed
        // TODO add your handling code here:
        //na verdade esse funcao zera o valor do vetor na posicao selecionada.
        vetor[selecionado] = 0;
        //precisa sempre atualizar a lista
        //se nao limpar a lista ela empilha 
        lista.removeAllElements();
        //monta a lista com o novo valor do array vetor
        for(int c=0;c<vetor.length;c++){
            lista.addElement(vetor[c]);
        }
        
    }//GEN-LAST:event_btnRemActionPerformed

    private void btnOrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdActionPerformed
        // TODO add your handling code here:
        //biblioteca util.arrays - metodos para tratamento de arrays.
        Arrays.sort(vetor);
        lista.removeAllElements();
        for(int c=0; c<vetor.length;c++){
            lista.addElement(vetor[c]);
        }
    }//GEN-LAST:event_btnOrdActionPerformed

    private void txtValorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtValorStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorStateChanged

    private void lstVetorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstVetorMouseClicked
        // TODO add your handling code here:
        //pegar a posicao do valor selecionado na lista pelo mouse e
        //joga a posicao na variavel "selecionado"
        selecionado = lstVetor.getSelectedIndex();
        //jogar o valor do indice selecionado no label lblVetorSel
        lblVetorSel.setText("["+selecionado+"]");
    }//GEN-LAST:event_lstVetorMouseClicked

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
            java.util.logging.Logger.getLogger(TelaVetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVetor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnOrd;
    private javax.swing.JButton btnRem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblVetorSel;
    private javax.swing.JList<String> lstVetor;
    private javax.swing.JSpinner txtValor;
    // End of variables declaration//GEN-END:variables
}
