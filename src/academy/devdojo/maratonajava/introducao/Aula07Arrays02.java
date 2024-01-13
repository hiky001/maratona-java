package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {

        /*
        byte, short, int, long, float e double valor default 0
        char valor default '\u0000'
        boolean valor default false
        String valor default null
         */

        //Aqui vemos os valores default de cada tipo de lista print uma posição x de cada uma e ao printar apenas a lista, vemos o espaço em memoria dela

        String[] nomes = new String[3];
        double[] salario = new double[2];
        float[] bonus = new float[4];
        long[] dia = new long[3];
        int[] semana = new int[2];
        short[] mes = new short[7];
        byte[] hora = new byte[6];

        System.out.println(nomes[0] + " " + salario[1] + " " + bonus[2] + " " + dia[2] + " " + semana[0] + " " + mes[6] + " " + hora[5]);
        System.out.println(nomes + " " + salario + " " + bonus + " " + dia + " " + semana + " " + mes + " " + hora + "\n");

        nomes[0] = "Goku";
        nomes[1] = "Kurosaki Ichigo";
        nomes[2] = "Hinata Hiuga";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
