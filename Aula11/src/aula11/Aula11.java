package aula11;

public class Aula11 {

    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Professor pr1 = new Professor();
        Bolsista b1 = new Bolsista();
        Tecnico t1 = new Tecnico();
        
        v1.setNome("Lucimar");
        v1.setIdade(56);
        v1.setSexo('F');
        System.out.println(v1.toString());
        
        System.out.println("--------------------------------------");
        
        a1.setNome("Samara");
        a1.setIdade(22);
        a1.setSexo('F');
        a1.setCurso("Educação Física");
        a1.setMatricula(123);
        a1.pagarMensalidade();
        System.out.println("Curso: " + a1.getCurso());
        System.out.println("Matrícula: " + a1.getMatricula());
        System.out.println(a1.toString());
        
        System.out.println("--------------------------------------");
        
        b1.setNome("Eliano");
        b1.setIdade(46);
        b1.setSexo('M');
        b1.setBolsa(true);
        b1.setCurso("Engenharia Elétrica");
        b1.setMatricula(321);
        System.out.println("Curso: " + b1.getCurso());
        System.out.println("Matrícula: " + b1.getMatricula());
        System.out.println(b1.toString());
        
        System.out.println("--------------------------------------");
        
        t1.setNome("Leonardo");
        t1.setIdade(20);
        t1.setSexo('M');
        t1.setCurso("Sistemas de Informação");
        //t1.setMatricula(777);
        t1.setRegistroProfissional(777);
        System.out.println("Curso: " + t1.getCurso());
        System.out.println("Registro Profissional: " + t1.getRegistroProfissional());
        System.out.println(t1.toString());
        
    }
}
