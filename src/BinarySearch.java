import java.util.ArrayList;

public class BinarySearch {

    public static Pessoa binarySearch(Pessoa item, ArrayList<Pessoa> pessoas) {
        int indexBaixo = 0, indexAlto = pessoas.size() - 1;

        int count = 0;

        while (indexBaixo <= indexAlto) {
            int indexMeio = (indexBaixo + indexAlto) / 2;
            Pessoa pessoaAtual = pessoas.get(indexMeio);

            if(pessoaAtual.id == item.id) {
                System.out.println("Feito a busca binaria! Foram realizados " + count + " passos!");
                return item;
            } else if(pessoaAtual.id > item.id) {
                indexAlto = indexMeio - 1;
            } else {
                indexBaixo = indexMeio + 1;
            }
            count++;
        }
        return null;
    }
}
