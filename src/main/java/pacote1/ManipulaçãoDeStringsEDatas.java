package pacote1;

import org.w3c.dom.Text;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class ManipulaçãoDeStringsEDatas {
    public static void main(String[] args) {
        //Olá, {nome}. Hoje é {dia-da-semana}, BOM DIA!

        String nome = "Rodrigo";


        // ISO 8601 - informar a data completa com dia, mês e ano
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        // informar o dia da semana.
        System.out.println(hoje.getDayOfWeek());
        //informar o dia da semana em português.
        Locale brasil = new Locale("pt", "BR");
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        String diaSemana = (hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        String saudação;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudação = "bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudação = "boa tarde";
            
        }else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudação = "boa noite";
        } else {
            saudação = "Olá.";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudação.toUpperCase());


        //executar o nome em letras maiusculas.
        System.out.println(nome.toUpperCase());
        //escrever o nome com letras minusculas
        System.out.println(nome.toLowerCase());
        //saber o comprimento do meu nome
        System.out.println(nome.length());

        String nome2 = "Bruna";
        //verificar se os nomes são iguais
        System.out.println(nome.equals(nome2));


    }
}
