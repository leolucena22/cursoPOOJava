package aula04;

public class Aula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("Compactor Top 2000", "Verde", 0.7f);
        c1.status();
        System.out.println("-------------------------------------");
        Caneta c2 = new Caneta("BIC", "Roxo", 1f);
        c2.status();
        /*
        c1.setModelo("BIC");
        c1.setPonta(0.5f);
        
        System.out.println("Tenho uma caneta na cor: "+ c1.getModelo()+ 
                "\nCom uma ponta: "+ c1.getPonta());
        */
    }
}
