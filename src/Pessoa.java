public class Pessoa {
    //atributos
    private String nome;  
    private int idade;

    public void mudarNome(String nome){this.nome = nome};

    //métodos getters and setters
    public String getName() {
        return nome;
    }
    public void setName(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    //método construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //toString
    @Override
    public String toString() {
        return ("Nome " + nome + " , idade: " + idade);
    }
}
