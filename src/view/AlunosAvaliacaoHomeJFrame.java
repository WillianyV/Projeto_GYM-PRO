/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import projeto_gym.pro.Projeto_GYMPRO;
import projeto_gym.pro.Util;
import fachada.Fachada;
import java.util.ArrayList;
import javax.swing.JTable;
import model.Aluno;
import model.Avaliacao;
import model.Instrutor;
import model.ModeloTabela;

/**
 *
 * @author Insinuante
 */
public class AlunosAvaliacaoHomeJFrame extends javax.swing.JFrame {
    private Aluno a;
    private String objetivo;
    /**
     * Creates new form AlunosJFrame
     */
    public AlunosAvaliacaoHomeJFrame(Aluno a, String objetivo) {
        this.a=a;
        this.objetivo=objetivo;
        Util.lookAndFeel();
        initComponents();        
        carregarTabela(dados());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBack = new javax.swing.JPanel();
        jPanelBlue = new javax.swing.JPanel();
        jLabeAlunos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAvFísica = new javax.swing.JTable();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jLabelProcurar = new javax.swing.JLabel();
        jTextFieldProsucar = new javax.swing.JTextField();
        jLabelIconPesquisar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Avaliação física");
        setExtendedState(6);
        setMinimumSize(new java.awt.Dimension(700, 555));

        jPanelBack.setBackground(new java.awt.Color(255, 255, 255));

        jPanelBlue.setBackground(new java.awt.Color(45, 118, 232));

        jLabeAlunos.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabeAlunos.setForeground(new java.awt.Color(255, 255, 255));
        jLabeAlunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/AV_White.png"))); // NOI18N
        jLabeAlunos.setText(" Avaliação Física");

        javax.swing.GroupLayout jPanelBlueLayout = new javax.swing.GroupLayout(jPanelBlue);
        jPanelBlue.setLayout(jPanelBlueLayout);
        jPanelBlueLayout.setHorizontalGroup(
            jPanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBlueLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabeAlunos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBlueLayout.setVerticalGroup(
            jPanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBlueLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabeAlunos)
                .addGap(28, 28, 28))
        );

