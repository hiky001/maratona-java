package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        // Maneiras de inicializar uma Array

        int [] numeros = new int[3];
        //Apenas declara o tamnha da array

        int [] numeros2 = {1,2,3,4,5};
        // Aqui ja cria a lista e coloca os valores dela junto, sendo o tamanho dela definido altomaticamente pelo numero de itens da lista

        // Pode ser assim tbm, porém igual a forma ácima
        int [] numeros3 = new int [] {5,4,3,2,1};

        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }

        System.out.println("\n");

        for (int num : numeros2) {
            System.out.println(num);
        }
    }
}
