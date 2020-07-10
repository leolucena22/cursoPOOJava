package aula10;

public class Aluno extends Pessoa {

    private long matr;
    private String curso;

    public void cancelarMatr() {
        System.out.println("Matrícula será cancelada!");
    }

    public long getMatr() {
        return matr;
    }

    public void setMatr(long matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void dadosCad() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexi: " + this.getSexo());
        System.out.println("Matrícula: " + this.getMatr());
        System.out.println("Curso: " + this.getCurso());
    }

}
