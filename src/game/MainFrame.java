/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.IntArrayData;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.Action;
import javax.swing.JButton;


public class MainFrame extends javax.swing.JFrame {

    int[] intArray = new int[18];
    ArrayList<Integer> array = new ArrayList<>();
    ArrayList<Integer> array2 = new ArrayList<>();
    private MyButton rememberedButton1 = new MyButton();
    private MyButton rememberedButton2 = new MyButton();
    Random generator = new Random();
    int r;
    public MainFrame() {
    
        rememberedButton1 = null;
        initComponents();
        for(int i=0;i<5;i++){
           // this.mainPanel.add(new MyButton(i));
            array.add(i);
            array2.add(i);
              }
       
        for(int i=4;i>0;i--){
            r = generator.nextInt(i);
            MyButton button = new MyButton(array.get(r));
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button.uncover();
                    if(rememberedButton1 == null){
                        
                        rememberedButton1 = button;
                        button.setEnabled(false);
                    }
                    else {
                        if(button.match(rememberedButton1)){
                            button.setEnabled(false);
                            rememberedButton1.setEnabled(false);
                                }
                        else {
                            
                            button.uncover();
                            rememberedButton1.uncover();
                            rememberedButton1.setEnabled(true);
                        }
                        rememberedButton1 = null;
                    }
                }
            });
            this.mainPanel.add(button);
            
            array.remove(r);
            r = generator.nextInt(i);
            MyButton button2 = new MyButton(array2.get(r));
            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   button2.uncover();
                    if(rememberedButton1 == null){
                        
                        rememberedButton1 = button2;
                        button2.setEnabled(false);
                    }
                    else{
                        if(button2.match(rememberedButton1)){
                            button2.setEnabled(false);
                            rememberedButton1.setEnabled(false);
                            
                                }
                        else {
                            button2.uncover();
                            rememberedButton1.uncover();
                            rememberedButton1.setEnabled(true);
                            
                        }
                        rememberedButton1 = null;
                    }
                }
            });
            this.mainPanel.add(button2);
            array2.remove(r);
        }
        
        
        
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bottomPanel = new javax.swing.JPanel();
        restartButton = new javax.swing.JButton();
        topPanel = new javax.swing.JPanel();
        points = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        restartButton.setText("RESTART");

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(restartButton)
                .addContainerGap(169, Short.MAX_VALUE))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(restartButton, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        points.setText("Points");

        time.setText("Time");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(points)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(time)
                .addGap(69, 69, 69))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(points)
                    .addComponent(time)))
        );

        mainPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mainPanel.setLayout(new java.awt.GridLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bottomPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel points;
    private javax.swing.JButton restartButton;
    private javax.swing.JLabel time;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
