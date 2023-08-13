package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for

        int count = 0;

        while(count < 10){
            System.out.println("while " + count);
            count++;
            /*
            count++ imprime de 0 à 9
            ++count imprime 1 à 10
            count += 1 imprime de 0 à 9
             */
        }

        count = 0;

        do {
            System.out.println("do while " + ++count);

        }while(count < 10);
        //do while sempre primeiro executa a ação, dps verifica a condição, por isso a contagem vai de 1 à 10 e por conta do ++count, primeiro
        //acrescenta à variável e dps imprime

        for(int i = 0; i < 10; i++){
            System.out.println("for " + i);
        }
    }
}
