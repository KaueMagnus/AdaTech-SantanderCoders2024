import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class stringsAndDates {
    public static void main(String[] args) {

        // Olá, {nome}. Hoje é dia {dia-da-semana}, BOM DIA.

        String nome = "Kaue";

        // ISO 8601
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

        String saudacao;

        LocalDateTime agora = LocalDateTime.now();

        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "bom dia!";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "boa tarde!";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "boa noite!";
        } else {
            saudacao = "Oi";
        }

        System.out.printf("Olá %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());
    }
}
