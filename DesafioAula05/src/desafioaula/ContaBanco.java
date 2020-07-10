/*
Exercício – Duas pessoas querem abrir uma conta no banco, o Jubileu e a Creusa. O Jubileu optou por abrir uma conta poupança, e irá deposita 300 reais na sua conta. A Creusa, possuir mais dinheiro e quer depositar 500 reais em uma conta corrente. Para isso, eles precisam abrir uma conta no banco. Os atributos e métodos da ContaBanco estão expostos abaixo, com base nesse diagrama de classes.

Requisitos: 

1. O tipo da conta só aceita dois caracteres, cc e cp. Conta corrente e conta poupança, respectivamente.
2. Na hora de abrir conta, eu mudo o status de falso para verdadeiro. É nesse momento que decido qual conta vou abrir, e caso seja uma cp já recebe um presente de 150 reais, ou caso escolha abrir uma conta corrente, seu presente é de 50 reais.
3. Para fechar conta, o Jubileu ou a Creusa não vão poder ter dinheiro dentro da sua conta.
4. Para fazer um depósito ou sacar, a conta já deve ter sido aberta com status verdadeiro. No caso do saque, eu devo já ter dinheiro dentro, e o valor do saque não deve ser superior ao seu saldo.
5. A mensalidade vai ser cobrada diretamente do saldo. Na hora que for chamado a mensalidade, o cliente com cc pagará 12 reais, e o cliente com cp pagará 20 reias de mensalidade.
6. Você precisará usar o método getter e setter para TODOS os atributos.
7.  É necessário ter um método construtor, onde o seu status será definido como zero e o saldo definido como zero, pois a conta está fechada.
 */
package desafioaula;

public class ContaBanco {

    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Construct
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    //Getters and Setters
    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }

    //Métodos Personalizados
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);

        if ("CC".equals(t)) {
            this.setSaldo(50);
        } else if ("CP".equals(t)) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Não é possível fechar a conta, você ainda possui saldo");
        } else if (this.getSaldo() < 0) {
            System.out.println("Não é possível fechar a conta, você está em débito com o banco");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado com sucesso na conta de: " + this.getDono());
        } else {
            System.out.println("Impossível despositar :(");
        }
    }

    public void sacar(float d) {
        if (this.getStatus()) {
            if (this.getSaldo() >= d) {
                this.setSaldo(this.getSaldo() - d);
                System.out.println("Saque realizado com sucesso na conta de: " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque!");
            }
        } else {
            System.out.println("Impossível Sacar");
        }
    }

    public void pagarMensal() {
        float v = 0;
        if ("CC".equals(this.getTipo())) {
            v = 12;
        } else if ("CP".equals(this.getTipo())) {
            v = 20;
        } else if (this.getStatus()) {
            if (getSaldo() > v) {
                this.setSaldo(getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso por: "+ this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível pagar");
        }
    }

    public void extrato() {
        System.out.println("----------------------------------------");
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Nome do proprietário: " + this.getDono());
        System.out.println("Saldo da conta: " + this.getSaldo());
        System.out.println("Status da conta: " + this.getStatus());
    }

}
