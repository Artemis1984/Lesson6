package Lesson6;
import jdk.jfr.Unsigned;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class Calculator extends JFrame{


    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton button0 = new JButton("0");

    JButton buttonplus = new JButton("+");
    JButton buttonminus = new JButton("-");
    JButton buttonmul = new JButton("×");
    JButton buttondiv = new JButton("÷");
    JButton buttondeg = new JButton("^");
    JButton buttonAC = new JButton("AC");
    JButton buttonequal = new JButton("=");
    JButton buttonminusplus = new JButton("±");
    JButton buttoncomma = new JButton(",");

    JTextField textField = new JTextField(10);



    double a, b;
    String operation;
    double result;

    String number1, number2;


    public Calculator(){

        JFrame frame = new JFrame("калькулятор");
        frame.setSize(210,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());
        frame.setResizable(false);


        button1.setFont(new Font("ABC", Font.PLAIN, 18));
        button2.setFont(new Font("ABC", Font.PLAIN, 18));
        button3.setFont(new Font("ABC", Font.PLAIN, 18));
        button4.setFont(new Font("ABC", Font.PLAIN, 18));
        button5.setFont(new Font("ABC", Font.PLAIN, 18));
        button6.setFont(new Font("ABC", Font.PLAIN, 18));
        button7.setFont(new Font("ABC", Font.PLAIN, 18));
        button8.setFont(new Font("ABC", Font.PLAIN, 18));
        button9.setFont(new Font("ABC", Font.PLAIN, 18));
        button0.setFont(new Font("ABC", Font.PLAIN, 18));
        buttonplus.setFont(new Font("ABC", Font.PLAIN, 18));
        buttonminus.setFont(new Font("ABC", Font.PLAIN, 18));
        buttonmul.setFont(new Font("ABC", Font.PLAIN, 16));
        buttondiv.setFont(new Font("ABC", Font.PLAIN, 18));
        buttonAC.setFont(new Font("ABC", Font.PLAIN, 15));
        buttonequal.setFont(new Font("ABC", Font.PLAIN, 18));
        buttonminusplus.setFont(new Font("ABC", Font.PLAIN, 18));
        buttondeg.setFont(new Font("ABC", Font.PLAIN, 18));
        buttoncomma.setFont(new Font("ABC", Font.PLAIN, 18));



        button1.setPreferredSize(new Dimension(40,40));
        button2.setPreferredSize(new Dimension(40,40));
        button3.setPreferredSize(new Dimension(40,40));
        button4.setPreferredSize(new Dimension(40,40));
        button5.setPreferredSize(new Dimension(40,40));
        button6.setPreferredSize(new Dimension(40,40));
        button7.setPreferredSize(new Dimension(40,40));
        button8.setPreferredSize(new Dimension(40,40));
        button9.setPreferredSize(new Dimension(40,40));
        button0.setPreferredSize(new Dimension(85,40));

        buttonplus.setPreferredSize(new Dimension(40,40));
        buttonminus.setPreferredSize(new Dimension(40,40));
        buttonmul.setPreferredSize(new Dimension(40,40));
        buttondiv.setPreferredSize(new Dimension(40,40));
        buttonAC.setPreferredSize(new Dimension(40,40));
        buttonequal.setPreferredSize(new Dimension(40,40));
        buttonminusplus.setPreferredSize(new Dimension(40,40));
        buttondeg.setPreferredSize(new Dimension(40,40));
        buttoncomma.setPreferredSize(new Dimension(40,40));




        textField.setPreferredSize(new Dimension(200,40));
        textField.setFont(new Font("ABC", Font.PLAIN, 18));
        textField.setEditable(false);


        frame.add(textField);
        frame.add(buttonAC);
        frame.add(buttonminusplus);
        frame.add(buttondeg);
        frame.add(buttondiv);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(buttonmul);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(buttonminus);
        frame.add(buttonminus);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(buttonplus);
        frame.add(button0);
        frame.add(buttoncomma);
        frame.add(buttonequal);




        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {







                Setter("1");


            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                Setter("2");

            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                Setter("3");

            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Setter("4");

            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                Setter("5");

            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                Setter("6");

            }
        });

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                Setter("7");

            }
        });

        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                Setter("8");

            }
        });

        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Setter("9");


            }
        });

        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Setter("0");


            }
        });

        buttonplus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                

                operation = "+";
                number1 = textField.getText();

                a = Double.parseDouble(textField.getText());
                textField.setText(null);




            }
        });

        buttonminus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                operation = "-";
                number1 = textField.getText();

                a = Double.parseDouble(textField.getText());
                textField.setText(null);

            }
        });

        buttonmul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                operation = "*";
                number1 = textField.getText();

                a = Double.parseDouble(textField.getText());
                textField.setText(null);

            }
        });

        buttondiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                operation = "/";
                number1 = textField.getText();

                a = Double.parseDouble(textField.getText());
                textField.setText(null);

            }
        });

        buttonequal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {




                number2 = textField.getText();
                b = Double.parseDouble(number2);





                if (operation == "+"){
                    result = a+b;
                    if (result == (int)result)
                        textField.setText(""+(int)result);
                    else
                        textField.setText(""+result);



                }

                if (operation == "-"){
                    result = a-b;
                    if (result == (int)result)
                        textField.setText(""+(int)result);
                    else
                        textField.setText(""+result);


                }

                if (operation == "*"){
                    result = a*b;
                    if (result == (int)result)
                        textField.setText(""+(int)result);
                    else
                        textField.setText(""+result);


                }

                if (operation == "/"){


                    result = a/b;
                    if (result == (int)result)
                        textField.setText(""+(int)result);
                    else
                        textField.setText(""+result);


                }


                if (operation == "^") {
                    int oldnum = (int) a;
                    for (int i = 1; i < b; i++) {

                        a *= oldnum;
                    }
                    result = a;



                }

                if (result == (int)result)
                    textField.setText(""+(int)result);
                else
                    textField.setText(""+result);
            }
        });

        buttonAC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1 = null;
                number2 = null;
                textField.setText(null);
            }
        });

        buttondeg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation = "^";
                number1 = textField.getText();

                a = Integer.parseInt(textField.getText());
                textField.setText(null);
            }
        });

        buttonminusplus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double c = Double.parseDouble(textField.getText());

                if ( c > 0){

                    c = -(c);

                }

                else if (c < 0){

                    c = -(c);

                }

                if (c == (int)c)
                    textField.setText(""+(int)c);
                else
                    textField.setText(""+c);


            }
        });

        buttoncomma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (textField.getText().contains("."))
                    return;
                Setter(".");


            }
        });



        frame.setVisible(true);

    }




    public void Setter(String text){


        textField.setText(textField.getText() + text);

    }











}
