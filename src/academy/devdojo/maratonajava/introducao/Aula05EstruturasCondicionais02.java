package academy.devdojo.maratonajava.introducao;

import javax.swing.*;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        /*
        Regras:
        idade < 15 Categoria Infantil
        idade >= 15 && idade < 18  Categoria Juvenil
        idade >= 18 Categoria Adulto
         */

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade:"));
        boolean isCategoriaInfantil = idade < 15;
        boolean isCategoriaJuvenil = idade >= 15 && idade < 18;

        if (isCategoriaInfantil){
            System.out.println("Você está na Categoria Infantil");
        }else{
            if (isCategoriaJuvenil){
                System.out.println("Você está na Categoria Juvenil");
            }else{
                System.out.println("Você está na Categoria Adulto");
            }
        }
        System.out.println("teste");
    }
}
