/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package p.i.fame;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.VendaDAO;
import model.Venda;
import java.awt.*;

/**
 *
 * @author User
 */
public class TelaVendas extends javax.swing.JFrame {

    /**
     * Creates new form TelaVendas
     */
    public TelaVendas() {
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

        jPanel1 = new javax.swing.JPanel();
        BtnsPanel = new javax.swing.JPanel();
        CadastroBtn = new javax.swing.JButton();
        EditarBtn = new javax.swing.JButton();
        ExcluirBtn = new javax.swing.JButton();
        VoltarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        OSButton = new javax.swing.JButton();
        detalhesPanel = new javax.swing.JPanel();
        ProdutosLabel = new javax.swing.JLabel();
        FormaPagamentoLabel = new javax.swing.JLabel();
        DataLabel = new javax.swing.JLabel();
        DescontoLabel = new javax.swing.JLabel();
        ValorTotalLabel = new javax.swing.JLabel();
        DescricaoLabel = new javax.swing.JLabel();
        ValorDescontoLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descricaoTextArea = new javax.swing.JTextArea();
        produtosLabel = new javax.swing.JLabel();
        dataLabel = new javax.swing.JLabel();
        formaPagamentoLabel = new javax.swing.JLabel();
        valorTotalLabel = new javax.swing.JLabel();
        descontoLabel = new javax.swing.JLabel();
        valorDescLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        BtnsPanel.setBackground(new Color(255,255,0,96));

        CadastroBtn.setFont(new java.awt.Font("Aldrich", 1, 28)); // NOI18N
        CadastroBtn.setForeground(new Color(0,0,0,177));
        CadastroBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Btn1.png"))); // NOI18N
        CadastroBtn.setBorder(null);
        CadastroBtn.setBorderPainted(false);
        CadastroBtn.setContentAreaFilled(false);
        CadastroBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CadastroBtn.setFocusPainted(false);
        CadastroBtn.setFocusable(false);
        CadastroBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CadastroBtn.setIconTextGap(0);
        CadastroBtn.setLabel("<html><center>Registrar<br>Venda</center></html>");
        CadastroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroBtnActionPerformed(evt);
            }
        });

        EditarBtn.setFont(new java.awt.Font("Aldrich", 1, 28)); // NOI18N
        EditarBtn.setForeground(new Color(0,0,0,177));
        EditarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Btn2.png"))); // NOI18N
        EditarBtn.setText("<html><center>Detalhe<br>Venda</center></html>");
        EditarBtn.setBorder(null);
        EditarBtn.setBorderPainted(false);
        EditarBtn.setContentAreaFilled(false);
        EditarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EditarBtn.setFocusPainted(false);
        EditarBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        EditarBtn.setIconTextGap(0);
        EditarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarBtnActionPerformed(evt);
            }
        });

        ExcluirBtn.setFont(new java.awt.Font("Aldrich", 1, 28)); // NOI18N
        ExcluirBtn.setForeground(new Color(0,0,0,177));
        ExcluirBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Btn3.png"))); // NOI18N
        ExcluirBtn.setText("<html><center>Excluir<br>Venda</center></html>");
        ExcluirBtn.setBorder(null);
        ExcluirBtn.setBorderPainted(false);
        ExcluirBtn.setContentAreaFilled(false);
        ExcluirBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExcluirBtn.setFocusPainted(false);
        ExcluirBtn.setFocusable(false);
        ExcluirBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ExcluirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BtnsPanelLayout = new javax.swing.GroupLayout(BtnsPanel);
        BtnsPanel.setLayout(BtnsPanelLayout);
        BtnsPanelLayout.setHorizontalGroup(
            BtnsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnsPanelLayout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(CadastroBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(EditarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(ExcluirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        BtnsPanelLayout.setVerticalGroup(
            BtnsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnsPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(BtnsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CadastroBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExcluirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        VoltarBtn.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        VoltarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        VoltarBtn.setBorder(null);
        VoltarBtn.setContentAreaFilled(false);
        VoltarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VoltarBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        VoltarBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        VoltarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarBtnActionPerformed(evt);
            }
        });

        Tabela.setBackground(new java.awt.Color(255, 255, 255));
        Tabela.setFont(new java.awt.Font("Aldrich", 0, 14)); // NOI18N
        Tabela.setForeground(new java.awt.Color(0, 0, 0));
        Tabela.setModel(montarTabela());
        Tabela.setGridColor(new java.awt.Color(0, 0, 255));
        Tabela.setSelectionBackground(new Color(255, 255, 0, 50));
        Tabela.setSelectionForeground(new java.awt.Color(0, 0, 0));
        Tabela.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Tabela.setShowGrid(true);
        jScrollPane1.setViewportView(Tabela);

        jPanel2.setBackground(new java.awt.Color(37, 86, 255));

        homeButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        homeButton.setForeground(new java.awt.Color(255, 255, 255));
        homeButton.setText("⌂");
        homeButton.setBorderPainted(false);
        homeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("VENDAS");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        OSButton.setBackground(new java.awt.Color(255, 255, 255));
        OSButton.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        OSButton.setForeground(new java.awt.Color(0, 0, 0));
        OSButton.setBorder(null);
        OSButton.setLabel("<html><center>ORDEM<br>SERVIÇO</center></html>");
        OSButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OSButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(OSButton, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeButton)
                .addGap(178, 178, 178)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OSButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {OSButton, jButton2});

        detalhesPanel.setBackground(new java.awt.Color(37, 86, 255));

        ProdutosLabel.setFont(new java.awt.Font("Aldrich", 0, 18)); // NOI18N
        ProdutosLabel.setForeground(new java.awt.Color(255, 255, 255));
        ProdutosLabel.setText("Produtos:");

        FormaPagamentoLabel.setFont(new java.awt.Font("Aldrich", 0, 18)); // NOI18N
        FormaPagamentoLabel.setForeground(new java.awt.Color(255, 255, 255));
        FormaPagamentoLabel.setText("Forma Pagamento:");

        DataLabel.setFont(new java.awt.Font("Aldrich", 0, 18)); // NOI18N
        DataLabel.setForeground(new java.awt.Color(255, 255, 255));
        DataLabel.setText("Data:");

        DescontoLabel.setFont(new java.awt.Font("Aldrich", 0, 18)); // NOI18N
        DescontoLabel.setForeground(new java.awt.Color(255, 255, 255));
        DescontoLabel.setText("Desconto:");

        ValorTotalLabel.setFont(new java.awt.Font("Aldrich", 0, 18)); // NOI18N
        ValorTotalLabel.setForeground(new java.awt.Color(255, 255, 255));
        ValorTotalLabel.setText("Valor Total:");

        DescricaoLabel.setFont(new java.awt.Font("Aldrich", 0, 18)); // NOI18N
        DescricaoLabel.setForeground(new java.awt.Color(255, 255, 255));
        DescricaoLabel.setText("Descrição:");

        ValorDescontoLabel.setFont(new java.awt.Font("Aldrich", 0, 18)); // NOI18N
        ValorDescontoLabel.setForeground(new java.awt.Color(255, 255, 255));
        ValorDescontoLabel.setText("Valor Desconto:");

        descricaoTextArea.setEditable(false);
        descricaoTextArea.setBackground(new java.awt.Color(255, 255, 255));
        descricaoTextArea.setColumns(20);
        descricaoTextArea.setFont(new java.awt.Font("Aldrich", 0, 15)); // NOI18N
        descricaoTextArea.setForeground(new java.awt.Color(0, 0, 0));
        descricaoTextArea.setLineWrap(true);
        descricaoTextArea.setRows(5);
        descricaoTextArea.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        descricaoTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        descricaoTextArea.setFocusable(false);
        jScrollPane2.setViewportView(descricaoTextArea);

        produtosLabel.setFont(new java.awt.Font("Aldrich", 0, 14)); // NOI18N
        produtosLabel.setForeground(new java.awt.Color(255, 255, 255));
        produtosLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        produtosLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        dataLabel.setFont(new java.awt.Font("Aldrich", 0, 14)); // NOI18N
        dataLabel.setForeground(new java.awt.Color(255, 255, 255));

        formaPagamentoLabel.setFont(new java.awt.Font("Aldrich", 0, 14)); // NOI18N
        formaPagamentoLabel.setForeground(new java.awt.Color(255, 255, 255));

        valorTotalLabel.setFont(new java.awt.Font("Aldrich", 0, 14)); // NOI18N
        valorTotalLabel.setForeground(new java.awt.Color(255, 255, 255));

        descontoLabel.setFont(new java.awt.Font("Aldrich", 0, 14)); // NOI18N
        descontoLabel.setForeground(new java.awt.Color(255, 255, 255));

        valorDescLabel.setFont(new java.awt.Font("Aldrich", 0, 14)); // NOI18N
        valorDescLabel.setForeground(new java.awt.Color(255, 255, 255));

        detalhesPanel.setVisible(false);

        javax.swing.GroupLayout detalhesPanelLayout = new javax.swing.GroupLayout(detalhesPanel);
        detalhesPanel.setLayout(detalhesPanelLayout);
        detalhesPanelLayout.setHorizontalGroup(
            detalhesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detalhesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detalhesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detalhesPanelLayout.createSequentialGroup()
                        .addComponent(ProdutosLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produtosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(detalhesPanelLayout.createSequentialGroup()
                        .addComponent(DataLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(detalhesPanelLayout.createSequentialGroup()
                        .addComponent(FormaPagamentoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(formaPagamentoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(detalhesPanelLayout.createSequentialGroup()
                        .addComponent(ValorTotalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorTotalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(detalhesPanelLayout.createSequentialGroup()
                        .addComponent(DescontoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descontoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(detalhesPanelLayout.createSequentialGroup()
                        .addComponent(ValorDescontoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorDescLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                    .addGroup(detalhesPanelLayout.createSequentialGroup()
                        .addComponent(DescricaoLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        detalhesPanelLayout.setVerticalGroup(
            detalhesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detalhesPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(detalhesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(produtosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProdutosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detalhesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DataLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detalhesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FormaPagamentoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(formaPagamentoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detalhesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(valorTotalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ValorTotalLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detalhesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DescontoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(descontoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detalhesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(valorDescLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ValorDescontoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(DescricaoLabel)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(VoltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(detalhesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(VoltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BtnsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(detalhesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                        .addGap(75, 75, 75))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarBtnActionPerformed
        TelaInicial ti = new TelaInicial();
        ti.setVisible(true);
        dispose();
    }//GEN-LAST:event_VoltarBtnActionPerformed

    private void ExcluirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirBtnActionPerformed
        int i = getPosicao();
        if (i > -1) {
            int resp = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir essa venda?");
            if (resp == 0) {
                VendaDAO.excluirVenda(i);
            }
        }
    }//GEN-LAST:event_ExcluirBtnActionPerformed

    private void CadastroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroBtnActionPerformed
        TelaCadastroVenda tc = new TelaCadastroVenda();
        tc.setVisible(true);
        dispose();
    }//GEN-LAST:event_CadastroBtnActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        Tabela.setModel(montarTabela());
        detalhesPanel.setVisible(false);
    }//GEN-LAST:event_formWindowGainedFocus

    private void EditarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarBtnActionPerformed
        int id = getPosicao();
        List<Venda> lista = VendaDAO.listarVendas();

        for (int i = 0; i < lista.size(); i++) {
            Venda v = lista.get(i);

            if (v.getId() == id) {
                double valorDesconto = v.getValorTotal() - (v.getValorTotal() * (v.getDesconto() / 100));
                detalhesPanel.setVisible(true);
                produtosLabel.setText(v.getProdutos());
                dataLabel.setText(v.getData());
                formaPagamentoLabel.setText(v.getFormaPagamento());
                valorTotalLabel.setText("R$" + String.format("%.2f", v.getValorTotal()));
                descontoLabel.setText(String.valueOf(v.getDesconto()) + "%");
                descricaoTextArea.setText(v.getDescricao());
                valorDescLabel.setText("R$" + String.format("%.2f", valorDesconto));
                break;
            }
        }
    }//GEN-LAST:event_EditarBtnActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        TelaInicial ti = new TelaInicial();
        ti.setVisible(true);
        dispose();
    }//GEN-LAST:event_homeButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void OSButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OSButtonActionPerformed
        TelaOS tos = new TelaOS();
        tos.setVisible(true);
        dispose();
    }//GEN-LAST:event_OSButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVendas().setVisible(true);
            }
        });
    }

    private DefaultTableModel montarTabela() {
        String[] colunas = {"Produtos", "Descrição", "Data", "Valor Total", "Desconto (%)", "Forma Pagamento"};

        DefaultTableModel tabela = new DefaultTableModel(colunas, 0);

        ArrayList<Venda> lista = VendaDAO.listarVendas();

        for (int i = 0; i < lista.size(); i++) {
            Venda v = lista.get(i);

            String[] linhas = {
                v.getProdutos(),
                v.getDescricao(),
                v.getData(),
                String.format("%.2f", v.getValorTotal()),
                String.format("%.0f", v.getDesconto()),
                v.getFormaPagamento(),};

            tabela.addRow(linhas);
        }
        return tabela;
    }

    private int getPosicao() {
        int pos = Tabela.getSelectedRow();
        List<Venda> lista = VendaDAO.listarVendas();

        if (pos <= -1) {
            JOptionPane.showMessageDialog(null, "Selecione um item para excluir ou atualizar!", "Erro", 2);
        } else {
            Venda v = lista.get(pos);
            return v.getId();
        }
        return pos;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnsPanel;
    private javax.swing.JButton CadastroBtn;
    private javax.swing.JLabel DataLabel;
    private javax.swing.JLabel DescontoLabel;
    private javax.swing.JLabel DescricaoLabel;
    private javax.swing.JButton EditarBtn;
    private javax.swing.JButton ExcluirBtn;
    private javax.swing.JLabel FormaPagamentoLabel;
    private javax.swing.JButton OSButton;
    private javax.swing.JLabel ProdutosLabel;
    private javax.swing.JTable Tabela;
    private javax.swing.JLabel ValorDescontoLabel;
    private javax.swing.JLabel ValorTotalLabel;
    private javax.swing.JButton VoltarBtn;
    private javax.swing.JLabel dataLabel;
    private javax.swing.JLabel descontoLabel;
    private javax.swing.JTextArea descricaoTextArea;
    private javax.swing.JPanel detalhesPanel;
    private javax.swing.JLabel formaPagamentoLabel;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel produtosLabel;
    private javax.swing.JLabel valorDescLabel;
    private javax.swing.JLabel valorTotalLabel;
    // End of variables declaration//GEN-END:variables
}
