package desafioaula;


public class DesafioAula {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(111);
        p1.setDono("Jubileu");
        p1.abrirConta("CP");
        p1.depositar(100);
        p1.sacar(250);
        p1.fecharConta();
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(222);
        p2.setDono("Creuza");
        p2.abrirConta("CC");
        p2.depositar(100);
        
        
        p1.extrato();
        p2.extrato();
    }
}
