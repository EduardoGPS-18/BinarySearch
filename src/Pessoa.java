public class Pessoa {
    public String nome;
    public int id;

    public static int countPerson = 0;

    public Pessoa(String nome) {
        this.nome = nome;

        this.id = countPerson;
        countPerson++;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                '}';
    }
}
