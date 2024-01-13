package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        //Imprima os primeiros 25 numeros de um determinado valor. Por exemplo 50

        int valorMaximo = 50;
        for (int i = 0; i <= valorMaximo; i++) {
            if (i > 25){
                break;
                //o break so pode ser usado dentro de um laço de repetição ou switch
            }
            System.out.println(i);
        }
    }
}
