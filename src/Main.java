import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Random rand = new Random();

        String[] names = {"Marco", "Julio", "Pedro", "Antonio", "Carlos", "Amaral", "Antony", "Medro", "Julio", "Maria", "Maiara", "Paulo", "Sergio", "Toca", "Marta", "Armando", "Chorao", "Julio"};


        for (String name: names) {
            pessoas.add(new Pessoa(name));
        }

        Pessoa selecionada = pessoas.get(rand.nextInt(pessoas.size()-1));

        Pessoa pessoaBuscada = BinarySearch.binarySearch(selecionada, pessoas);

        System.out.println("A lista contem " + pessoas.size());
        System.out.println("A pessoas a ser buscada é " + selecionada.toString());
        System.out.println("A pessoa encontrada foi " + pessoaBuscada.toString());
    }
}
