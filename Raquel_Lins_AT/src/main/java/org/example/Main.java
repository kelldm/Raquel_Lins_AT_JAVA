package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    //AT JAVA Raquel Lins
    //Baseado nos exercícios feitos em aula ;)

    private static JTextField real1 = new JTextField();
    private static JTextField imaginario1 = new JTextField();
    private static JTextField real2 = new JTextField();
    private static JTextField imaginario2 = new JTextField();
    private static JTextArea resultado = new JTextArea();

    public static void main(String[] args) {
        ambienteGrafico();
    }
    private static void ambienteGrafico() {
        JFrame frame = new JFrame("Calculadora de Números Complexos - AT JAVA");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550,400);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6,2));

        resultado.setEnabled(false);
        resultado.setEditable(false);

        real1.setFont((new Font("Arial", Font.PLAIN, 30)));
        imaginario1.setFont((new Font("Arial", Font.PLAIN, 30)));
        imaginario2.setFont((new Font("Arial", Font.PLAIN, 30)));
        real2.setFont((new Font("Arial", Font.PLAIN, 30)));
        resultado.setFont((new Font("Arial", Font.PLAIN, 30)));

        JLabel label1 = new JLabel("Insira seu N. real 1:");
        label1.setFont((new Font("Arial", Font.BOLD, 20)));
        JLabel labelImaginario1 = new JLabel("Insira seu N. imaginário 1:");
        labelImaginario1.setFont((new Font("Arial", Font.BOLD, 20)));
        label1.setFont((new Font("Arial", Font.BOLD, 20)));
        JLabel label2 = new JLabel("Insira seu N. real 2:");
        label2.setFont((new Font("Arial", Font.BOLD, 20)));
        JLabel labelImaginario2 = new JLabel("Insira seu N. imaginário 2:");
        labelImaginario2.setFont((new Font("Arial", Font.BOLD, 20)));
        JLabel label3 = new JLabel("RESULTADO:");
        label3.setFont((new Font("Arial", Font.BOLD, 20)));

        panel.add(label1);
        panel.add(real1);
        panel.add(labelImaginario1);
        panel.add(imaginario1);
        panel.add(label2);
        panel.add(real2);
        panel.add(labelImaginario2);
        panel.add(imaginario2);
        panel.add(label3);
        panel.add(resultado);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 1));
        JButton btnSoma = new JButton("+");
        btnSoma.setFont(new Font("Arial", Font.PLAIN, 40));
        JButton btnSubtracao = new JButton("-");
        btnSubtracao.setFont(new Font("Arial", Font.PLAIN, 50));
        JButton btnModulo = new JButton("| |");
        btnModulo.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonPanel.add(btnSoma);
        buttonPanel.add(btnSubtracao);
        buttonPanel.add(btnModulo);
        panel.add(buttonPanel);

        frame.add(panel);
        frame.setVisible(true);

        btnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcula("soma");
            }
        });

        btnSubtracao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcula("subtracao");
            }
        });

        btnModulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcula("modulo");
            }
        });


        frame.add(panel);

        frame.setVisible(true);
    }

    private static void calcula(String operacao) {
        try {
            double real1 = Double.parseDouble(Main.real1.getText());
            double imaginaria1 = Double.parseDouble(imaginario1.getText());
            double real2 = Double.parseDouble(Main.real2.getText());
            double imaginaria2 = Double.parseDouble(imaginario2.getText());

            NumComplexo num1 = new NumComplexo(real1, imaginaria1);
            NumComplexo num2 = new NumComplexo(real2, imaginaria2);

            switch (operacao) {
                case "soma":
                    resultado.setText(Calculadora.somar(num1, num2));
                    break;
                case "subtracao":
                    resultado.setText(Calculadora.subtrair(num1, num2));
                    break;
                case "modulo":
                    resultado.setText(Calculadora.modulo(num1));
                    break;
            }
        } catch (NumberFormatException ex) {
            resultado.setText(" Erro :( Tente novamente.");
        }
    }
}