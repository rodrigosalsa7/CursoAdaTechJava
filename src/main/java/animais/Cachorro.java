package animais;

public class Cachorro {

    private String nome;
    private String raca;
    private String apelido;
    private double peso;
    private double idade;
    private String estadoEspirito;

    //construtores
    public Cachorro(){}
    public Cachorro(String nome, String raca, String apelido, double peso, double idade, String estadoEspirito) {
        this.nome = nome;
        this.raca = raca;
        this.apelido = apelido;
        this.peso = peso;
        this.idade = idade;
        this.estadoEspirito = estadoEspirito;
    }

    public void latir(){
        System.out.println("Au au au");
    }

    public void descansar(){
        System.out.println("Descansando depois de comer");
    }

   public String pegar(){
        return "Pegando a bolinha";
   }

   public void acordar(){
       System.out.println("Acordando...");
   }

   public void comer(){
       System.out.println("Comendo a minha ração");
   }
   public String interagir(String acao){
        switch (acao){
            case "carinho": this.estadoEspirito = "Feliz"; break;
            case "vai dormir": this.estadoEspirito = "Triste"; break;
            case "nada": this.estadoEspirito = "Neutro"; break;
            case "chamando para passear": this.estadoEspirito = "Muito Feliz"; break;
            default: this.estadoEspirito = "Neutro"; break;

        }

        return this.estadoEspirito;
   }

}
