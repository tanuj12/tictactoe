/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;

/**
 *
 * @author Tanuj
 */
 class Frame extends JFrame{
     Frame(){
         this.setTitle("TicTacToe");
         this.setSize(500, 200); 
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         BuildPanel();
     }
    void BuildPanel(){
        this.setLayout(new GridLayout(3,3));         
     }
 
}
  
public class TicTacToe{
    /**
     * @param args the command line arguments
     */
        public static JButton Button1 = new JButton();
        public static JButton Button2 = new JButton();
        public static JButton Button3 = new JButton();
        public static JButton Button4 = new JButton();
        public static JButton Button5 = new JButton();
       public static JButton Button6 = new JButton();
        public static JButton Button7 = new JButton();
        public static JButton Button8 = new JButton();
        public static JButton Button9 = new JButton();
        public static ActionListener a = new ButtonListener();
         
    public static void main(String[] args) {
    
// TODO code application logic here
          Frame window = new Frame();
              window.add(Button1);
         window.add(Button2);
         window.add(Button3);
         window.add(Button4);
         window.add(Button5);
         window.add(Button6);
         window.add(Button7);
         window.add(Button8);
         window.add(Button9);
         
         Button1.addActionListener(a);
         Button2.addActionListener(a);
         Button3.addActionListener(a);
         Button4.addActionListener(a);
         Button5.addActionListener(a);
         Button6.addActionListener(a);
         Button7.addActionListener(a);
         Button8.addActionListener(a);
         Button9.addActionListener(a);
           window.setVisible(true);
    }
 
    
}

          class ButtonListener implements ActionListener{
              public boolean turn =true;
    public void actionPerformed(ActionEvent e){
        Object i= e.getSource();
        if(i ==TicTacToe.Button1){
            if(turn == true){
                if(TicTacToe.Button1.getText()!= "X" && TicTacToe.Button1.getText()!= "O"){
                
                TicTacToe.Button1.setText("X");
                turn =false;    
                if((TicTacToe.Button1.getText() == "X" && TicTacToe.Button2.getText() == "X" && TicTacToe.Button3.getText() == "X") ||
                        (TicTacToe.Button1.getText() == "X" && TicTacToe.Button4.getText() == "X" && TicTacToe.Button7.getText() == "X")||
                        (TicTacToe.Button1.getText() == "X" && TicTacToe.Button5.getText() == "X" && TicTacToe.Button9.getText() == "X")){
                    TicTacToe.Button1.setText("1");
                    TicTacToe.Button2.setText("1");
                    TicTacToe.Button3.setText("1");
                    TicTacToe.Button4.setText("1");
                    TicTacToe.Button5.setText("1");
                    TicTacToe.Button6.setText("1");
                    TicTacToe.Button7.setText("1");
                    TicTacToe.Button8.setText("1");
                    TicTacToe.Button9.setText("1");
                                        TicTacToe.Button1.removeActionListener(TicTacToe.a);
                    TicTacToe.Button2.removeActionListener(TicTacToe.a);
                    TicTacToe.Button3.removeActionListener(TicTacToe.a);
                    TicTacToe.Button4.removeActionListener(TicTacToe.a);
                    TicTacToe.Button5.removeActionListener(TicTacToe.a);
                    TicTacToe.Button6.removeActionListener(TicTacToe.a);
                    TicTacToe.Button7.removeActionListener(TicTacToe.a);
                    TicTacToe.Button8.removeActionListener(TicTacToe.a);
                    TicTacToe.Button9.removeActionListener(TicTacToe.a);
                }
                }
            }
            else{
                if(TicTacToe.Button1.getText()!= "X" && TicTacToe.Button1.getText()!= "O"){
                TicTacToe.Button1.setText("O");
                turn =true;
                if((TicTacToe.Button1.getText() == "O" && TicTacToe.Button2.getText() == "O" && TicTacToe.Button3.getText() == "O") ||
                        (TicTacToe.Button1.getText() == "O" && TicTacToe.Button4.getText() == "O" && TicTacToe.Button7.getText() == "O")||
                        (TicTacToe.Button1.getText() == "O" && TicTacToe.Button5.getText() == "O" && TicTacToe.Button9.getText() == "O")){
                    TicTacToe.Button1.setText("2");
                    TicTacToe.Button2.setText("2");
                    TicTacToe.Button3.setText("2");
                    TicTacToe.Button4.setText("2");
                    TicTacToe.Button5.setText("2");
                    TicTacToe.Button6.setText("2");
                    TicTacToe.Button7.setText("2");
                    TicTacToe.Button8.setText("2");
                    TicTacToe.Button9.setText("2");
                                        TicTacToe.Button1.removeActionListener(TicTacToe.a);
                    TicTacToe.Button2.removeActionListener(TicTacToe.a);
                    TicTacToe.Button3.removeActionListener(TicTacToe.a);
                    TicTacToe.Button4.removeActionListener(TicTacToe.a);
                    TicTacToe.Button5.removeActionListener(TicTacToe.a);
                    TicTacToe.Button6.removeActionListener(TicTacToe.a);
                    TicTacToe.Button7.removeActionListener(TicTacToe.a);
                    TicTacToe.Button8.removeActionListener(TicTacToe.a);
                    TicTacToe.Button9.removeActionListener(TicTacToe.a);
                }
                }
            }
        }
        if(i ==TicTacToe.Button2){
            if(turn == true){
                if(TicTacToe.Button2.getText()!= "X" && TicTacToe.Button2.getText()!= "O"){
                
                TicTacToe.Button2.setText("X");
                turn =false;
                    if((TicTacToe.Button1.getText() == "X" && TicTacToe.Button2.getText() == "X" && TicTacToe.Button3.getText() == "X") ||
                        (TicTacToe.Button2.getText() == "X" && TicTacToe.Button5.getText() == "X" && TicTacToe.Button8.getText() == "X")){
                    TicTacToe.Button1.setText("1");
                    TicTacToe.Button2.setText("1");
                    TicTacToe.Button3.setText("1");
                    TicTacToe.Button4.setText("1");
                    TicTacToe.Button5.setText("1");
                    TicTacToe.Button6.setText("1");
                    TicTacToe.Button7.setText("1");
                    TicTacToe.Button8.setText("1");
                    TicTacToe.Button9.setText("1");
                                    TicTacToe.Button1.removeActionListener(TicTacToe.a);
                    TicTacToe.Button2.removeActionListener(TicTacToe.a);
                    TicTacToe.Button3.removeActionListener(TicTacToe.a);
                    TicTacToe.Button4.removeActionListener(TicTacToe.a);
                    TicTacToe.Button5.removeActionListener(TicTacToe.a);
                    TicTacToe.Button6.removeActionListener(TicTacToe.a);
                    TicTacToe.Button7.removeActionListener(TicTacToe.a);
                    TicTacToe.Button8.removeActionListener(TicTacToe.a);
                    TicTacToe.Button9.removeActionListener(TicTacToe.a);
                    }
                }
            }
            else{
                if(TicTacToe.Button2.getText()!= "X" && TicTacToe.Button2.getText()!= "O"){
                TicTacToe.Button2.setText("O");
                turn =true;
                if((TicTacToe.Button1.getText() == "O" && TicTacToe.Button2.getText() == "O" && TicTacToe.Button3.getText() == "O") ||
                        (TicTacToe.Button2.getText() == "O" && TicTacToe.Button5.getText() == "O" && TicTacToe.Button8.getText() == "O")){
                    TicTacToe.Button1.setText("2");
                    TicTacToe.Button2.setText("2");
                    TicTacToe.Button3.setText("2");
                    TicTacToe.Button4.setText("2");
                    TicTacToe.Button5.setText("2");
                    TicTacToe.Button6.setText("2");
                    TicTacToe.Button7.setText("2");
                    TicTacToe.Button8.setText("2");
                    TicTacToe.Button9.setText("2");
                                    TicTacToe.Button1.removeActionListener(TicTacToe.a);
                    TicTacToe.Button2.removeActionListener(TicTacToe.a);
                    TicTacToe.Button3.removeActionListener(TicTacToe.a);
                    TicTacToe.Button4.removeActionListener(TicTacToe.a);
                    TicTacToe.Button5.removeActionListener(TicTacToe.a);
                    TicTacToe.Button6.removeActionListener(TicTacToe.a);
                    TicTacToe.Button7.removeActionListener(TicTacToe.a);
                    TicTacToe.Button8.removeActionListener(TicTacToe.a);
                    TicTacToe.Button9.removeActionListener(TicTacToe.a);
                }
                }
            }
        }
        if(i ==TicTacToe.Button3){
            if(turn == true){
                if(TicTacToe.Button3.getText()!= "X" && TicTacToe.Button3.getText()!= "O"){
                
                TicTacToe.Button3.setText("X");
                turn =false;
                    if((TicTacToe.Button1.getText() == "X" && TicTacToe.Button2.getText() == "X" && TicTacToe.Button3.getText() == "X") ||
                        (TicTacToe.Button3.getText() == "X" && TicTacToe.Button6.getText() == "X" && TicTacToe.Button9.getText() == "X")||
                        (TicTacToe.Button7.getText() == "X" && TicTacToe.Button5.getText() == "X" && TicTacToe.Button3.getText() == "X")){
                    TicTacToe.Button1.setText("1");
                    TicTacToe.Button2.setText("1");
                    TicTacToe.Button3.setText("1");
                    TicTacToe.Button4.setText("1");
                    TicTacToe.Button5.setText("1");
                    TicTacToe.Button6.setText("1");
                    TicTacToe.Button7.setText("1");
                    TicTacToe.Button8.setText("1");
                    TicTacToe.Button9.setText("1");
                                    TicTacToe.Button1.removeActionListener(TicTacToe.a);
                    TicTacToe.Button2.removeActionListener(TicTacToe.a);
                    TicTacToe.Button3.removeActionListener(TicTacToe.a);
                    TicTacToe.Button4.removeActionListener(TicTacToe.a);
                    TicTacToe.Button5.removeActionListener(TicTacToe.a);
                    TicTacToe.Button6.removeActionListener(TicTacToe.a);
                    TicTacToe.Button7.removeActionListener(TicTacToe.a);
                    TicTacToe.Button8.removeActionListener(TicTacToe.a);
                    TicTacToe.Button9.removeActionListener(TicTacToe.a);
                    }
                }
            }
            else{
                if(TicTacToe.Button3.getText()!= "X" && TicTacToe.Button3.getText()!= "O"){
                TicTacToe.Button3.setText("O");
                turn =true;
                    if((TicTacToe.Button1.getText() == "O" && TicTacToe.Button2.getText() == "O" && TicTacToe.Button3.getText() == "O") ||
                        (TicTacToe.Button3.getText() == "O" && TicTacToe.Button6.getText() == "O" && TicTacToe.Button9.getText() == "O")||
                        (TicTacToe.Button7.getText() == "O" && TicTacToe.Button5.getText() == "O" && TicTacToe.Button3.getText() == "O")){
                    TicTacToe.Button1.setText("2");
                    TicTacToe.Button2.setText("2");
                    TicTacToe.Button3.setText("2");
                    TicTacToe.Button4.setText("2");
                    TicTacToe.Button5.setText("2");
                    TicTacToe.Button6.setText("2");
                    TicTacToe.Button7.setText("2");
                    TicTacToe.Button8.setText("2");
                    TicTacToe.Button9.setText("2");
                                    TicTacToe.Button1.removeActionListener(TicTacToe.a);
                    TicTacToe.Button2.removeActionListener(TicTacToe.a);
                    TicTacToe.Button3.removeActionListener(TicTacToe.a);
                    TicTacToe.Button4.removeActionListener(TicTacToe.a);
                    TicTacToe.Button5.removeActionListener(TicTacToe.a);
                    TicTacToe.Button6.removeActionListener(TicTacToe.a);
                    TicTacToe.Button7.removeActionListener(TicTacToe.a);
                    TicTacToe.Button8.removeActionListener(TicTacToe.a);
                    TicTacToe.Button9.removeActionListener(TicTacToe.a);
                    }
                }
            }
        }
        if(i ==TicTacToe.Button4){
            if(turn == true){
                if(TicTacToe.Button4.getText()!= "X" && TicTacToe.Button4.getText()!= "O"){
                
                TicTacToe.Button4.setText("X");
                turn =false;
                    if((TicTacToe.Button4.getText() == "X" && TicTacToe.Button5.getText() == "X" && TicTacToe.Button6.getText() == "X") ||
                        (TicTacToe.Button1.getText() == "X" && TicTacToe.Button4.getText() == "X" && TicTacToe.Button7.getText() == "X")){
                    TicTacToe.Button1.setText("1");
                    TicTacToe.Button2.setText("1");
                    TicTacToe.Button3.setText("1");
                    TicTacToe.Button4.setText("1");
                    TicTacToe.Button5.setText("1");
                    TicTacToe.Button6.setText("1");
                    TicTacToe.Button7.setText("1");
                    TicTacToe.Button8.setText("1");
                    TicTacToe.Button9.setText("1");
                    TicTacToe.Button1.removeActionListener(TicTacToe.a);
                    TicTacToe.Button2.removeActionListener(TicTacToe.a);
                    TicTacToe.Button3.removeActionListener(TicTacToe.a);
                    TicTacToe.Button4.removeActionListener(TicTacToe.a);
                    TicTacToe.Button5.removeActionListener(TicTacToe.a);
                    TicTacToe.Button6.removeActionListener(TicTacToe.a);
                    TicTacToe.Button7.removeActionListener(TicTacToe.a);
                    TicTacToe.Button8.removeActionListener(TicTacToe.a);
                    TicTacToe.Button9.removeActionListener(TicTacToe.a);
                                        TicTacToe.Button1.removeActionListener(TicTacToe.a);
                    TicTacToe.Button2.removeActionListener(TicTacToe.a);
                    TicTacToe.Button3.removeActionListener(TicTacToe.a);
                    TicTacToe.Button4.removeActionListener(TicTacToe.a);
                    TicTacToe.Button5.removeActionListener(TicTacToe.a);
                    TicTacToe.Button6.removeActionListener(TicTacToe.a);
                    TicTacToe.Button7.removeActionListener(TicTacToe.a);
                    TicTacToe.Button8.removeActionListener(TicTacToe.a);
                    TicTacToe.Button9.removeActionListener(TicTacToe.a);
                    
                }
                }
            }
            else{
                if(TicTacToe.Button4.getText()!= "X" && TicTacToe.Button4.getText()!= "O"){
                TicTacToe.Button4.setText("O");
                turn =true;
                    if((TicTacToe.Button4.getText() == "O" && TicTacToe.Button5.getText() == "O" && TicTacToe.Button6.getText() == "O") ||
                        (TicTacToe.Button1.getText() == "O" && TicTacToe.Button4.getText() == "O" && TicTacToe.Button7.getText() == "O")){
                    TicTacToe.Button1.setText("2");
                    TicTacToe.Button2.setText("2");
                    TicTacToe.Button3.setText("2");
                    TicTacToe.Button4.setText("2");
                    TicTacToe.Button5.setText("2");
                    TicTacToe.Button6.setText("2");
                    TicTacToe.Button7.setText("2");
                    TicTacToe.Button8.setText("2");
                    TicTacToe.Button9.setText("2");
                                    TicTacToe.Button1.removeActionListener(TicTacToe.a);
                    TicTacToe.Button2.removeActionListener(TicTacToe.a);
                    TicTacToe.Button3.removeActionListener(TicTacToe.a);
                    TicTacToe.Button4.removeActionListener(TicTacToe.a);
                    TicTacToe.Button5.removeActionListener(TicTacToe.a);
                    TicTacToe.Button6.removeActionListener(TicTacToe.a);
                    TicTacToe.Button7.removeActionListener(TicTacToe.a);
                    TicTacToe.Button8.removeActionListener(TicTacToe.a);
                    TicTacToe.Button9.removeActionListener(TicTacToe.a);
                    }
                }
            }
        }
        if(i ==TicTacToe.Button5){
            if(turn == true){
                if(TicTacToe.Button5.getText()!= "X" && TicTacToe.Button5.getText()!= "O"){
                
                TicTacToe.Button5.setText("X");
                turn =false;
                    if((TicTacToe.Button2.getText() == "X" && TicTacToe.Button5.getText() == "X" && TicTacToe.Button8.getText() == "X") ||
                        (TicTacToe.Button3.getText() == "X" && TicTacToe.Button5.getText() == "X" && TicTacToe.Button7.getText() == "X")||
                        (TicTacToe.Button1.getText() == "X" && TicTacToe.Button5.getText() == "X" && TicTacToe.Button9.getText() == "X")||
                        (TicTacToe.Button4.getText() == "X" && TicTacToe.Button5.getText() == "X" && TicTacToe.Button6.getText() == "X")){
                    TicTacToe.Button1.setText("1");
                    TicTacToe.Button2.setText("1");
                    TicTacToe.Button3.setText("1");
                    TicTacToe.Button4.setText("1");
                    TicTacToe.Button5.setText("1");
                    TicTacToe.Button6.setText("1");
                    TicTacToe.Button7.setText("1");
                    TicTacToe.Button8.setText("1");
                    TicTacToe.Button9.setText("1");
                                    TicTacToe.Button1.removeActionListener(TicTacToe.a);
                    TicTacToe.Button2.removeActionListener(TicTacToe.a);
                    TicTacToe.Button3.removeActionListener(TicTacToe.a);
                    TicTacToe.Button4.removeActionListener(TicTacToe.a);
                    TicTacToe.Button5.removeActionListener(TicTacToe.a);
                    TicTacToe.Button6.removeActionListener(TicTacToe.a);
                    TicTacToe.Button7.removeActionListener(TicTacToe.a);
                    TicTacToe.Button8.removeActionListener(TicTacToe.a);
                    TicTacToe.Button9.removeActionListener(TicTacToe.a);
                    }
                }
            }
            else{
                if(TicTacToe.Button5.getText()!= "X" && TicTacToe.Button5.getText()!= "O"){
                TicTacToe.Button5.setText("O");
                turn =true;
                if((TicTacToe.Button2.getText() == "O" && TicTacToe.Button5.getText() == "O" && TicTacToe.Button8.getText() == "O") ||
                        (TicTacToe.Button3.getText() == "O" && TicTacToe.Button5.getText() == "O" && TicTacToe.Button7.getText() == "O")||
                        (TicTacToe.Button1.getText() == "O" && TicTacToe.Button5.getText() == "O" && TicTacToe.Button9.getText() == "O")||
                        (TicTacToe.Button4.getText() == "O" && TicTacToe.Button5.getText() == "O" && TicTacToe.Button6.getText() == "O")){
                    TicTacToe.Button1.setText("2");
                    TicTacToe.Button2.setText("2");
                    TicTacToe.Button3.setText("2");
                    TicTacToe.Button4.setText("2");
                    TicTacToe.Button5.setText("2");
                    TicTacToe.Button6.setText("2");
                    TicTacToe.Button7.setText("2");
                    TicTacToe.Button8.setText("2");
                    TicTacToe.Button9.setText("2");
                                    TicTacToe.Button1.removeActionListener(TicTacToe.a);
                    TicTacToe.Button2.removeActionListener(TicTacToe.a);
                    TicTacToe.Button3.removeActionListener(TicTacToe.a);
                    TicTacToe.Button4.removeActionListener(TicTacToe.a);
                    TicTacToe.Button5.removeActionListener(TicTacToe.a);
                    TicTacToe.Button6.removeActionListener(TicTacToe.a);
                    TicTacToe.Button7.removeActionListener(TicTacToe.a);
                    TicTacToe.Button8.removeActionListener(TicTacToe.a);
                    TicTacToe.Button9.removeActionListener(TicTacToe.a);
                }
                }
            }
        }
        if(i ==TicTacToe.Button6){
            if(turn == true){
                if(TicTacToe.Button6.getText()!= "X" && TicTacToe.Button6.getText()!= "O"){
                
                TicTacToe.Button6.setText("X");
                turn =false;
                    if((TicTacToe.Button6.getText() == "X" && TicTacToe.Button5.getText() == "X" && TicTacToe.Button4.getText() == "X") ||
                        (TicTacToe.Button9.getText() == "X" && TicTacToe.Button3.getText() == "X" && TicTacToe.Button6.getText() == "X")){
                    TicTacToe.Button1.setText("1");
                    TicTacToe.Button2.setText("1");
                    TicTacToe.Button3.setText("1");
                    TicTacToe.Button4.setText("1");
                    TicTacToe.Button5.setText("1");
                    TicTacToe.Button6.setText("1");
                    TicTacToe.Button7.setText("1");
                    TicTacToe.Button8.setText("1");
                    TicTacToe.Button9.setText("1");
                                    TicTacToe.Button1.removeActionListener(TicTacToe.a);
                    TicTacToe.Button2.removeActionListener(TicTacToe.a);
                    TicTacToe.Button3.removeActionListener(TicTacToe.a);
                    TicTacToe.Button4.removeActionListener(TicTacToe.a);
                    TicTacToe.Button5.removeActionListener(TicTacToe.a);
                    TicTacToe.Button6.removeActionListener(TicTacToe.a);
                    TicTacToe.Button7.removeActionListener(TicTacToe.a);
                    TicTacToe.Button8.removeActionListener(TicTacToe.a);
                    TicTacToe.Button9.removeActionListener(TicTacToe.a);
                    }
                }
            }
            else{
                if(TicTacToe.Button6.getText()!= "X" && TicTacToe.Button6.getText()!= "O"){
                TicTacToe.Button6.setText("O");
                turn =true;
                    if((TicTacToe.Button6.getText() == "O" && TicTacToe.Button5.getText() == "O" && TicTacToe.Button4.getText() == "O") ||
                        (TicTacToe.Button9.getText() == "O" && TicTacToe.Button3.getText() == "O" && TicTacToe.Button6.getText() == "O")){
                    TicTacToe.Button1.setText("2");
                    TicTacToe.Button2.setText("2");
                    TicTacToe.Button3.setText("2");
                    TicTacToe.Button4.setText("2");
                    TicTacToe.Button5.setText("2");
                    TicTacToe.Button6.setText("2");
                    TicTacToe.Button7.setText("2");
                    TicTacToe.Button8.setText("2");
                    TicTacToe.Button9.setText("2");
                                    TicTacToe.Button1.removeActionListener(TicTacToe.a);
                    TicTacToe.Button2.removeActionListener(TicTacToe.a);
                    TicTacToe.Button3.removeActionListener(TicTacToe.a);
                    TicTacToe.Button4.removeActionListener(TicTacToe.a);
                    TicTacToe.Button5.removeActionListener(TicTacToe.a);
                    TicTacToe.Button6.removeActionListener(TicTacToe.a);
                    TicTacToe.Button7.removeActionListener(TicTacToe.a);
                    TicTacToe.Button8.removeActionListener(TicTacToe.a);
                    TicTacToe.Button9.removeActionListener(TicTacToe.a);
                    }
                }
            }
        }
        if(i ==TicTacToe.Button7){
            if(turn == true){
                if(TicTacToe.Button7.getText()!= "X" && TicTacToe.Button7.getText()!= "O"){
                
                TicTacToe.Button7.setText("X");
                turn =false;
                    if((TicTacToe.Button7.getText() == "X" && TicTacToe.Button8.getText() == "X" && TicTacToe.Button9.getText() == "X") ||
                        (TicTacToe.Button1.getText() == "X" && TicTacToe.Button4.getText() == "X" && TicTacToe.Button7.getText() == "X")||
                        (TicTacToe.Button7.getText() == "X" && TicTacToe.Button5.getText() == "X" && TicTacToe.Button3.getText() == "X")){
                    TicTacToe.Button1.setText("1");
                    TicTacToe.Button2.setText("1");
                    TicTacToe.Button3.setText("1");
                    TicTacToe.Button4.setText("1");
                    TicTacToe.Button5.setText("1");
                    TicTacToe.Button6.setText("1");
                    TicTacToe.Button7.setText("1");
                    TicTacToe.Button8.setText("1");
                    TicTacToe.Button9.setText("1");
                                    TicTacToe.Button1.removeActionListener(TicTacToe.a);
                    TicTacToe.Button2.removeActionListener(TicTacToe.a);
                    TicTacToe.Button3.removeActionListener(TicTacToe.a);
                    TicTacToe.Button4.removeActionListener(TicTacToe.a);
                    TicTacToe.Button5.removeActionListener(TicTacToe.a);
                    TicTacToe.Button6.removeActionListener(TicTacToe.a);
                    TicTacToe.Button7.removeActionListener(TicTacToe.a);
                    TicTacToe.Button8.removeActionListener(TicTacToe.a);
                    TicTacToe.Button9.removeActionListener(TicTacToe.a);
                    }
                }
            }
            else{
                if(TicTacToe.Button7.getText()!= "X" && TicTacToe.Button7.getText()!= "O"){
                TicTacToe.Button7.setText("O");
                turn =true;
                    if((TicTacToe.Button7.getText() == "O" && TicTacToe.Button8.getText() == "O" && TicTacToe.Button9.getText() == "O") ||
                        (TicTacToe.Button1.getText() == "O" && TicTacToe.Button4.getText() == "O" && TicTacToe.Button7.getText() == "O")||
                        (TicTacToe.Button7.getText() == "O" && TicTacToe.Button5.getText() == "O" && TicTacToe.Button3.getText() == "O")){
                    TicTacToe.Button1.setText("2");
                    TicTacToe.Button2.setText("2");
                    TicTacToe.Button3.setText("2");
                    TicTacToe.Button4.setText("2");
                    TicTacToe.Button5.setText("2");
                    TicTacToe.Button6.setText("2");
                    TicTacToe.Button7.setText("2");
                    TicTacToe.Button8.setText("2");
                    TicTacToe.Button9.setText("2");
                                    TicTacToe.Button1.removeActionListener(TicTacToe.a);
                    TicTacToe.Button2.removeActionListener(TicTacToe.a);
                    TicTacToe.Button3.removeActionListener(TicTacToe.a);
                    TicTacToe.Button4.removeActionListener(TicTacToe.a);
                    TicTacToe.Button5.removeActionListener(TicTacToe.a);
                    TicTacToe.Button6.removeActionListener(TicTacToe.a);
                    TicTacToe.Button7.removeActionListener(TicTacToe.a);
                    TicTacToe.Button8.removeActionListener(TicTacToe.a);
                    TicTacToe.Button9.removeActionListener(TicTacToe.a);
                    }
                }
            }
        }
        if(i ==TicTacToe.Button8){
            if(turn == true){
                if(TicTacToe.Button8.getText()!= "X" && TicTacToe.Button8.getText()!= "O"){
                
                TicTacToe.Button8.setText("X");
                turn =false;
                    if((TicTacToe.Button2.getText() == "X" && TicTacToe.Button5.getText() == "X" && TicTacToe.Button8.getText() == "X") ||
                        (TicTacToe.Button7.getText() == "X" && TicTacToe.Button8.getText() == "X" && TicTacToe.Button9.getText() == "X")){
                    TicTacToe.Button1.setText("1");
                    TicTacToe.Button2.setText("1");
                    TicTacToe.Button3.setText("1");
                    TicTacToe.Button4.setText("1");
                    TicTacToe.Button5.setText("1");
                    TicTacToe.Button6.setText("1");
                    TicTacToe.Button7.setText("1");
                    TicTacToe.Button8.setText("1");
                    TicTacToe.Button9.setText("1");
                                    TicTacToe.Button1.removeActionListener(TicTacToe.a);
                    TicTacToe.Button2.removeActionListener(TicTacToe.a);
                    TicTacToe.Button3.removeActionListener(TicTacToe.a);
                    TicTacToe.Button4.removeActionListener(TicTacToe.a);
                    TicTacToe.Button5.removeActionListener(TicTacToe.a);
                    TicTacToe.Button6.removeActionListener(TicTacToe.a);
                    TicTacToe.Button7.removeActionListener(TicTacToe.a);
                    TicTacToe.Button8.removeActionListener(TicTacToe.a);
                    TicTacToe.Button9.removeActionListener(TicTacToe.a);
                    }
                }
            }
            else{
                if(TicTacToe.Button8.getText()!= "X" && TicTacToe.Button8.getText()!= "O"){
                TicTacToe.Button8.setText("O");
                turn =true;
                    if((TicTacToe.Button2.getText() == "O" && TicTacToe.Button5.getText() == "O" && TicTacToe.Button8.getText() == "O") ||
                        (TicTacToe.Button7.getText() == "O" && TicTacToe.Button8.getText() == "O" && TicTacToe.Button9.getText() == "O")){
                    TicTacToe.Button1.setText("2");
                    TicTacToe.Button2.setText("2");
                    TicTacToe.Button3.setText("2");
                    TicTacToe.Button4.setText("2");
                    TicTacToe.Button5.setText("2");
                    TicTacToe.Button6.setText("2");
                    TicTacToe.Button7.setText("2");
                    TicTacToe.Button8.setText("2");
                    TicTacToe.Button9.setText("2");
                                    TicTacToe.Button1.removeActionListener(TicTacToe.a);
                    TicTacToe.Button2.removeActionListener(TicTacToe.a);
                    TicTacToe.Button3.removeActionListener(TicTacToe.a);
                    TicTacToe.Button4.removeActionListener(TicTacToe.a);
                    TicTacToe.Button5.removeActionListener(TicTacToe.a);
                    TicTacToe.Button6.removeActionListener(TicTacToe.a);
                    TicTacToe.Button7.removeActionListener(TicTacToe.a);
                    TicTacToe.Button8.removeActionListener(TicTacToe.a);
                    TicTacToe.Button9.removeActionListener(TicTacToe.a);
                    }
                }
            }
        }
        if(i ==TicTacToe.Button9){
            if(turn == true){
                if(TicTacToe.Button9.getText()!= "X" && TicTacToe.Button9.getText()!= "O"){
                
                TicTacToe.Button9.setText("X");
                turn =false;
                    if((TicTacToe.Button3.getText() == "X" && TicTacToe.Button6.getText() == "X" && TicTacToe.Button9.getText() == "X") ||
                        (TicTacToe.Button7.getText() == "X" && TicTacToe.Button8.getText() == "X" && TicTacToe.Button9.getText() == "X")||
                        (TicTacToe.Button1.getText() == "X" && TicTacToe.Button5.getText() == "X" && TicTacToe.Button9.getText() == "X")){
                    TicTacToe.Button1.setText("1");
                    TicTacToe.Button2.setText("1");
                    TicTacToe.Button3.setText("1");
                    TicTacToe.Button4.setText("1");
                    TicTacToe.Button5.setText("1");
                    TicTacToe.Button6.setText("1");
                    TicTacToe.Button7.setText("1");
                    TicTacToe.Button8.setText("1");
                    TicTacToe.Button9.setText("1");
                                    TicTacToe.Button1.removeActionListener(TicTacToe.a);
                    TicTacToe.Button2.removeActionListener(TicTacToe.a);
                    TicTacToe.Button3.removeActionListener(TicTacToe.a);
                    TicTacToe.Button4.removeActionListener(TicTacToe.a);
                    TicTacToe.Button5.removeActionListener(TicTacToe.a);
                    TicTacToe.Button6.removeActionListener(TicTacToe.a);
                    TicTacToe.Button7.removeActionListener(TicTacToe.a);
                    TicTacToe.Button8.removeActionListener(TicTacToe.a);
                    TicTacToe.Button9.removeActionListener(TicTacToe.a);
                    }
                }
            }
            else{
                if(TicTacToe.Button9.getText()!= "X" && TicTacToe.Button9.getText()!= "O"){
                TicTacToe.Button9.setText("O");
                turn =true;
                    if((TicTacToe.Button3.getText() == "O" && TicTacToe.Button6.getText() == "O" && TicTacToe.Button9.getText() == "O") ||
                        (TicTacToe.Button7.getText() == "O" && TicTacToe.Button8.getText() == "O" && TicTacToe.Button9.getText() == "O")||
                        (TicTacToe.Button1.getText() == "O" && TicTacToe.Button5.getText() == "O" && TicTacToe.Button9.getText() == "O")){
                    TicTacToe.Button1.setText("2");
                    TicTacToe.Button2.setText("2");
                    TicTacToe.Button3.setText("2");
                    TicTacToe.Button4.setText("2");
                    TicTacToe.Button5.setText("2");
                    TicTacToe.Button6.setText("2");
                    TicTacToe.Button7.setText("2");
                    TicTacToe.Button8.setText("2");
                    TicTacToe.Button9.setText("2");
                                    TicTacToe.Button1.removeActionListener(TicTacToe.a);
                    TicTacToe.Button2.removeActionListener(TicTacToe.a);
                    TicTacToe.Button3.removeActionListener(TicTacToe.a);
                    TicTacToe.Button4.removeActionListener(TicTacToe.a);
                    TicTacToe.Button5.removeActionListener(TicTacToe.a);
                    TicTacToe.Button6.removeActionListener(TicTacToe.a);
                    TicTacToe.Button7.removeActionListener(TicTacToe.a);
                    TicTacToe.Button8.removeActionListener(TicTacToe.a);
                    TicTacToe.Button9.removeActionListener(TicTacToe.a);
                    }
                }
            }
        }
    }
}
          