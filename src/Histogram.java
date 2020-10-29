public class Histogram {
    public static void main(String[] args) {
        // valores de notas 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100
        int[] histogramValues = {0, 0, 1, 2, 4, 2, 1, 2, 4, 2, 2};
        System.out.println("Histograma de Notas da Turma");

        for(int i=0;i<histogramValues.length;i++){
            //gerar rótulo
            if(i==10){
                System.out.printf("%5d: ", 100);
            }
            else{
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
            }
            //imprime asteriscos proporcional ao valor de histogramValues[i]
            for(int asterisk=0;asterisk< histogramValues[i];asterisk++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
