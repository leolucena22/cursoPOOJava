package aula10;

public class Aula10 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Leonardo");
        p2.setNome("Lucimar");
        p3.setNome("Samara");
        p4.setNome("Eliano");
        
        p1.setSexo('M');
        p2.setSexo('F');
        p3.setSexo('F');
        p4.setSexo('M');
        
        p1.setIdade(20);
        p2.setIdade(56);
        p3.setIdade(22);
        p4.setIdade(49);
        
        p2.setCurso("Sem estudo");
        p3.setSalario(2500.0f);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
