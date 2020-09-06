
package Cipher;

import javax.swing.JOptionPane;


public class CeaseCipher extends javax.swing.JFrame {


    public CeaseCipher() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Decryption = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Encryption = new javax.swing.JButton();
        KEY = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Encode = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Decode = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cease cipher");

        Decryption.setText("Decrypt");
        Decryption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecryptionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Key");

        Encryption.setText("Encrypt");
        Encryption.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EncryptionMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                EncryptionMouseReleased(evt);
            }
        });
        Encryption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncryptionActionPerformed(evt);
            }
        });

        KEY.setName(""); // NOI18N
        KEY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KEYMouseClicked(evt);
            }
        });

        jLabel2.setText("Encode");

        jLabel3.setText("Decode");

        Encode.setColumns(20);
        Encode.setRows(5);
        Encode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EncodeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Encode);

        Decode.setColumns(20);
        Decode.setRows(5);
        Decode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DecodeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Decode);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(KEY, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Decryption)
                            .addComponent(Encryption))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Encryption, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KEY, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Decryption, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(25, Short.MAX_VALUE))))
        );

        KEY.getAccessibleContext().setAccessibleName("");
        KEY.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EncryptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncryptionActionPerformed
       //su dung bang alphabet
        String encode = Encode.getText().toUpperCase();  
        String decode = "";
        Integer key=null;
        try {
        key = Integer.parseInt(KEY.getText());
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Key bắc buộc là số!!!! ");
            Decode.setText("");
        }
        
        
        
        
        
         for (int i = 0; i < encode.length(); i++) 
             if ((int)encode.charAt(i) == 32){
                    //Khoang trang de nguyen
                    decode += (char)32;
                    Decode.setText(decode);             
                } else {     
                    decode += (char)(((int)encode.charAt(i) + key - 65) % 26 + 65);
                    Decode.setText(decode);
                }
            
         
         
         
    }//GEN-LAST:event_EncryptionActionPerformed

    private void DecryptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecryptionActionPerformed
        String decode = Decode.getText().toUpperCase();
        String encode = "";
        
        Integer key=null;
        try {
        key = Integer.parseInt(KEY.getText());
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Key bắc buộc là số!!!! ");
            Encode.setText("");
        }
        
        
        
        
        for (int i = 0; i < decode.length(); i++) {
                //Khoang trang de nguyen
                if((int)decode.charAt(i) == 32){
                    encode += (char)32;
                    Encode.setText(encode);
                } else {
                    encode += (char)(((int)decode.charAt(i) -  key + 65) % 26 + 65);
                    Encode.setText(encode);
                }

            }
        
        
        
    }//GEN-LAST:event_DecryptionActionPerformed

    private void EncryptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EncryptionMouseClicked

        
    }//GEN-LAST:event_EncryptionMouseClicked

    private void KEYMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KEYMouseClicked

        
        
    }//GEN-LAST:event_KEYMouseClicked

    private void EncryptionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EncryptionMouseReleased

        
    }//GEN-LAST:event_EncryptionMouseReleased

    private void EncodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EncodeMouseClicked
        Decode.setText("");

    }//GEN-LAST:event_EncodeMouseClicked

    private void DecodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DecodeMouseClicked

        Encode.setText("");
    }//GEN-LAST:event_DecodeMouseClicked


    public static void main(String args[]) {

        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CeaseCipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CeaseCipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CeaseCipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CeaseCipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }



        java.awt.EventQueue.invokeLater(() -> {
            new CeaseCipher().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Decode;
    private javax.swing.JButton Decryption;
    private javax.swing.JTextArea Encode;
    private javax.swing.JButton Encryption;
    private javax.swing.JTextField KEY;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
