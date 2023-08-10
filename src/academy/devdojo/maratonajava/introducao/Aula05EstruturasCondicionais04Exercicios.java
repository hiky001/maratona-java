package academy.devdojo.maratonajava.introducao;

import javax.swing.*;

public class Aula05EstruturasCondicionais04Exercicios {
    public static void main(String[] args) {
        /*
        Exercício

Se salarioAnual > 0 && <= 34712 - Imposto de 9.7%

Se salarioAnual >= 34713 && <= 68507 - Imposto de 37.35%

Se salarioAnual >= 68508 - Imposto de 49.50%
         */

        double salarioAnual = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de seu salário anual:"));
        double valorASerPagoDeImposto;

        if (salarioAnual > 0 && salarioAnual <= 34712) {
            valorASerPagoDeImposto = salarioAnual * 0.097;
            System.out.println("O valor a ser pago de imposto e de 9.7% totalizando, com base no seu salário, em " + valorASerPagoDeImposto + " euros");
        } else {
            if (salarioAnual >= 34713 && salarioAnual <= 68507) {
                valorASerPagoDeImposto = salarioAnual * 0.3735;
                System.out.println("O valor a ser pago de imposto e de 37.35% totalizando, com base no seu salário, em " + valorASerPagoDeImposto + " euros");
            } else {
                valorASerPagoDeImposto = salarioAnual * 0.4950;
                System.out.println("O valor a ser pago de imposto e de 49.50% totalizando, com base no seu salário, em " + valorASerPagoDeImposto + " euros");
            }
        }

    }
}
