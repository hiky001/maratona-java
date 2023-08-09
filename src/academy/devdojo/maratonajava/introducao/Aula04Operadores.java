package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        double numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 / numero02;

        System.out.println("O resultado é " + (numero01 + numero02));
        System.out.println("O resultado é " + resultado + "\n");

        // % Resto da divisão
        int resto = 21 % 2;
        System.out.println("Resto é " + resto + "\n");

        //  <, >, <=, >=, == e !=
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezMenorIgualQueVinte = 10 <= 20;
        boolean isDezMaiorIgualQueVinte = 10 >= 20;
        boolean isDezDiferenteQueVinte = 10 != 20;

        int N1 = 5;
        double N2 = 5.0;

        boolean Mur = N1 == N2;

        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezIgualQueVinte " + isDezIgualQueVinte);
        System.out.println("isDezMenorIgualQueVinte " + isDezMenorIgualQueVinte);
        System.out.println("isDezMaiorIgualQueVinte " + isDezMaiorIgualQueVinte);
        System.out.println("isDezDiferenteQueVinte " + isDezDiferenteQueVinte);
        System.out.println("Mur é  " + Mur + "\n");

        // Operadores lógicos da Tabela Verdade &&(And), ||(Or), !(Not)
        int idade = 29;
        float salário = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salário >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salário >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta + "\n");

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 10000;
        float valorPlaystation = 5000;

        boolean isPlaystation5Compravel = valorTotalContaCorrente >= valorPlaystation || valorTotalContaPoupança >= valorPlaystation;
        System.out.println("isPlaystation5Compravel " + isPlaystation5Compravel + "\n");

        // Atribuição =, +=, -=, *=, /=, %=
        double bonus = 1800;
        double bonus2 = 1800;
        double bonus3 = 1800;
        double bonus4 = 1800;
        double bonus5 = 1800;

        bonus += 1000;
        bonus2 -= 1000;
        bonus3 *= 2;
        bonus4 /= 2;
        bonus5 %= 2;
        System.out.println("Bonus é de " + bonus);
        System.out.println("Bonus2 é de " + bonus2);
        System.out.println("Bonus3 é de " + bonus3);
        System.out.println("Bonus4 é de " + bonus4);
        System.out.println("Bonus5 é de " + bonus5 + "\n");

        //
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        System.out.println("Contador é " + contador + "\n");


    }
}
