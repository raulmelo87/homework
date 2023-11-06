public class Aluno {
    //atributos
    private int matricula;
    private String curso;

    //métodos getters e setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setcurso(String curso) {
        this.curso = curso;
    }


    //método construtor
    public Aluno(int matricula, String curso) {
        this.matricula = matricula;
        this.curso = curso;
    }

    //toString
    @Override
    public String toString(){
        return "Aluno {" +
        "matrícula: " + matricula +
        ", curso: " + curso + "}";
    }
}