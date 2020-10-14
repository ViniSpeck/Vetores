public class InitArray {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10; //constante como caixa alta e SERPENT_CASE
        int[] intArray = new int[ARRAY_LENGTH];// declarar um vetor de int de tamanho 10
        // int[] intArray = {51, 231, 32, 15, 63, 12, 54, 32, 65, 54};// declara vetor int e inicializa com valores
        //imprime um cabeçalho (%s%8s é o buffer entre strings)
        for (int i = 0; i < intArray.length; i++){
            intArray[i] = 2 + 2 * i;
        }
        System.out.printf("%s%8s\n", "Índice", "Valor");

        //para cada item do vetor (vetor.length -> tamanho do vetor)
        for (int i=0; i < intArray.length; i++){
            System.out.printf("%6d%8d\n", i, intArray[i]); //imprime o indice e o conteudo
        }
    }
}
