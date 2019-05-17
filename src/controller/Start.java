/*
 * PROGRAM BY: -ANA SOFIA LOPERA RIVEROS
 *             -JOHANN NICOLÁS NIETO CÁRDENAS
 *             -LAURA TATIANA RAMOS VILLANUEVA
 */
package controller;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Dimension;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Files;
import model.Gamer;
import view.Instructions;


import view.WindowGame;


public class Start extends javax.swing.JFrame {

  private  AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/music.wav"));

    public Start() {
        initComponents();
        this.setLocationRelativeTo(null);
        archiveRanking();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelWelcome = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();
        labelWelcome1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelName = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        labelLastName = new javax.swing.JLabel();
        textLastName = new javax.swing.JTextField();
        buttonBegin = new javax.swing.JButton();
        textPoints = new javax.swing.JTextField();
        buttonSave = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        labelPoints = new javax.swing.JLabel();
        instructions = new javax.swing.JButton();
        laberImagen1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textSearchName = new javax.swing.JTextField();
        buttonSearch = new javax.swing.JButton();
        labelFindName = new javax.swing.JLabel();
        labelLastFind = new javax.swing.JLabel();
        labelPointsFind = new javax.swing.JLabel();
        textFoundName = new javax.swing.JTextField();
        textFoundLast = new javax.swing.JTextField();
        textFoundPoints = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaRank = new javax.swing.JTextArea();
        labelRank = new javax.swing.JLabel();
        bRanking = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();

        labelWelcome.setBackground(new java.awt.Color(0, 51, 255));
        labelWelcome.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 48)); // NOI18N
        labelWelcome.setForeground(new java.awt.Color(0, 0, 204));
        labelWelcome.setText("BIENVENIDOS A JUEGRAFIA");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        labelWelcome1.setBackground(new java.awt.Color(0, 51, 255));
        labelWelcome1.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        labelWelcome1.setForeground(new java.awt.Color(0, 0, 204));
        labelWelcome1.setText("welcome to juegrafÍA");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelName.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        labelName.setForeground(new java.awt.Color(255, 255, 0));
        labelName.setText("NAME");
        labelName.setToolTipText(" ");
        jPanel1.add(labelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        textName.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jPanel1.add(textName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 190, 30));

        labelLastName.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        labelLastName.setForeground(new java.awt.Color(255, 255, 0));
        labelLastName.setText("LAST NAME");
        jPanel1.add(labelLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 130, 30));

        textLastName.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        textLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textLastNameActionPerformed(evt);
            }
        });
        jPanel1.add(textLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 190, 30));

        buttonBegin.setBackground(new java.awt.Color(51, 255, 0));
        buttonBegin.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        buttonBegin.setText("PLAY NOW!");
        buttonBegin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonBegin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBeginActionPerformed(evt);
            }
        });
        jPanel1.add(buttonBegin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 130, 50));

        textPoints.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        textPoints.setText("0");
        textPoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPointsActionPerformed(evt);
            }
        });
        jPanel1.add(textPoints, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 90, 30));

        buttonSave.setBackground(new java.awt.Color(102, 102, 102));
        buttonSave.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        buttonSave.setText("SAVE");
        buttonSave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });
        jPanel1.add(buttonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 110, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/mapamundi_1.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 330, 260));

        labelPoints.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        labelPoints.setForeground(new java.awt.Color(255, 255, 0));
        labelPoints.setText("SCORE");
        jPanel1.add(labelPoints, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 80, -1));

        instructions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/inst_1.png"))); // NOI18N
        instructions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructionsActionPerformed(evt);
            }
        });
        jPanel1.add(instructions, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 160, -1));

        laberImagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/BanderaColombia.png"))); // NOI18N
        jPanel1.add(laberImagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 520, 580));

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(255, 255, 0)));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("SEARCH YOUR SCORE :");

        textSearchName.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        textSearchName.setText("Write your name here...");
        textSearchName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textSearchNameMouseClicked(evt);
            }
        });
        textSearchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSearchNameActionPerformed(evt);
            }
        });

        buttonSearch.setBackground(new java.awt.Color(153, 153, 153));
        buttonSearch.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        buttonSearch.setText("SEARCH");
        buttonSearch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        labelFindName.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        labelFindName.setForeground(new java.awt.Color(255, 255, 0));
        labelFindName.setText("NAME FOUND ");

        labelLastFind.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        labelLastFind.setForeground(new java.awt.Color(255, 255, 0));
        labelLastFind.setText("LAST NAME FOUND");

        labelPointsFind.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        labelPointsFind.setForeground(new java.awt.Color(255, 255, 0));
        labelPointsFind.setText("FINAL SCORE");

        textFoundName.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N

        textFoundLast.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N

        textFoundPoints.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(labelFindName, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelPointsFind)
                            .addComponent(labelLastFind))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textFoundLast, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFoundName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFoundPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(textSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFoundName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFindName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLastFind)
                    .addComponent(textFoundLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPointsFind)
                    .addComponent(textFoundPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(255, 255, 0)));

        areaRank.setColumns(20);
        areaRank.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        areaRank.setRows(5);
        areaRank.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(areaRank);

        labelRank.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        labelRank.setForeground(new java.awt.Color(255, 255, 0));
        labelRank.setText("BEST SCORES");

        bRanking.setBackground(new java.awt.Color(153, 153, 153));
        bRanking.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        bRanking.setText("RANKING");
        bRanking.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRankingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 168, Short.MAX_VALUE)
                .addComponent(labelRank)
                .addGap(137, 137, 137))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(bRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRank)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonExit.setBackground(new java.awt.Color(255, 102, 102));
        buttonExit.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        buttonExit.setText("EXIT GAME");
        buttonExit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 475, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(labelWelcome1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelWelcome1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        labelWelcome1.getAccessibleContext().setAccessibleName("WELCOME TO JUEGRAFÍA");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textSearchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSearchNameActionPerformed
       
       
    }//GEN-LAST:event_textSearchNameActionPerformed

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonExitActionPerformed

    private void buttonBeginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBeginActionPerformed
       String nam= textName.getText();
       String last= textLastName.getText();
       Files fi= new Files();
       fi.fillFile(0);
       
        if((textName.getText().equals(""))||(textLastName.getText().equals(""))){
             JOptionPane.showMessageDialog(null, "LOS CAMPOS DE TEXTO NOMBRE Y APELLIDO, SON OBLIGATORIOS!!!","ERROR", JOptionPane.ERROR_MESSAGE);
        }else if(num(nam)||num(last)){
            JOptionPane.showMessageDialog(null, "NO PUEDE HABER UN NUMERO EN NOMBRE O APELLIDO!!!","ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
                WindowGame window = new WindowGame();
		window.setVisible(true);
		window.setPreferredSize(new Dimension(1300,730));
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                clip.play();
        }    
    }//GEN-LAST:event_buttonBeginActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        pointsPlus();
        
        String text=textPoints.getText();
        int number= Integer.parseInt(text);
        String nam= textName.getText();
        String last= textLastName.getText();


        if((textName.getText().equals(""))||(textLastName.getText().equals(""))){  
            JOptionPane.showMessageDialog(null, "LOS CAMPOS DE TEXTO NOMBRE Y APELLIDO, SON OBLIGATORIOS!!!","ERROR", JOptionPane.ERROR_MESSAGE);
        
        }else if(num(nam)||num(last)){  
            JOptionPane.showMessageDialog(null, "NO PUEDE HABER UN NUMERO EN NOMBRE O APELLIDO!!!","ERROR", JOptionPane.ERROR_MESSAGE);
        
        }else{
            save(textName.getText(), textLastName.getText(), number);
        } 
        textName.setText("");
        textLastName.setText("");
        textPoints.setText("0");
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
       
        if(textSearchName.getText().equalsIgnoreCase("")){
             JOptionPane.showMessageDialog(null, "Campo de texto vacío...","Error!", JOptionPane.ERROR_MESSAGE);  
        }else{
             search(textSearchName.getText());
        }
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void bRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRankingActionPerformed
        ranking();
        
        if(areaRank.getText().equalsIgnoreCase("")){
            System.out.print("ARCHIVO DE TEXTO VACIO");
        }else{
        archiveRanking();
        }
    }//GEN-LAST:event_bRankingActionPerformed

    private void textLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textLastNameActionPerformed

    private void textSearchNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSearchNameMouseClicked
        textSearchName.setText("");
    }//GEN-LAST:event_textSearchNameMouseClicked

    private void textPointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPointsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPointsActionPerformed

    private void instructionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructionsActionPerformed
      Instructions i = new Instructions();
      i.setVisible(true);
      i.setPreferredSize(new Dimension(880,694));
      i.pack();
      i.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }//GEN-LAST:event_instructionsActionPerformed

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
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
            }
        });
    }
    
    
    ArrayList<Gamer>list= new ArrayList();
    
    public void save(String name, String lastName, int points){
        Gamer g=new Gamer(name, lastName, points);
        list.add(g);
    }
    
    public void search(String nam){
        
        Iterator it=list.iterator();
        while(it.hasNext()){
        Gamer gam=(Gamer)it.next();
        if(nam.equalsIgnoreCase(gam.getName())){
            textFoundName.setText(gam.getName());
            textFoundLast.setText(gam.getLastName());
            textFoundPoints.setText(gam.toString2());
           
        }else{
             JOptionPane.showMessageDialog(null, "Lo sentimos!, el jugador que usted digitó\nNO se encuentra en nuestros registros...","Error!", JOptionPane.ERROR_MESSAGE);  
        }
    }
    }
    
    public void ranking(){
        
        Collections.sort(list);
        
        Iterator it2= list.iterator();
        String chain ="";
         
        while (it2.hasNext()){
    
        Gamer g = (Gamer)it2.next();
        chain+=g;  
        
    }areaRank.setText(chain);   
  
    }
    
    public void archiveRanking(){
      try{
            FileWriter archivo;
            archivo = new FileWriter("src//controller//ranking.txt");
            PrintWriter pw=new PrintWriter(archivo);
            Iterator it2 =list.iterator();
            String cadena = "";
            while(it2.hasNext()){
               Gamer cont=(Gamer)it2.next();
        
           cadena+=cont;
    
        }
            pw.print("\n"+cadena+"\n");
            pw.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static boolean num(String chain){
        boolean result;
        try{
            Integer.parseInt(chain);
            result= true;
        }catch(NumberFormatException qq){
            result=false;
        }
        return result;
    }
    
    public void pointsPlus(){
        
        Files plus = new Files();
        
        int pointsPlus,pointsIni;
        String aux;
        
        pointsPlus = plus.constant();
        pointsIni= Integer.parseInt(textPoints.getText());
        aux=Integer.toString(pointsPlus);
        textPoints.setText(aux);
 
    }

    
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaRank;
    private javax.swing.JButton bRanking;
    private javax.swing.JButton buttonBegin;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonSave;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton instructions;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFindName;
    private javax.swing.JLabel labelLastFind;
    private javax.swing.JLabel labelLastName;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPoints;
    private javax.swing.JLabel labelPointsFind;
    private javax.swing.JLabel labelRank;
    private javax.swing.JLabel labelWelcome;
    private javax.swing.JLabel labelWelcome1;
    private javax.swing.JLabel laberImagen1;
    private javax.swing.JTextField textFoundLast;
    private javax.swing.JTextField textFoundName;
    private javax.swing.JTextField textFoundPoints;
    private javax.swing.JTextField textLastName;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textPoints;
    private javax.swing.JTextField textSearchName;
    // End of variables declaration//GEN-END:variables

}
