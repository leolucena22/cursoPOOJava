package aula07;

import java.util.Random;

public class Luta {

    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // Métodos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    public void lutar() {
        if (this.isAprovada()) {
            System.out.println("---- DESAFIADO ----\n");
            getDesafiado().apresentar();
            System.out.println("---- DESAFIANTE ----\n");
            getDesafiante().apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            System.out.println("=========== RESULTADO DA LUTA ===========");
            switch (vencedor) {
                case 0: // Empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // Desafiado vence
                    System.out.println("Vitória do " + this.getDesafiado().getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // Desafiante vence 
                    System.out.println("Vitória do " + this.getDesafiante().getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            System.out.println("-------------------------------------------\n");
            
        } else {
            System.out.println("A luta não pode acontecer");
            System.out.println("-------------------------------------------\n");
        }
    }

    // Métodos Especiais
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiado() {
        return this.desafiado;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public int getRounds() {
        return this.rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return this.aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
