package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02Exercicios {
    public static void main(String[] args) {
        //Imprima todos os numeros de 0 à 100

        //Usando o while
        int contador = 0;
        while(contador <= 100){
            if(contador % 2 == 0){
                System.out.println("Com while " + contador);
            }
            contador++;
        }
        System.out.println();

        //Usando do while
        contador = 0;
        do{
            if(contador % 2 == 0){
                System.out.println("Com do while " + contador);
            }
            contador++;
        }while(contador <= 100);
        System.out.println();

        //Usando for
        for(int i = 1;i <= 100; i++){
            if(i % 2 == 0){
                System.out.println("Com for " + i);
            }
        }
    }
}
