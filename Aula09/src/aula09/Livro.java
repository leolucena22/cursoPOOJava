package aula09;

public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() {
        return "Livro{\n, " + "titulo=" + this.titulo + "\n, autor=" + this.autor + "\n,"
                + " totPaginas=" + this.totPaginas + "\n, pagAtual=" + this.pagAtual + "\n,"
                + " aberto=" + this.aberto + "\n, leitor=" + this.leitor.getNome()
                + "\n, idade" + leitor.getIdade() + "\n" + '}';
    }

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        setAberto(true);
    }

    @Override
    public void fechar() {
        setAberto(false);
    }

    @Override
    public void folhear(int f) {
        if (f > getTotPaginas()) {
            setPagAtual(0);
        } else {
            setPagAtual(f);
        }
    }

    @Override
    public void avancarPag() {
        setPagAtual(getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        setPagAtual(getPagAtual() - 1);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return this.totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return this.pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return this.aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return this.leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

}
