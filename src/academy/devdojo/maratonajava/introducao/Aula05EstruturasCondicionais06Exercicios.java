package academy.devdojo.maratonajava.introducao;

import javax.swing.*;

public class Aula05EstruturasCondicionais06Exercicios {
    public static void main(String[] args) {
        /*
        Utilizando switch e dados os valores de 1 á 7, imprima se é dia útil ou final de semana.
        Considerando 1 como domingo
         */

        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia da semana de 1 à 7, sendo 1 domingo"));

        switch (dia){
            case 1:
            case 7:
                System.out.println("É final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("É dia útil");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
    }
}
