package pacote1;

public class OperaçõesLógicas {
    public static void main(String[] args) {
        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;
        System.out.println(vamosAPraia);

        String mensagem = fimDeSemana ? "É fim de semana, vamos a praia se estiver sol." : "Não é fim de semana, vamos ficar em casa.";
        System.out.println(mensagem);

    }
}
