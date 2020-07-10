package aula11;

public class Bolsista extends Aluno {
    private boolean bolsa;
    
    public boolean renovarBolsa() {
        this.bolsa = true;
        return this.bolsa;
    }
    
    @Override
    public void pagarMensalidade() {
        if (isBolsa()) {
            System.out.println("Aluno Bolsista, não é necessário pagar mensalidade.");
        } else if (!renovarBolsa()) {
            System.out.println("Aluno não renovou a bolsa! É necessário pagar a mensalidade.");
        } else {
            System.out.println("Erro!");
        }
    }

    public boolean isBolsa() {
        return bolsa;
    }

    public void setBolsa(boolean bolsa) {
        this.bolsa = bolsa;
    }
    
}