        jTableAvFísica.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTableAvFísica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Avalição nº", "Data", "Nome Aluno", "Instrutor"
            }
        ));
        jTableAvFísica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAvFísicaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTableAvFísicaMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAvFísica);

        jButtonCadastrar.setBackground(new java.awt.Color(45, 118, 232));
        jButtonCadastrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.setToolTipText("Cadastrar avaliação fisica");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonExcluir.setBackground(new java.awt.Color(45, 118, 232));
        jButtonExcluir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setToolTipText("Excluir avaliação fisica");
        jButtonExcluir.setMaximumSize(new java.awt.Dimension(89, 23));
        jButtonExcluir.setMinimumSize(new java.awt.Dimension(89, 23));
        jButtonExcluir.setPreferredSize(new java.awt.Dimension(89, 23));
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonEditar.setBackground(new java.awt.Color(45, 118, 232));
        jButtonEditar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonEditar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditar.setText("Editar");
        jButtonEditar.setToolTipText("Editar avaliação fisica");
        jButtonEditar.setMaximumSize(new java.awt.Dimension(89, 23));
        jButtonEditar.setMinimumSize(new java.awt.Dimension(89, 23));
        jButtonEditar.setPreferredSize(new java.awt.Dimension(89, 23));
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jLabelProcurar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelProcurar.setForeground(new java.awt.Color(45, 118, 232));
        jLabelProcurar.setText("Procurar");

        jTextFieldProsucar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProsucarActionPerformed(evt);
            }
        });

        jLabelIconPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_Search_20px.png"))); // NOI18N
        jLabelIconPesquisar.setToolTipText("Pesquisar");

        javax.swing.GroupLayout jPanelBackLayout = new javax.swing.GroupLayout(jPanelBack);
        jPanelBack.setLayout(jPanelBackLayout);
        jPanelBackLayout.setHorizontalGroup(
            jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBlue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelBackLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBackLayout.createSequentialGroup()
                        .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelProcurar)
                            .addComponent(jTextFieldProsucar, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelIconPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBackLayout.createSequentialGroup()
                        .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanelBackLayout.setVerticalGroup(
            jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackLayout.createSequentialGroup()
                .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBackLayout.createSequentialGroup()
                        .addContainerGap(163, Short.MAX_VALUE)
                        .addComponent(jLabelProcurar))
                    .addComponent(jPanelBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelIconPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldProsucar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(716, 594));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        this.dispose();
        Instrutor i = projeto_gym.pro.Projeto_GYMPRO.fachada.getByFuncionario_IdInstrutor(
                    projeto_gym.pro.Projeto_GYMPRO.fachada.getFuncionarioLogado().getId());
        if(i.getId()!=0)
            new AlunosAvaliacaoJFrame(a,i, objetivo).show();
        else
            Mensagem.exibirMensagem("Acesso permitido apenas para instrutores!");
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        Avaliacao a =  Fachada.getInstance().getByIdAvaliacao(Integer.parseInt(
                jTableAvFísica.getValueAt(jTableAvFísica.getSelectedRow(), 0)+""));
        Fachada.getInstance().excluirAvaliacao(a);
        carregarTabela(dados());

    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        Instrutor i = Fachada.getInstance().getByIdAvaliacao(Integer.parseInt(jTableAvFísica.getValueAt(
                    jTableAvFísica.getSelectedRow(), 0)+"")).getInstrutor();
           
            AlunosAvaliacaoJFrame tela = new AlunosAvaliacaoJFrame(a,i, objetivo);
            tela.setAvaliacao( Fachada.getInstance().getByIdAvaliacao(Integer.parseInt(jTableAvFísica.getValueAt(
                    jTableAvFísica.getSelectedRow(), 0)+"")));
            tela.show();
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jTextFieldProsucarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProsucarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProsucarActionPerformed

    private void jTableAvFísicaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAvFísicaMouseEntered

    }//GEN-LAST:event_jTableAvFísicaMouseEntered

    private void jTableAvFísicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAvFísicaMouseClicked
        if(evt.getClickCount()==2){
            Instrutor i = Fachada.getInstance().getByIdAvaliacao(Integer.parseInt(jTableAvFísica.getValueAt(
                    jTableAvFísica.getSelectedRow(), 0)+"")).getInstrutor();
           
            AlunosAvaliacaoJFrame tela = new AlunosAvaliacaoJFrame(a,i, objetivo);
            Util.bloquearCampos(tela.getjPaneAnamnese());
            Util.bloquearCampos(tela.getjPanel1());
            Util.bloquearCampos(tela.getjPanelCCorporal());
            Util.bloquearCampos(tela.getjPanelDCutaneas());
            Util.bloquearCampos(tela.getjPanelPerimetria());
            tela.setAvaliacao( Fachada.getInstance().getByIdAvaliacao(Integer.parseInt(jTableAvFísica.getValueAt(
                    jTableAvFísica.getSelectedRow(), 0)+"")));
            tela.show();
        }
    }//GEN-LAST:event_jTableAvFísicaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JLabel jLabeAlunos;
    private javax.swing.JLabel jLabelIconPesquisar;
    private javax.swing.JLabel jLabelProcurar;
    private javax.swing.JPanel jPanelBack;
    private javax.swing.JPanel jPanelBlue;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAvFísica;
    private javax.swing.JTextField jTextFieldProsucar;
    // End of variables declaration//GEN-END:variables

    private void carregarTabela(ArrayList<Avaliacao> avaliacao){
        String [] colunas = {"Avaliação Nº","Data","Nome Aluno","Instrutor"};
        ArrayList<Object[]> dados = new ArrayList<>();
        for(Avaliacao av : avaliacao){
            dados.add(new Object[]{av.getId(),av.getData(),av.getAluno().getNome(),
                        av.getInstrutor().getFuncionario().getNome()});
        }    
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTableAvFísica.setModel(modelo);
        
        jTableAvFísica.getColumnModel().getColumn(0).setPreferredWidth(75);
        jTableAvFísica.getColumnModel().getColumn(0).setResizable(false);
        jTableAvFísica.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTableAvFísica.getColumnModel().getColumn(1).setResizable(false);
        jTableAvFísica.getColumnModel().getColumn(2).setPreferredWidth(213);
        jTableAvFísica.getColumnModel().getColumn(2).setResizable(false);
        jTableAvFísica.getColumnModel().getColumn(3).setPreferredWidth(170);
        jTableAvFísica.getColumnModel().getColumn(3).setResizable(false);
        
        jTableAvFísica.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);    
    }
    
    private ArrayList<Avaliacao> dados(){
        ArrayList<Avaliacao> avaliacoes = new ArrayList<>();

        for (Avaliacao av : Fachada.getInstance().getAllAvaliacao()) {
            if(av.getAluno().getId()==a.getId())
                avaliacoes.add(av);
        }
        return avaliacoes;
    }
}
