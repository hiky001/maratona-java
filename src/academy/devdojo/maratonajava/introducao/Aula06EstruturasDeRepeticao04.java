package academy.devdojo.maratonajava.introducao;

import javax.swing.*;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        /*
        Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        Condição valorParcela >= 1000
         */

        double valorCarro = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do carro que quer adquirir: "));

        for (int parcela = 1; parcela <= 1000 ; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela >= 1000){
                System.out.println("Parcela " + parcela + " R$ " + valorParcela);
            }else {
                break;
            }
        }
    }
}