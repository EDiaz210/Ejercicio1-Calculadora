import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JTextField num2;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton xButton;
    private JTextField num1;
    public JPanel Calculadora;
    private JLabel resultado;
    private double numero1, numero2;




    public Calculadora() {

        num1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(num1.getText());
            }
        });

        num2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero2 = Double.parseDouble(num2.getText());
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double suma  = numero1 + numero2;
                resultado.setText(String.valueOf(suma));
            }
        });


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double resta = numero1 - numero2;
                resultado.setText(String.valueOf(resta));
            }
        });


        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double multiplicacion = numero1 * numero2;
                resultado.setText(String.valueOf(multiplicacion));
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(numero2 == 0){
                    resultado.setText("Syntax  ERROR");
                }else {
                    double division = numero1 / numero2;
                    resultado.setText(String.valueOf(division));
                }
            }
        });
    }
}
