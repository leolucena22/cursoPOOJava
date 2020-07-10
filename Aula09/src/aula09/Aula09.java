package aula09;

public class Aula09 {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[1];
        Livro[] l = new Livro[2];
        
        p[0] = new Pessoa("Leonardo", 20, 'M');
        l[0] = new Livro("Fogo e Gelo", "George R. R. Martin", 600, p[0]);
        l[1] = new Livro("Auto da compadecida", "Ariano Suassuna", 200, p[0]);
        
        l[0].abrir();
        l[0].folhear(599);
        l[0].voltarPag();
        System.out.println(l[0].detalhes());
    }
}
