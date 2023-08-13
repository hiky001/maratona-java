package academy.devdojo.maratonajava.introducao;

import javax.swing.*;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double valorTotal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do carro que quer adquirir: "));
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
