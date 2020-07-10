package aula11;

public class Tecnico extends Aluno {
    private int registroProfissional;
    
    public void praticar(boolean prat) {
        if (prat) {
            System.out.println("O aluno: " + this.getNome() + "Está praticando");
        } else {
            System.out.println("O aluno: " + this.getNome() + "Está sem fazer nada");
        }
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
    
}
