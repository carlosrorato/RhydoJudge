/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.dao.SubmissaoDAO;
import model.dao.TempoDAO;
import model.dao.UsuarioDAO;

/**
 *
 * @author carlosrorato
 */
public class TelaPrincipalAdmin extends javax.swing.JFrame {
    
    /**
     * Creates new form TelaPrincipalAdmin
     */
    public TelaPrincipalAdmin() {
        initComponents();
        contadorTempo();
        txtNome.setText(System.getProperty("login",""));
        imprimirScoreLoop();
        imprimirTotalSubLoop();
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
        mostrador_tempo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        b12 = new javax.swing.JLabel();
        b3 = new javax.swing.JLabel();
        b13 = new javax.swing.JLabel();
        b4 = new javax.swing.JLabel();
        b14 = new javax.swing.JLabel();
        b5 = new javax.swing.JLabel();
        b15 = new javax.swing.JLabel();
        b6 = new javax.swing.JLabel();
        b7 = new javax.swing.JLabel();
        b8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        b9 = new javax.swing.JLabel();
        scoreRestante = new javax.swing.JLabel();
        b10 = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        b11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        totalSub = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rhydo 1.0 - Administrador");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N

        mostrador_tempo.setFont(new java.awt.Font("Ubuntu", 0, 30)); // NOI18N
        mostrador_tempo.setText("--h --min");

        jLabel2.setText("Tempo restante:");

        jLabel3.setText("Bem vindo(a), ");

        txtNome.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        txtNome.setText("jLabel3");

        jLabel4.setText("!");

        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/balao.png"))); // NOI18N

        b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/balao.png"))); // NOI18N

        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/balao.png"))); // NOI18N

        b13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/balao.png"))); // NOI18N

        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/balao.png"))); // NOI18N

        b14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/balao.png"))); // NOI18N

        b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/balao.png"))); // NOI18N

        b15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/balao.png"))); // NOI18N

        b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/balao.png"))); // NOI18N

        b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/balao.png"))); // NOI18N

        b8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/balao.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel6.setText("Score:");

        b9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/balao.png"))); // NOI18N

        scoreRestante.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        scoreRestante.setText("+20");

        b10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/balao.png"))); // NOI18N

        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/balao.png"))); // NOI18N

        b11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/balao.png"))); // NOI18N

        jLabel7.setText("Total de Submissões:");

        totalSub.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        totalSub.setText("00");

        jMenu3.setText("Usuários");
        jMenu3.setToolTipText("");

        jMenuItem2.setText("Gerenciar Usuários");
        jMenuItem2.setToolTipText("Cadastre, atualize ou exclua usuários");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Questões");

        jMenuItem9.setText("Ver Questões");
        jMenuItem9.setToolTipText("Ver todas as questões cadastradas");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem3.setText("Gerenciar Questões");
        jMenuItem3.setToolTipText("Cadastre, atualize ou exclua questões");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem6.setText("Desempenho Geral");
        jMenuItem6.setToolTipText("Acesse uma tabela com o desempenho de todos os usuários");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenu2.setText("Submissão");

        jMenuItem11.setText("Definir Tempo Máximo");
        jMenuItem11.setToolTipText("Definir tempo máximo para submissão das soluções");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jMenuItem1.setText("Submeter Solução");
        jMenuItem1.setToolTipText("Submeta soluções para as questões");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenu1.add(jMenu2);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Help");

        jMenuItem4.setText("Sobre");
        jMenuItem4.setToolTipText("Informações sobre o projeto");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem5.setText("Manual do Administrador");
        jMenuItem5.setToolTipText("Manual com informações pertinentes");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuItem8.setText("Modelo Para Enunciados (.odt)");
        jMenuItem8.setToolTipText("Modelo para padronizar os enunciados das questões cadastradas no sistema");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuItem7.setText("Logout");
        jMenuItem7.setToolTipText("Sair do sistema");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(mostrador_tempo, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 414, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(b1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scoreRestante, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalSub)
                .addGap(740, 740, 740))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNome)
                    .addComponent(jLabel4))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b1)
                    .addComponent(b2)
                    .addComponent(b3)
                    .addComponent(b5)
                    .addComponent(b6)
                    .addComponent(b7)
                    .addComponent(b8)
                    .addComponent(b9)
                    .addComponent(b10)
                    .addComponent(b11)
                    .addComponent(b12)
                    .addComponent(b13)
                    .addComponent(b14)
                    .addComponent(b15)
                    .addComponent(b4)
                    .addComponent(scoreRestante, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(totalSub))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 282, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mostrador_tempo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        JOptionPane.showMessageDialog(null,"Rhydo 1.0\n\nLinguagens Suportadas:\n- Linguagem C\n\nDesenvolvido por Carlos Henrique Rorato Souza\n e Acquila Santos Rocha\n\nUFG - Instituto de Informática\n2017");
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new GerenciarUsuarios().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        try {
            java.awt.Desktop.getDesktop().open( new File( "./Manual/admin.pdf" ) );
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Erro na abertura do arquivo do manual");
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        new Desempenho().setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new GerenciarQuestoes().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        
        JOptionPane.showMessageDialog(null,"Sessão Encerrada!");
        new TelaLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new SubmeterSolucao().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        try {
            java.awt.Desktop.getDesktop().open( new File( "./Manual/modelo.odt" ) );
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Erro na abertura do arquivo do manual");
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        TempoDAO tdao = new TempoDAO();
        SubmissaoDAO sdao = new SubmissaoDAO();
        int tempo = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo máximo\npara a submissão das soluções (em minutos):"));
        if(tempo>0){
            sdao.setHabilitado(true);
        }
        tdao.setTempoSub(tempo*60);//guardando tempo em segundos
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        new VerQuestoes().setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void contadorTempo() {

        int delay = 0;   // delay de 0 seg.
        int interval = 1000;  // intervalo de 1 seg.
        Timer timer = new Timer();
        ImprimirTempo();
                
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                ImprimirTempo();
            }
        }, delay, interval);

    }
    
    private void ImprimirTempo(){
        TempoDAO tdao = new TempoDAO();
        int hora = 0, minuto = 0, tempo = 0, segundo = 0;
        tempo = tdao.getTempoSub();
        hora = tempo / 3600;
        minuto = (tempo % 3600)/60;
        segundo = (tempo % 3600)%60;
        mostrador_tempo.setText(hora + "h  " + minuto + "min  "+segundo+"seg");
    }
    
    private void imprimirScore(){
       UsuarioDAO udao = new UsuarioDAO();
       int s;
       s = udao.getScore(System.getProperty("login"));
       
       //pré-carregamento
       
       scoreRestante.setVisible(false);
       b1.setVisible(false);
       b2.setVisible(false);
       b3.setVisible(false);
       b4.setVisible(false);
       b5.setVisible(false);
       b6.setVisible(false);
       b7.setVisible(false);
       b8.setVisible(false);
       b9.setVisible(false);
       b10.setVisible(false);
       b11.setVisible(false);
       b12.setVisible(false);
       b13.setVisible(false);
       b14.setVisible(false);
       b15.setVisible(false);
       
       //caso a caso
       if(s==1){
          b1.setVisible(true);    
       }
       if(s==2){
          b1.setVisible(true); 
          b2.setVisible(true);    
       }
       if(s==3){
          b1.setVisible(true); 
          b2.setVisible(true);
          b3.setVisible(true);  
       }
       if(s==4){
          b1.setVisible(true); 
          b2.setVisible(true);
          b3.setVisible(true); 
          b4.setVisible(true);  
       }
       if(s==5){
          b1.setVisible(true); 
          b2.setVisible(true);
          b3.setVisible(true); 
          b4.setVisible(true);
          b5.setVisible(true); 
       }
       if(s==6){
          b1.setVisible(true); 
          b2.setVisible(true);
          b3.setVisible(true); 
          b4.setVisible(true);
          b5.setVisible(true); 
          b6.setVisible(true); 
       }
       if(s==7){
          b1.setVisible(true); 
          b2.setVisible(true);
          b3.setVisible(true); 
          b4.setVisible(true);
          b5.setVisible(true); 
          b6.setVisible(true); 
          b7.setVisible(true);
       }
       if(s==8){
          b1.setVisible(true); 
          b2.setVisible(true);
          b3.setVisible(true); 
          b4.setVisible(true);
          b5.setVisible(true); 
          b6.setVisible(true); 
          b7.setVisible(true);
          b8.setVisible(true);
       }
       if(s==9){
          b1.setVisible(true); 
          b2.setVisible(true);
          b3.setVisible(true); 
          b4.setVisible(true);
          b5.setVisible(true); 
          b6.setVisible(true); 
          b7.setVisible(true);
          b8.setVisible(true);
          b9.setVisible(true);
       }
       if(s==10){
          b1.setVisible(true); 
          b2.setVisible(true);
          b3.setVisible(true); 
          b4.setVisible(true);
          b5.setVisible(true); 
          b6.setVisible(true); 
          b7.setVisible(true);
          b8.setVisible(true);
          b9.setVisible(true);
          b10.setVisible(true);
       }
       if(s==11){
          b1.setVisible(true); 
          b2.setVisible(true);
          b3.setVisible(true); 
          b4.setVisible(true);
          b5.setVisible(true); 
          b6.setVisible(true); 
          b7.setVisible(true);
          b8.setVisible(true);
          b9.setVisible(true);
          b10.setVisible(true);
          b11.setVisible(true);
       }
       if(s==12){
          b1.setVisible(true); 
          b2.setVisible(true);
          b3.setVisible(true); 
          b4.setVisible(true);
          b5.setVisible(true); 
          b6.setVisible(true); 
          b7.setVisible(true);
          b8.setVisible(true);
          b9.setVisible(true);
          b10.setVisible(true);
          b11.setVisible(true);
          b12.setVisible(true);
       }
       if(s==13){
          b1.setVisible(true); 
          b2.setVisible(true);
          b3.setVisible(true); 
          b4.setVisible(true);
          b5.setVisible(true); 
          b6.setVisible(true); 
          b7.setVisible(true);
          b8.setVisible(true);
          b9.setVisible(true);
          b10.setVisible(true);
          b11.setVisible(true);
          b12.setVisible(true);
          b13.setVisible(true);
       }
       if(s==14){
          b1.setVisible(true); 
          b2.setVisible(true);
          b3.setVisible(true); 
          b4.setVisible(true);
          b5.setVisible(true); 
          b6.setVisible(true); 
          b7.setVisible(true);
          b8.setVisible(true);
          b9.setVisible(true);
          b10.setVisible(true);
          b11.setVisible(true);
          b12.setVisible(true);
          b13.setVisible(true);
          b14.setVisible(true);
       }
       if(s==15){
          b1.setVisible(true); 
          b2.setVisible(true);
          b3.setVisible(true); 
          b4.setVisible(true);
          b5.setVisible(true); 
          b6.setVisible(true); 
          b7.setVisible(true);
          b8.setVisible(true);
          b9.setVisible(true);
          b10.setVisible(true);
          b11.setVisible(true);
          b12.setVisible(true);
          b13.setVisible(true);
          b14.setVisible(true);
          b15.setVisible(true);
       }
       if(s>15){
          b1.setVisible(true); 
          b2.setVisible(true);
          b3.setVisible(true); 
          b4.setVisible(true);
          b5.setVisible(true); 
          b6.setVisible(true); 
          b7.setVisible(true);
          b8.setVisible(true);
          b9.setVisible(true);
          b10.setVisible(true);
          b11.setVisible(true);
          b12.setVisible(true);
          b13.setVisible(true);
          b14.setVisible(true);
          b15.setVisible(true);
          scoreRestante.setVisible(true);
          scoreRestante.setText("+"+(s-15));
       }
    }
    
    private void imprimirScoreLoop(){
        int delay = 0;   // delay de 0 seg.
        int interval = 10000;  // intervalo de 10 seg.
        Timer timer = new Timer();

                
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                imprimirScore();

            }
        }, delay, interval);
    }
    
    private void imprimirTotalSubLoop(){
        int delay = 0;   // delay de 0 seg.
        int interval = 10000;  // intervalo de 10 seg.
        Timer timer = new Timer();

                
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                UsuarioDAO udao = new UsuarioDAO();
                int s;
                s = udao.getSubm(System.getProperty("login"));
                totalSub.setText(String.valueOf(s));        
            }
        }, delay, interval);
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
            java.util.logging.Logger.getLogger(TelaPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b10;
    private javax.swing.JLabel b11;
    private javax.swing.JLabel b12;
    private javax.swing.JLabel b13;
    private javax.swing.JLabel b14;
    private javax.swing.JLabel b15;
    private javax.swing.JLabel b2;
    private javax.swing.JLabel b3;
    private javax.swing.JLabel b4;
    private javax.swing.JLabel b5;
    private javax.swing.JLabel b6;
    private javax.swing.JLabel b7;
    private javax.swing.JLabel b8;
    private javax.swing.JLabel b9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JLabel mostrador_tempo;
    private javax.swing.JLabel scoreRestante;
    private javax.swing.JLabel totalSub;
    private javax.swing.JLabel txtNome;
    // End of variables declaration//GEN-END:variables
}
