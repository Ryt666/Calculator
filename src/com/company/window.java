package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class window extends JFrame implements WindowListener, ActionListener {
private TextField f = new TextField();
private JButton b7=new JButton("7");
private JButton b8=new JButton("8");
private JButton b9=new JButton("9");
private JButton b4=new JButton("4");
private JButton b5=new JButton("5");
private JButton b6=new JButton("6");
private JButton b1=new JButton("1");
private JButton b2=new JButton("2");
private JButton b3=new JButton("3");
private JButton b0=new JButton("0");
private JButton bnc=new JButton(".");
private JButton botr=new JButton("+-");
private JButton br=new JButton("=");
private JButton Del =new JButton("C");
private JButton bp =new JButton("+");
private JButton bm =new JButton("-");
private JButton by =new JButton("*");
private JButton bd =new JButton("/");
private JButton bs =new JButton("^");
private JButton bk =new JButton("q");
private String text=" ";
private double a=0;
private double b=0;
private char z = '-';
private int width = 80;
private int hight = 50;

    public window() {
    Font ex = new Font("Times New Roman",Font.BOLD,40);
    setLayout(null);
    setSize(400,600);
    setVisible(true);
    setLocation(700,250);

    f.setFont(ex);//передаем шрифт
    f.setSize(330,60);//поле для ввода цифр
    f.setLocation(25,25);
    f.setVisible(true);
    add(f);
    b8.setFont(ex);
    b8.setSize(width,hight);
    b8.setLocation(105,285);
    b8.setVisible(true);
    add(b8);
    b8.addActionListener(this);
    b7.setFont(ex);
    b7.setSize(width,hight);
    b7.setLocation(25,285);
    b7.setVisible(true);
    add(b7);
    b7.addActionListener(this);
    Del.setFont(ex);
    Del.setSize(width,hight);
    Del.setLocation(265,285);
    Del.setVisible(true);
    add(Del);
    Del.addActionListener(this);
    b9.setFont(ex);
    b9.setSize(width,hight);
    b9.setLocation(185,285);
    b9.setVisible(true);
    add(b9);
    b9.addActionListener(this);
    b4.setFont(ex);
    b4.setSize(width,hight);
    b4.setLocation(25,345);
    b4.setVisible(true);
    add(b4);
    b4.addActionListener(this);
    b5.setFont(ex);
    b5.setSize(width,hight);
    b5.setLocation(105,345);
    b5.setVisible(true);
    add(b5);
    b5.addActionListener(this);
    b6.setFont(ex);
    b6.setSize(width,hight);
    b6.setLocation(185,345);
    b6.setVisible(true);
    add(b6);
    b6.addActionListener(this);
    b1.setFont(ex);
    b1.setSize(width,hight);
    b1.setLocation(25,405);
    b1.setVisible(true);
    add(b1);
    b1.addActionListener(this);
    b2.setFont(ex);
    b2.setSize(width,hight);
    b2.setLocation(105,405);
    b2.setVisible(true);
    add(b2);
    b2.addActionListener(this);
    b3.setFont(ex);
    b3.setSize(width,hight);
    b3.setLocation(185,405);
    b3.setVisible(true);
    add(b3);
    b3.addActionListener(this);
    b0.setFont(ex);
    b0.setSize(width,hight);
    b0.setLocation(105,465);
    b0.setVisible(true);
    add(b0);
    b0.addActionListener(this);
    bnc.setFont(ex);
    bnc.setSize(width,hight);
    bnc.setLocation(185,465);
    bnc.setVisible(true);
    add(bnc);
    bnc.addActionListener(this);
    br.setFont(ex);
    br.setSize(width,110);
    br.setLocation(265,405);
    br.setVisible(true);
    add(br);
    br.addActionListener(this);
    botr.setFont(ex);
    botr.setSize(width,hight);
    botr.setLocation(25,465);
    botr.setVisible(true);
    add(botr);
    botr.addActionListener(this);
    bp.setFont(ex);
    bp.setSize(width,hight);
    bp.setLocation(25,225);
    bp.setVisible(true);
    add(bp);
    bp.addActionListener(this);
    bm.setFont(ex);
    bm.setSize(width,hight);
    bm.setLocation(105,225);
    bm.setVisible(true);
    add(bm);
    bm.addActionListener(this);
    bs.setFont(ex);
    bs.setSize(width,hight);
    bs.setLocation(185,225);
    bs.setVisible(true);
    add(bs);
    bs.addActionListener(this);
    bk.setFont(ex);
    bk.setSize(width,hight);
    bk.setLocation(25,164);
    bk.setVisible(true);
    add(bk);
    bk.addActionListener(this);
    by.setFont(ex);
    by.setSize(width,hight);
    by.setLocation(105,164);
    by.setVisible(true);
    add(by);
    by.addActionListener(this);
    bd.setFont(ex);
    bd.setSize(width,hight);
    bd.setLocation(185,164);
    bd.setVisible(true);
    add(bd);
    bd.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b7){
            text=text + b7.getText();
            f.setText(text);
        }
        if(e.getSource()==b8){
            text=text + b8.getText();
            f.setText(text);
        }
        if(e.getSource()==Del){
            text=" ";
            f.setText(text);
        }
        if(e.getSource()==b9){
            text=text + b9.getText();
            f.setText(text);
        }
        if(e.getSource()==b4){
            text=text + b4.getText();
            f.setText(text);
        }
        if(e.getSource()==b5){
            text=text + b5.getText();
            f.setText(text);
        }
        if(e.getSource()==b6){
            text=text + b6.getText();
            f.setText(text);
        }
        if(e.getSource()==b1){
            text=text + b1.getText();
            f.setText(text);
        }
        if(e.getSource()==b2){
            text=text + b2.getText();
            f.setText(text);
        }
        if(e.getSource()==b3){
            text=text + b3.getText();
            f.setText(text);
        }
        if(e.getSource()==b0){
            text=text + b0.getText();
            f.setText(text);
        }
        if(e.getSource()==bnc){
            text=text + bnc.getText();
            f.setText(text);
        }
        if(e.getSource()==botr){
            double c =Double.parseDouble(f.getText());
            c = c* -1;
            f.setText(String.valueOf(c));
            text = String.valueOf(c);
        }
        if(e.getSource()==bp){
             a = Double.parseDouble(text);//из текста в число
            f.setText(text + bp.getText());//плюс
            text=" ";//занулить
            z = '+';//сохраняем плюс

        }
        if(e.getSource()==br){
            if(z=='+'){
                b = Double.parseDouble(text);//оставшийся текст запис в b
                f.setText(String.valueOf(a+b));//обратный перевод чисел в строку

            }
            if(z=='-'){
                b = Double.parseDouble(text);
                f.setText(String.valueOf(a-b));
            }
            if(z=='*'){
                b = Double.parseDouble(text);
                 f.setText(String.valueOf(a*b));
            }
            if(z=='/'){
                b = Double.parseDouble(text);
                f.setText(String.valueOf(a/b));
            }
            if(z=='^'){
                b = Double.parseDouble(text);
                f.setText(String.valueOf(Math.pow(a,b)));
            }
            if(z=='q'){
                b = Double.parseDouble(text);
                f.setText(String.valueOf(Math.pow(a, 1.0/b)));
            }
        }
        if(e.getSource()==bm){
            a = Double.parseDouble(text);
            f.setText(text + bm.getText());
            text=" ";
            z = '-';
        }
        if(e.getSource()==by){
            a = Double.parseDouble(text);
            f.setText(text + by.getText());
            text = " ";
            z = '*';
        }
        if(e.getSource()==bd){
            a = Double.parseDouble(text);
            f.setText(text + bd.getText());
            text=" ";
            z = '/';
        }
        if(e.getSource()==bs){
            a = Double.parseDouble(text);
            f.setText(text + bs.getText());
            text = " ";
            z = '^';
        }
        if(e.getSource()==bk){
            a = Double.parseDouble(text);
            f.setText(text + bk.getText());
            text = " ";
            z = 'q';
        }
    }

    @Override
    public void windowOpened(WindowEvent windowEvent) {

    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {

    }

    @Override
    public void windowClosed(WindowEvent windowEvent) {

    }

    @Override
    public void windowIconified(WindowEvent windowEvent) {

    }

    @Override
    public void windowDeiconified(WindowEvent windowEvent) {

    }

    @Override
    public void windowActivated(WindowEvent windowEvent) {

    }

    @Override
    public void windowDeactivated(WindowEvent windowEvent) {

    }
}
