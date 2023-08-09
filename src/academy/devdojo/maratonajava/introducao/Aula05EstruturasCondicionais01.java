package academy.devdojo.maratonajava.introducao;

import javax.swing.*;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade:"));
        boolean isVerificaIdadeParaComprarBebida = idade >= 18;

        if (isVerificaIdadeParaComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcoólica");
        } else {
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }

    }

}
