package pacote1;

public class LaçosNuméricos {
    public static void main(String[] args) {
        //para mostrar a sequência de números de 1 até 10
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        //para pular de dois em dois
        for (int i = 1; i <= 20; i+=2){
            System.out.println(i);
        }
        // multipicação dos termos.
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j<= 10; j++){
                System.out.println(j + "x" + i + " = " + j * i);
            }
        }

    }
}
