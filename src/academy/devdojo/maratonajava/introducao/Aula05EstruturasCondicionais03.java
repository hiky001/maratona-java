package academy.devdojo.maratonajava.introducao;

import javax.swing.*;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Doar se salario > 5000
        //Atribuir a uma variavel cujo tipo tem que bater com as condições = (Condição) ? verdadeiro : falso

        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de seu salário:"));

        String resultado = (salario > 5000) ? "Eu vou doar 500 reais para o DevDojo" : "Ainda não tenho condições para doar";
        System.out.println(resultado);
    }
}
