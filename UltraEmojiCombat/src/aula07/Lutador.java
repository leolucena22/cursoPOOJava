package aula07;

public final class Lutador { 
    // Atributos 
    private String nome;
    private String naturalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, empates, derrotas;

    // Métodos Especiais
    
    // Construtor
    public Lutador(String no, String na, int id, float al, float pe,
            int vit, int emp, int der) {
        this.setNome(no);
        this.setNaturalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vit);
        this.setEmpates(emp);
        this.setDerrotas(der);
    }
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNaturalidade() {
        return this.naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return this.categoria;
    }

    private void setCategoria() {
        if (this.getPeso() < 52.2) {
            this.categoria = "Inválido"; 
        } else if (this.getPeso() <= 70.3) {
            this.categoria = "Leve";
        } else if (this.getPeso() <= 83.9) {
            this.categoria = "Médio";
        } else if (this.getPeso() <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    // Métodos Públicos
    public void apresentar() {
        System.out.println("--------- APRESENTAÇÃO DO LUTADOR ---------");
        System.out.println("Nome:" + getNome());
        System.out.println("Nacionalidade: " + getNaturalidade());
        System.out.println("Idade: " + getIdade());
        System.out.println("Altura: " + getAltura());
        System.out.println("Peso: " + getPeso());
        System.out.println("Venceu: " + getVitorias());
        System.out.println("Empatou: " + getEmpates());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("-------------------------------------------\n");
    }

    public void status() {
        System.out.println("--------- INFOS ---------");
        System.out.println("Nome: " + getNome());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Peso: " + getPeso());
        System.out.println("Vitórias: " + getVitorias());
        System.out.println("Empates: " + getEmpates());
        System.out.println("Derrotas: " + getDerrotas());
        System.out.println("-------------------------");
    }

    public void ganharLuta() {
        this.setVitorias(getVitorias() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(getEmpates() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(getDerrotas() + 1);
    }

}
