import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //Criar um arraylist de strings
        ArrayList<String> items = new ArrayList<>();

        //inserir itens no arraylist
        items.add("Bola"); //anexa no final da arraylist
        items.add(0,"feijão"); //insere feijão no indice 0
        items.set(0, "arroz"); //substitui no arraylist

        //exibe o conteudo do array usando indices
        System.out.print("Acesso ao ArrayList com índices: ");

        for (int i = 0; i < items.size(); i++) { //usar .size() ao inves de length
            System.out.printf(" %s", items.get(i)); // acessa elemento no índice/posição i
        }

        displayArrayList(items, "\nMostrando elementos com foreach: ");

        items.add("Caneta");
        items.add("Borracha");

        displayArrayList(items, "\nMostrando lista com mais dois elementos: ");

        System.out.printf("\nArroz %sestá na lista.", items.contains("arroz") ? "" : "não ");

        items.remove("arroz");

        displayArrayList(items, "\nMostrando lista sem arroz: ");

        items.add("Bola");

        displayArrayList(items, "\nSegunda bola: ");

        while(items.remove("Bola")) { } //chuncho pra tirar todas as bolas

        displayArrayList(items, "\nRemovendo as bolas: ");

        items.remove(1);

        displayArrayList(items, "\nRemovendo índice 1: ");

        System.out.printf("\nArroz %sestá na lista.", items.contains("arroz") ? "" : "não ");

    }

    public static void displayArrayList(ArrayList<String> items, String s) {
        System.out.printf(s);

        for (String item : items) { //para cada item no arraylist items
            System.out.printf(" %s", item); //imprima o item
        }
    }
}
