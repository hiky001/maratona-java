package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main (String[] args){
        /*
         * int cabe ate 2 bi de casas decimais 4 bits
         * double cabe 8 bits como o tipo long
         * float cabe ate 2 bi de casas decimais com ponto flutuante 4 bits
         * long cabe 8 bits como o tipo double
         * byte cabe ate 127/ -128
         * short cabe ate 32767
         * boolean valor
         *char é um caracter e tabela Ask valor unicode \ u e o codigo
         */
        // int, double, float, char, byte, short, long, boolean

        int age = 1000000000;
        double salarioDouble = 2000000000.000;
        float salarioFloat = 2.500F;
        long numeroGrande = 1000000000;
        byte idadeByte = 127;
        short idadeShort = 32767;
        boolean verdadeiro = true;
        char masculino = '\u0041';
        String nome = "Goku";

        System.out.println("Idade é " + age + " anos.");
        System.out.println(verdadeiro);
        System.out.println(masculino);
        System.out.println("Oi eu sou o " + nome);
    }
}
