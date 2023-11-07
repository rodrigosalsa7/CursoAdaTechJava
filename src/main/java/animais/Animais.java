package animais;

public class Animais {
    public static void main(String[] args) {

        Cachorro jorge = new Cachorro("Jorge", "Misturado", "Joca", 25, 10, "Feliz");
        Cachorro Anitta = new Cachorro("Anitta", "Misturada", "Nitta", 8, 9, "Feliz");


        System.out.println("Anitta está: " + Anitta.pegar());
        System.out.println("Jorge está: ");
        jorge.acordar();
        System.out.println("Jorge está: ");
        jorge.latir();
        System.out.println("Jorge está: ");
        jorge.comer();
        System.out.println("Jorge está: " + jorge.pegar());
        System.out.println("Jorge está: ");
        jorge.descansar();

        System.out.println("Jorge está " + jorge.interagir("carinho"));

    }
}
