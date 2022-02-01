/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.calcul;
import java.awt.* ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;
import javax.swing.* ;

/**
 *
 * @author oussa
 */


public class Calculatrice extends  JFrame {
    Double result ;
    Double first ;
    Double second ;
    String operation ;
    JTextField Fld = new JTextField("") ;
    JButton btn1 = new JButton("+") ;
    JButton btn2 = new JButton("-") ;
    JButton btn4 = new JButton("/") ;
    JButton btn3 = new JButton("*") ;
    JButton btn5 = new JButton("ClearAll") ;
    JButton btn6 = new JButton("ENTER") ;
    JButton btn10 = new JButton("+/-") ;
    
    public Calculatrice()
    {       
        JPanel p1 = new JPanel(new BorderLayout()) ;
        JPanel p3 = new JPanel() ;
        JPanel p4 = new JPanel(new BorderLayout()) ;
        
        
        JButton btn0 = new JButton("0") ;
        
        
        
        JButton btn7 = new JButton("7") ;
        JButton btn8 = new JButton("8") ;
        JButton btn9 = new JButton("9") ;
        
        JButton btn14 = new JButton("4") ;
        JButton btn15 = new JButton("5") ;
        JButton btn16 = new JButton("6") ;
        
        JButton btn11 = new JButton("1") ;
        JButton btn12= new JButton("2") ;
        JButton btn13 = new JButton("3") ;
        
        
        
        
        
                
            
        
        p1.setLayout(new GridLayout(4,3)) ;
        p3.setLayout(new GridLayout(4,1)) ;
        p4.setLayout(new GridLayout(1,1)) ;
        
        // ajouter des boutons 
        
        p1.add(btn7) ;
        p1.add(btn8) ;
        p1.add(btn9) ;
        
        p1.add(btn14) ;
        p1.add(btn15) ;
        p1.add(btn16) ;
        
        p1.add(btn11) ;
        p1.add(btn12) ;
        p1.add(btn13) ;
        
        
        
        
        
        p1.add(btn0) ;
        p1.add(btn10) ;
        p1.add(btn5) ;
        
        p3.add(btn1) ;
        
        p3.add(btn2) ;
        p3.add(btn3) ;
        p3.add(btn4) ;
        
        p4.add(btn6) ;
        
        
        
        
        // fin ajout des boutons
        
        //changer la coleur 
        btn5.setForeground(new Color (255,0,255));
        btn6.setForeground(new Color (0,255,0));
        
        btn1.setForeground(new Color (255,0,0));
        btn2.setForeground(new Color (255,0,0));
        btn3.setForeground(new Color (255,0,0));
        btn4.setForeground(new Color (255,0,0));
        
        btn0.setForeground(new Color (0,0,255));
        btn7.setForeground(new Color (0,0,255));
        btn8.setForeground(new Color (0,0,255));
        btn9.setForeground(new Color (0,0,255));
        btn10.setForeground(new Color (0,0,255));
        btn11.setForeground(new Color (0,0,255));
        btn12.setForeground(new Color (0,0,255));
        btn13.setForeground(new Color (0,0,255));
        btn14.setForeground(new Color (0,0,255));
        btn15.setForeground(new Color (0,0,255));
        btn16.setForeground(new Color (0,0,255));
        
        //fin changer couleurs
        
        JPanel p2 = new JPanel(new BorderLayout()) ;
        p2.add(Fld,BorderLayout.NORTH) ;
        p2.add(p1,BorderLayout.CENTER) ;
        p2.add(p3,BorderLayout.EAST) ;
        p2.add(p4,BorderLayout.SOUTH) ;
        
        add(p2, BorderLayout.CENTER) ;
        
        // les Actions des boutons chiffres 
        
        BtnListenerClass listener1 = new BtnListenerClass(btn0,Fld) ;
        btn0.addActionListener(listener1) ;
        
        BtnListenerClass listener2 = new BtnListenerClass(btn7,Fld) ;
        btn7.addActionListener(listener2) ;
        
        BtnListenerClass listener3 = new BtnListenerClass(btn8,Fld) ;
        btn8.addActionListener(listener3) ;
        
        BtnListenerClass listener4 = new BtnListenerClass(btn9,Fld) ;
        btn9.addActionListener(listener4) ;
        
        BtnListenerClass listener5 = new BtnListenerClass(btn11,Fld) ;
        btn11.addActionListener(listener5) ;
        
        BtnListenerClass listener6 = new BtnListenerClass(btn12,Fld) ;
        btn12.addActionListener(listener6) ;
        
        BtnListenerClass listener7 = new BtnListenerClass(btn13,Fld) ;
        btn13.addActionListener(listener7) ;
        
        BtnListenerClass listener8 = new BtnListenerClass(btn14,Fld) ;
        btn14.addActionListener(listener8) ;
        
        BtnListenerClass listener9 = new BtnListenerClass(btn15,Fld) ;
        btn15.addActionListener(listener9) ;
        
        BtnListenerClass listener10 = new BtnListenerClass(btn16,Fld) ;
        btn16.addActionListener(listener10) ;
        
        
        //Action pour les operation
        
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });
        
        // fin Action pour les opération

        //Action Clear All 
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        //Fin Action Clear All 
        
        //Action +/-
        btn10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });
    }
    private void btn1ActionPerformed(ActionEvent evt) {  
        int l=(Fld.getText()).length() ;
        String st = Fld.getText() ;
        String[] words = st.split(",");
        if (words.length== 2)
            st=words[0]+"."+words[1] ;
        // TODO add your handling code here:
        first = Double.parseDouble(st) ;
        Fld.setText("");
        operation = "+" ;
        
    }
    
    private void btn2ActionPerformed(ActionEvent evt) {                                          
        // TODO add your handling code here:
        int l=(Fld.getText()).length() ;
        String st = Fld.getText() ;
        String[] words = st.split(",");
        if (words.length== 2)
            st=words[0]+"."+words[1] ;
        first = Double.parseDouble(st) ;
        Fld.setText("");
        operation = "-" ;
        
    }
    
    private void btn3ActionPerformed(ActionEvent evt) {                                          
        // TODO add your handling code here:
        int l=(Fld.getText()).length() ;
        String st = Fld.getText() ;
        String[] words = st.split(",");
        if (words.length== 2)
            st=words[0]+"."+words[1] ;
        first = Double.parseDouble(st) ;
        Fld.setText("");
        operation = "*" ;
        
    }
    
    private void btn4ActionPerformed(ActionEvent evt) {                                          
        // TODO add your handling code here:
        int l=(Fld.getText()).length() ;
        String st = Fld.getText() ;
        String[] words = st.split(",");
        if (words.length== 2)
            st=words[0]+"."+words[1] ;
        first = Double.parseDouble(st) ;
        Fld.setText("");
        operation = "/" ;
        
    }
    
    private void EnterActionPerformed(ActionEvent evt) {                                          
        // TODO add your handling code here:
        String answer ;
        second = Double.parseDouble(Fld.getText()) ;
        if (operation == "+")
        {
            result = first + second ;
            answer= String.format("%.2f",result) ;
            Fld.setText(answer) ;
        }
        else if (operation == "-")
        {
            result = first - second ;
            answer= String.format("%.2f",result) ;
            Fld.setText(answer) ;
        }
        else if (operation == "*")
        {
            result = first * second ;
            answer= String.format("%.2f",result) ;
            Fld.setText(answer) ;
        }
        else if (operation == "/")
        {
            if (second != 0)
            {
                result = first / second ;
                answer= String.format("%.2f",result) ;
                Fld.setText(answer) ;
            }
            else
            {

                
                JOptionPane.showMessageDialog(this,"on ne peut pas diviser par 0","Division",JOptionPane.INFORMATION_MESSAGE) ;
            }
            
        }
        
    }
    
    private void ClearActionPerformed(ActionEvent evt) {                                          
        // TODO add your handling code here:
        Fld.setText("");
    }
    
    private void btn10ActionPerformed(ActionEvent evt) {                                          
        // TODO add your handling code here:
        Double D ;
        D = Double.parseDouble(Fld.getText()) ;
        D = -D ;
        Fld.setText(String.format("%.0f",D));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculatrice frame = new Calculatrice() ;
        frame.setTitle("Calculatrice");
        frame.setSize(300,200) ;
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        frame.setVisible(true) ;
        
    }


}

class BtnListenerClass implements ActionListener{
            
    JButton Btn = new JButton() ;
    JTextField Fld = new JTextField() ;
    public BtnListenerClass(JButton btn , JTextField Txt)
    {
        Btn = btn ;
        Fld = Txt ;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String number = Fld.getText()+Btn.getText();
        Fld.setText(number);
    }
}


