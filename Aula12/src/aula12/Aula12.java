package aula12;


public class Aula12 {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro ca = new Cachorro();
        Cobra co = new Cobra();
        Tartaruga ta = new Tartaruga();
        Goldfish go = new Goldfish();
        Arara ar = new Arara();
        
        c.locomover();
        c.emitirSom();
        ca.locomover();
        ca.emitirSom();
    }
}
